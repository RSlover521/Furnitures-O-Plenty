package com.rslover521.furnituresoplenty.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class AssetJsonGenerator {

    private static final String MODID = "furnituresoplenty";

    private static final String[] woodTypes = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    private static final String[] registryTypes = {
            "basin", "bath", "light_ceiling_fan", "dark_ceiling_fan", "chair", "stool", "crate",
            "cutting_board", "desk", "drawer", "kitchen_cabinetry", "kitchen_drawer",
            "kitchen_sink", "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence",
            "mail_box", "storage_cabinet", "storage_jar", "table", "toilet"
    };

    // Map MrCrayfish furniture name -> block model reference
    private static final Map<String, String> MRCRAYFISH_MODELS = Map.of(
            "chair", "mrcrayfishfurniture:block/chair",
            "stool", "mrcrayfishfurniture:block/stool",
            "table", "mrcrayfishfurniture:block/table",
            "toilet", "mrcrayfishfurniture:block/toilet"
            // add more as needed
    );

    private static final File BLOCKSTATE_DIR =
            new File("src/main/resources/assets/" + MODID + "/blockstates");
    private static final File BLOCK_MODEL_DIR =
            new File("src/main/resources/assets/" + MODID + "/models/block");
    private static final File ITEM_MODEL_DIR =
            new File("src/main/resources/assets/" + MODID + "/models/item");

    public static void main(String[] args) {
        BLOCKSTATE_DIR.mkdirs();
        BLOCK_MODEL_DIR.mkdirs();
        ITEM_MODEL_DIR.mkdirs();

        for (String wood : woodTypes) {
            for (String type : registryTypes) {
                boolean isMrCrayfish = MRCRAYFISH_MODELS.containsKey(type);
                FurnitureType fType = getFurnitureType(type);

                if (isMrCrayfish) {
                    String mcModel = MRCRAYFISH_MODELS.get(type);
                    generateBlockstateForFurniture(wood, type, mcModel, fType);
                    generateBlockModelForFurniture(wood, type, mcModel, fType);
                    generateItemModelForFurniture(wood, type, mcModel);
                } else {
                    generateBlockstateForFurniture(wood, type, null, fType);
                    generateBlockModelForFurniture(wood, type, null, fType);
                    generateItemModelForFurniture(wood, type, null);
                }
            }
        }

        System.out.println("\n✅ All blockstate, block model, and item model JSONs generated!");
    }

    // ---------------- Furniture Type Detection ----------------
    enum FurnitureType {
        DEFAULT,       // cube_all
        ROTATING,      // chairs, stools
        CUSTOM_MODEL   // tables, desks, drawers
    }

    private static FurnitureType getFurnitureType(String type) {
        switch (type) {
            case "chair":
            case "stool":
                return FurnitureType.ROTATING;
            case "table":
            case "drawer":
            case "desk":
                return FurnitureType.CUSTOM_MODEL;
            default:
                return FurnitureType.DEFAULT;
        }
    }

    // ---------------- JSON Generators ----------------

    private static void generateBlockstateForFurniture(String wood, String type, String externalModel, FurnitureType fType) {
        String json;
        String pathModel = (externalModel != null) ? externalModel : MODID + ":block/" + wood + "_" + type;

        switch (fType) {
            case ROTATING -> json = """
                    {
                      "variants": {
                        "facing=north": { "model": "%1$s", "y": 0 },
                        "facing=east":  { "model": "%1$s", "y": 90 },
                        "facing=south": { "model": "%1$s", "y": 180 },
                        "facing=west":  { "model": "%1$s", "y": 270 }
                      }
                    }
                    """.formatted(pathModel);
            case CUSTOM_MODEL, DEFAULT -> json = """
                    {
                      "variants": {
                        "": { "model": "%1$s" }
                      }
                    }
                    """.formatted(pathModel);
            default -> throw new IllegalStateException("Unexpected FurnitureType: " + fType);
        }

        write(new File(BLOCKSTATE_DIR, wood + "_" + type + ".json"), json);
    }

    private static void generateBlockModelForFurniture(String wood, String type, String externalModel, FurnitureType fType) {
        String json;

        if (externalModel != null) {
            // Just point to MrCrayfish model for block model
            json = """
                    {
                      "parent": "%1$s"
                    }
                    """.formatted(externalModel);
        } else {
            switch (fType) {
                case ROTATING, CUSTOM_MODEL -> json = """
                        {
                          "parent": "furnituresoplenty:block/%1$s_%2$s"
                        }
                        """.formatted(wood, type);
                case DEFAULT -> json = """
                        {
                          "parent": "minecraft:block/cube_all",
                          "textures": {
                            "all": "furnituresoplenty:block/%1$s_%2$s"
                          }
                        }
                        """.formatted(wood, type);
                default -> throw new IllegalStateException("Unexpected FurnitureType: " + fType);
            }
        }

        write(new File(BLOCK_MODEL_DIR, wood + "_" + type + ".json"), json);
    }

    private static void generateItemModelForFurniture(String wood, String type, String externalModel) {
        String pathModel = (externalModel != null) ? externalModel : MODID + ":block/" + wood + "_" + type;
        String json = """
                {
                  "parent": "%1$s"
                }
                """.formatted(pathModel);

        write(new File(ITEM_MODEL_DIR, wood + "_" + type + ".json"), json);
    }

    // ---------------- Utility ----------------

    private static void write(File file, String json) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(json);
            System.out.println("Generated: " + file.getPath());
        } catch (IOException e) {
            System.err.println("Error writing: " + file.getPath());
            e.printStackTrace();
        }
    }
}
