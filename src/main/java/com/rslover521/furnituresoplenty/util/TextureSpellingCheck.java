package com.rslover521.furnituresoplenty.util;

import java.io.File;
import java.util.ArrayList;

public class TextureSpellingCheck {
    public static void run() {
        String folderPath = "src/main/resources/assets/furnituresoplenty/textures/block";
        File root = new File(folderPath);

        ArrayList<File> allTextures = listAllPngFiles(root);
        ArrayList<String> invalidFiles = new ArrayList<>();
        int validCount = 0;

        if (allTextures.isEmpty()) {
            System.out.println("⚠️ No PNG files found in: " + folderPath);
            return;
        }

        for (File textureFile : allTextures) {
            boolean isValid = isValidTexture(textureFile);
            if (isValid) validCount++;
            else invalidFiles.add(textureFile.getPath());
        }

        System.out.println("✅ Valid textures: " + validCount);
        System.out.println("❌ Invalid textures: " + invalidFiles.size());
        if (!invalidFiles.isEmpty()) {
            System.out.println("\nInvalid texture files:");
            for (String invalid : invalidFiles) {
                System.out.println(" - " + invalid);
            }
        } else {
            System.out.println("\n🎉 All textures are valid!");
        }
    }

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

    public static boolean isValidTexture(File textureFile) {
        String[] acceptedPrefixes = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
        };

        String name = textureFile.getName().toLowerCase().replace(".png", "");
        String[] parts = name.split("_");

        if (parts.length == 0) return false;

        for (String prefix : acceptedPrefixes) {
            if (parts[0].equals(prefix)) {
                return true;
            }
        }
        return false;
    }
}