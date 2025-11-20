package com.rslover521.furnituresoplenty.util.miscellaneous;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WoodTextureRecolorer {

    private static final Map<String, float[]> WOOD_HSL_ADJUSTMENTS = new HashMap<>();

    static {
        WOOD_HSL_ADJUSTMENTS.put("fir", new float[]{0, -55, -30});
        WOOD_HSL_ADJUSTMENTS.put("pine", new float[]{64, 37, -51});
        WOOD_HSL_ADJUSTMENTS.put("maple", new float[]{-34, 0, -39});
        WOOD_HSL_ADJUSTMENTS.put("redwood", new float[]{-44, 70, -20});
        WOOD_HSL_ADJUSTMENTS.put("mahogany", new float[]{-84, 30, -24});
        WOOD_HSL_ADJUSTMENTS.put("jacaranda", new float[]{0, -100, 30});
        WOOD_HSL_ADJUSTMENTS.put("palm", new float[]{7, 61, -22});
        WOOD_HSL_ADJUSTMENTS.put("willow", new float[]{79, -23, -27});
        WOOD_HSL_ADJUSTMENTS.put("dead", new float[]{-180, -100, -20});
        WOOD_HSL_ADJUSTMENTS.put("magic", new float[]{-163, 0, 0});
        WOOD_HSL_ADJUSTMENTS.put("umbran", new float[]{-160, 5, -65});
        WOOD_HSL_ADJUSTMENTS.put("hellbark", new float[]{-132, 34, -93});
        WOOD_HSL_ADJUSTMENTS.put("empyreal", new float[]{-132, 34, -52});
    }

    public static void main(String[] args) throws IOException {
        File input = new File("src/main/resources/assets/furnituresoplenty/textures/block/birch_table.png");
        BufferedImage baseImage = ImageIO.read(input);

        // Define output directory
        File outputDir = new File("src/main/resources/assets/furnituresoplenty/textures/block");
        outputDir.mkdirs(); // create directories if missing

        for (String wood : WOOD_HSL_ADJUSTMENTS.keySet()) {
            float[] adj = WOOD_HSL_ADJUSTMENTS.get(wood);
            BufferedImage recolored = recolor(baseImage, adj[0], adj[1], adj[2]);
            File outputFile = new File(outputDir, wood + "_table.png");
            ImageIO.write(recolored, "png", outputFile);
            System.out.println("Generated " + outputFile.getPath());
        }

        System.out.println("All recolors generated to: " + outputDir.getPath());
    }

    private static BufferedImage recolor(BufferedImage img, float hueShift, float satAdjust, float lightAdjust) {
        BufferedImage result = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int rgb = img.getRGB(x, y);
                Color color = new Color(rgb, true);

                if (color.getAlpha() == 0) { // skip transparent pixels
                    result.setRGB(x, y, rgb);
                    continue;
                }

                float[] hsl = rgbToHsl(color.getRed(), color.getGreen(), color.getBlue());

                hsl[0] = (hsl[0] + hueShift + 360) % 360f;
                hsl[1] = clamp(hsl[1] + satAdjust / 100f, 0f, 1f);
                hsl[2] = clamp(hsl[2] + lightAdjust / 100f, 0f, 1f);

                int newRgb = hslToRgb(hsl[0], hsl[1], hsl[2], color.getAlpha());
                result.setRGB(x, y, newRgb);
            }
        }

        return result;
    }

    private static float[] rgbToHsl(int r, int g, int b) {
        float rf = r / 255f, gf = g / 255f, bf = b / 255f;
        float max = Math.max(rf, Math.max(gf, bf));
        float min = Math.min(rf, Math.min(gf, bf));
        float h, s, l = (max + min) / 2f;

        if (max == min) {
            h = s = 0f;
        } else {
            float d = max - min;
            s = l > 0.5f ? d / (2f - max - min) : d / (max + min);
            if (max == rf) h = (gf - bf) / d + (gf < bf ? 6f : 0f);
            else if (max == gf) h = (bf - rf) / d + 2f;
            else h = (rf - gf) / d + 4f;
            h *= 60f;
        }
        return new float[]{h, s, l};
    }

    private static int hslToRgb(float h, float s, float l, int alpha) {
        float c = (1 - Math.abs(2 * l - 1)) * s;
        float x = c * (1 - Math.abs((h / 60f) % 2 - 1));
        float m = l - c / 2f;

        float rf, gf, bf;
        if (h < 60) { rf = c; gf = x; bf = 0; }
        else if (h < 120) { rf = x; gf = c; bf = 0; }
        else if (h < 180) { rf = 0; gf = c; bf = x; }
        else if (h < 240) { rf = 0; gf = x; bf = c; }
        else if (h < 300) { rf = x; gf = 0; bf = c; }
        else { rf = c; gf = 0; bf = x; }

        int r = Math.round(clamp((rf + m) * 255, 0, 255));
        int g = Math.round(clamp((gf + m) * 255, 0, 255));
        int b = Math.round(clamp((bf + m) * 255, 0, 255));

        return new Color(r, g, b, alpha).getRGB();
    }

    private static float clamp(float val, float min, float max) {
        return Math.max(min, Math.min(max, val));
    }
}
