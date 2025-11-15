package com.rslover521.furnituresoplenty.util.miscellaneous;

import java.io.IOException;
import java.nio.file.*;
import java.util.regex.Pattern;

/**
 * Deletes old storage cabinet model JSONs from:
 * src/main/resources/assets/furnituresoplenty/models/block
 *
 * Rules:
 * 1️⃣ %WOOD%_storage_cabinet_%TYPE%.json -> DELETE
 * 2️⃣ %WOOD%_cabinet_%TYPE%.json -> KEEP
 * 3️⃣ %WOOD%_kitchen_storage_cabinet_%TYPE%.json -> KEEP
 */
public class DeleteOldStorageCabinetModels {

    private static final Path MODELS_DIR = Paths.get("src/main/resources/assets/furnituresoplenty/models/block");

    // Regex patterns
    private static final Pattern DELETE_PATTERN = Pattern.compile("^[a-z0-9_]+_storage_cabinet_[a-z0-9_]+\\.json$");
    private static final Pattern KEEP_PATTERN_1 = Pattern.compile("^[a-z0-9_]+_cabinet_[a-z0-9_]+\\.json$");
    private static final Pattern KEEP_PATTERN_2 = Pattern.compile("^[a-z0-9_]+_kitchen_storage_cabinet_[a-z0-9_]+\\.json$");

    public static void main(String[] args) throws IOException {
        if (!Files.exists(MODELS_DIR)) {
            System.out.println("❌ Models directory not found: " + MODELS_DIR.toAbsolutePath());
            return;
        }

        int totalChecked = 0;
        int deleted = 0;

        try (var stream = Files.walk(MODELS_DIR)) {
            for (Path file : (Iterable<Path>) stream.filter(Files::isRegularFile)::iterator) {
                String name = file.getFileName().toString();
                if (!name.endsWith(".json")) continue;
                totalChecked++;

                if (shouldDelete(name)) {
                    Files.delete(file);
                    deleted++;
                    System.out.println("🗑 Deleted: " + file);
                }
            }
        }

        System.out.println("\n✅ Finished! Checked " + totalChecked + " files, deleted " + deleted + ".");
    }

    private static boolean shouldDelete(String fileName) {
        // Keep the latest versions
        if (KEEP_PATTERN_1.matcher(fileName).matches()) return false;
        if (KEEP_PATTERN_2.matcher(fileName).matches()) return false;
        // Delete old storage cabinet JSONs
        return DELETE_PATTERN.matcher(fileName).matches();
    }
}
