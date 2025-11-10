package com.rslover521.furnituresoplenty.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 * TEXTURING COLORS (hue, saturation, brightness) DIFFERENCES FROM BIRCH:
 * fir: (0, -55, -30) 
 * pine: (64, 37, -51) 
 * maple: (-34, 0, -39) 
 * redwood: (-44, 70, -20) 
 * mahogany: (-84, 30, -24) 
 * jacaranda: (0, -100, 30) 
 * palm: (7, 61, -22) 
 * willow: (79, -23, --27) 
 * dead: (-180, -100, -20) 
 * magic: (-163, 0, 0) 
 * umbran: (-160, 5, -65) 
 * hellbark: (-132, 34, -93) 
 * empyreal: (-132, 34, -52)
 * 
*/

public class WoodTextureRecolorer {

    private static final String[] WOOD_TYPES = {
            "fir", "pine", "maple", "redwood", "mahogany", "jacaranda",
            "palm", "willow", "dead", "magic", "umbran", "hellbark", "empyreal"
    };

    // Map each wood type to its target color (example RGBs, adjust to your palette)
    private static final Map<String, Color> WOOD_COLORS = new HashMap<>();
    static {
        WOOD_COLORS.put("fir", new Color(120, 80, 70));          // a little gray
        WOOD_COLORS.put("pine", new Color(80, 120, 60));         // more green
        WOOD_COLORS.put("maple", new Color(120, 70, 40));        // darker, like jungle but darker
        WOOD_COLORS.put("redwood", new Color(160, 30, 30));      // more red, pure red tone
        WOOD_COLORS.put("mahogany", new Color(160, 60, 90));     // a bit more light magenta
        WOOD_COLORS.put("jacaranda", new Color(240, 240, 240));  // mostly white
        WOOD_COLORS.put("palm", new Color(200, 180, 70));        // more yellow
        WOOD_COLORS.put("willow", new Color(60, 90, 50));        // darker green
        WOOD_COLORS.put("dead", new Color(120, 120, 120));       // less contrast, gray-ish
        WOOD_COLORS.put("magic", new Color(90, 50, 140));        // unchanged
        WOOD_COLORS.put("umbran", new Color(40, 40, 80));        // darker blue
        WOOD_COLORS.put("hellbark", new Color(60, 30, 80));      // darker purple
        WOOD_COLORS.put("empyreal", new Color(200, 180, 220));   // unchanged
    }

    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/resources/assets/furnituresoplenty/textures/block/birch_table.png"); // base Birch table
        BufferedImage baseImage = ImageIO.read(inputFile);

        File outputFolder = new File("src/main/resources/assets/furnituresoplenty/textures/recolored");
        if (!outputFolder.exists()) outputFolder.mkdirs();

        for (String wood : WOOD_TYPES) {
            Color targetColor = WOOD_COLORS.get(wood);
            BufferedImage recolored = recolorTexture(baseImage, targetColor);
            File outputFile = new File(outputFolder, wood + "_table.png");
            ImageIO.write(recolored, "png", outputFile);
            System.out.println("Generated: " + outputFile.getName());
        }

        System.out.println("All textures recolored!");
    }

    private static BufferedImage recolorTexture(BufferedImage image, Color targetColor) {
        int width = image.getWidth();
        int height = image.getHeight();
        BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // Compute target hue in HSB
        float[] targetHSB = Color.RGBtoHSB(targetColor.getRed(), targetColor.getGreen(), targetColor.getBlue(), null);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int argb = image.getRGB(x, y);
                Color pixel = new Color(argb, true);

                // Skip fully transparent pixels
                if (pixel.getAlpha() == 0) {
                    result.setRGB(x, y, argb);
                    continue;
                }

                // Convert pixel to HSB
                float[] hsb = Color.RGBtoHSB(pixel.getRed(), pixel.getGreen(), pixel.getBlue(), null);

                // Replace hue with target hue, keep original saturation & brightness
                int newRGB = Color.HSBtoRGB(targetHSB[0], hsb[1], hsb[2]);
                Color newColor = new Color(newRGB);
                // Preserve alpha
                Color finalColor = new Color(newColor.getRed(), newColor.getGreen(), newColor.getBlue(), pixel.getAlpha());
                result.setRGB(x, y, finalColor.getRGB());
            }
        }
        return result;
    }
}
