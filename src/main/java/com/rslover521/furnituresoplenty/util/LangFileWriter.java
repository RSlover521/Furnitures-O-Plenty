package com.rslover521.furnituresoplenty.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Generates en_us.json and zh_cn.json for Furnitures O' Plenty.
 * Uses updated woodTypes and registryTypes arrays.
 * Handles multi-word registry types naturally for Chinese.
 */
public class LangFileWriter {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        String modId = "furnituresoplenty";
        Path langPath = Path.of("src/main/resources/assets/" + modId + "/lang");

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

        // English
        writeLangFile(langPath, modId, woodTypes, registryTypes, "en_us", LangFileWriter::englishMapping);

        // Chinese
        writeLangFile(langPath, modId, woodTypes, registryTypes, "zh_cn", LangFileWriter::chineseMapping);
    }

    public static void writeLangFile(Path outputDir, String modId, String[] woodTypes, String[] registryTypes,
                                     String langCode, TranslationMapper mapper) {
        Map<String, String> entries = new LinkedHashMap<>();

        for (String wood : woodTypes) {
            for (String type : registryTypes) {
                String key = "block." + modId + "." + wood + "_" + type;
                String value = mapper.map(wood, type);
                entries.put(key, value);
            }
        }

        try {
            Files.createDirectories(outputDir);
            Path file = outputDir.resolve(langCode + ".json");

            try (FileWriter writer = new FileWriter(file.toFile())) {
                GSON.toJson(entries, writer);
            }

            System.out.println("[LangFileWriter] ✅ Generated " + file.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("[LangFileWriter] ❌ Failed to write " + langCode + ".json: " + e.getMessage());
        }
    }

    /** English translation */
    private static String englishMapping(String wood, String type) {
        return capitalizeWords(wood) + " " + capitalizeWords(type);
    }

    /** Chinese translation with natural phrasing */
    private static String chineseMapping(String wood, String type) {
        String woodCn = woodToChinese(wood);
        String typeCn = typeToChineseNatural(type);
        return woodCn + typeCn;  // Combine without spaces
    }

    private static String capitalizeWords(String input) {
        String[] parts = input.split("_");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (!parts[i].isEmpty()) {
                sb.append(parts[i].substring(0, 1).toUpperCase(Locale.ROOT))
                  .append(parts[i].substring(1));
                if (i < parts.length - 1) sb.append(" ");
            }
        }
        return sb.toString();
    }

    // --- Natural Chinese mappings ---
    private static String woodToChinese(String wood) {
        return switch (wood) {
            case "fir" -> "冷杉";
            case "pine" -> "松木";
            case "maple" -> "枫木";
            case "redwood" -> "红杉";
            case "mahogany" -> "桃花心";
            case "jacaranda" -> "蓝花楹";
            case "palm" -> "棕榈";
            case "willow" -> "柳木";
            case "dead" -> "枯死";
            case "magic" -> "魔法";
            case "umbran" -> "暗影";
            case "hellbark" -> "地狱皮";
            case "empyreal" -> "重霄";
            default -> wood;
        };
    }

    /** Combine multi-word registry types into natural Chinese phrases */
    private static String typeToChineseNatural(String type) {
        return switch (type) {
            case "basin" -> "水池";
            case "bath" -> "浴缸";
            case "light_ceiling_fan" -> "吊顶风扇";
            case "dark_ceiling_fan" -> "暗色吊顶风扇";
            case "chair" -> "椅";
            case "crate" -> "板条箱";
            case "cutting_board" -> "切菜板";
            case "desk" -> "书桌";
            case "drawer" -> "抽屉";
            case "kitchen_cabinetry" -> "厨房橱柜";
            case "kitchen_drawer" -> "厨房抽屉";
            case "kitchen_sink" -> "厨房水池";
            case "kitchen_storage_cabinet" -> "厨房储物柜";
            case "lattice_fence_gate" -> "格子栅栏门";
            case "lattice_fence" -> "格子栅栏";
            case "mail_box" -> "邮箱";
            case "storage_cabinet" -> "储物柜";
            case "storage_jar" -> "储物罐";
            case "table" -> "桌";
            case "toilet" -> "马桶";
            default -> capitalizeWords(type).replace("_", "");
        };
    }

    @FunctionalInterface
    interface TranslationMapper {
        String map(String wood, String type);
    }
}
