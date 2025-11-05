package com.rslover521.furnituresoplenty.util;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class EmptyJsonCleaner {

    public static void main(String[] args) throws IOException {
        Path root = Path.of("src/main/resources/");

        if (!Files.exists(root)) {
            System.err.println("❌ Directory does not exist: " + root);
            return;
        }

        Files.walkFileTree(root, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file.toString().endsWith(".json")) {
                    if (isJsonEmpty(file)) {
                        Files.delete(file);
                        System.out.println("🗑️ Deleted empty JSON: " + file);
                    }
                }
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("✅ Empty JSON cleanup complete!");
    }

    private static boolean isJsonEmpty(Path file) {
        try {
            long size = Files.size(file);
            if (size == 0) return true; // Empty file

            List<String> lines = Files.readAllLines(file);
            String combined = String.join("", lines).trim();

            // ✅ Treat `{}`, `[]`, or whitespace as empty JSON
            return combined.equals("{}") ||
                   combined.equals("[]") ||
                   combined.isBlank();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
