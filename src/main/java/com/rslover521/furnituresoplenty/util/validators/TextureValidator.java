package com.rslover521.furnituresoplenty.util.validators;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public class TextureValidator {
    public static void main(String[] args) {
        String folderPath = "src/main/resources/assets/furnituresoplenty/textures/block";
        File root = new File(folderPath);

        // List all .png textures in the folder (recursive)
        ArrayList<File> allTextures = listAllPngFiles(root);
        HashSet<String> textureNames = new HashSet<>();
        for (File f : allTextures) {
            String name = f.getName().toLowerCase().replace(".png", "");
            textureNames.add(name);
        }

        // Wood types and furniture types
        String[] woodTypes = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
        };

        String[] registryTypes = {
            "basin", "bath", "light_ceiling_fan", "dark_ceiling_fan", "chair", "crate",
            "cutting_board", "desk", "drawer", "kitchen_cabinetry", "kitchen_drawer",
            "kitchen_sink", "kitchen_storage_cabinet", "lattice_fence_gate", "lattice_fence",
            "mail_box", "storage_cabinet", "storage_jar", "table", "toilet"
        };

        // Check for missing combinations
        ArrayList<String> missingTextures = new ArrayList<>();
        for (String wood : woodTypes) {
            for (String type : registryTypes) {
                String expectedFile = wood + "_" + type;
                if (!textureNames.contains(expectedFile)) {
                    missingTextures.add(expectedFile + ".png");
                }
            }
        }

        // Summary output
        System.out.println("Total textures found: " + allTextures.size());
        System.out.println("Expected textures: " + (woodTypes.length * registryTypes.length));
        System.out.println("Missing textures: " + missingTextures.size());
        if (!missingTextures.isEmpty()) {
            System.out.println("\nList of missing textures:");
            for (String missing : missingTextures) {
                System.out.println(" - " + missing);
            }
        } else {
            System.out.println("\n🎉 All expected textures are present!");
        }

        TextureSpellingCheck.run();
    }

    // Recursive function to list all PNG files
    public static ArrayList<File> listAllPngFiles(File dir) {
        ArrayList<File> pngs = new ArrayList<>();
        File[] files = dir.listFiles();
        if (files == null) return pngs;

        for (File f : files) {
            if (f.isDirectory()) {
                pngs.addAll(listAllPngFiles(f));
            } else if (f.getName().toLowerCase().endsWith(".png")) {
                pngs.add(f);
            }
        }
        return pngs;
    }
}
