package com.rslover521.furnituresoplenty.core;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("removal")
public class ModExtraModels {

    private static final String MODID = "furnituresoplenty";

    public static final Map<String, ResourceLocation> MODELS = new HashMap<>();

    // Light ceiling fan blades
    public static final ResourceLocation FIR_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/fir_light_ceiling_fan_blade");
    public static final ResourceLocation PINE_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/pine_light_ceiling_fan_blade");
    public static final ResourceLocation MAPLE_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/maple_light_ceiling_fan_blade");
    public static final ResourceLocation REDWOOD_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/redwood_light_ceiling_fan_blade");
    public static final ResourceLocation MAHOGANY_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/mahogany_light_ceiling_fan_blade");
    public static final ResourceLocation JACARANDA_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/jacaranda_light_ceiling_fan_blade");
    public static final ResourceLocation PALM_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/palm_light_ceiling_fan_blade");
    public static final ResourceLocation WILLOW_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/willow_light_ceiling_fan_blade");
    public static final ResourceLocation DEAD_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/dead_light_ceiling_fan_blade");
    public static final ResourceLocation MAGIC_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/magic_light_ceiling_fan_blade");
    public static final ResourceLocation UMBRAN_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/umbran_light_ceiling_fan_blade");
    public static final ResourceLocation HELLBARK_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/hellbark_light_ceiling_fan_blade");
    public static final ResourceLocation EMPYREAL_LIGHT_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/empyreal_light_ceiling_fan_blade");

    // Dark ceiling fan blades
    public static final ResourceLocation FIR_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/fir_dark_ceiling_fan_blade");
    public static final ResourceLocation PINE_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/pine_dark_ceiling_fan_blade");
    public static final ResourceLocation MAPLE_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/maple_dark_ceiling_fan_blade");
    public static final ResourceLocation REDWOOD_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/redwood_dark_ceiling_fan_blade");
    public static final ResourceLocation MAHOGANY_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/mahogany_dark_ceiling_fan_blade");
    public static final ResourceLocation JACARANDA_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/jacaranda_dark_ceiling_fan_blade");
    public static final ResourceLocation PALM_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/palm_dark_ceiling_fan_blade");
    public static final ResourceLocation WILLOW_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/willow_dark_ceiling_fan_blade");
    public static final ResourceLocation DEAD_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/dead_dark_ceiling_fan_blade");
    public static final ResourceLocation MAGIC_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/magic_dark_ceiling_fan_blade");
    public static final ResourceLocation UMBRAN_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/umbran_dark_ceiling_fan_blade");
    public static final ResourceLocation HELLBARK_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/hellbark_dark_ceiling_fan_blade");
    public static final ResourceLocation EMPYREAL_DARK_CEILING_FAN_BLADE = new ResourceLocation(MODID, "extra/empyreal_dark_ceiling_fan_blade");

    static {
        // Populate the map for easy TESR access
        MODELS.put("fir_light", FIR_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("pine_light", PINE_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("maple_light", MAPLE_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("redwood_light", REDWOOD_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("mahogany_light", MAHOGANY_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("jacaranda_light", JACARANDA_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("palm_light", PALM_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("willow_light", WILLOW_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("dead_light", DEAD_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("magic_light", MAGIC_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("umbran_light", UMBRAN_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("hellbark_light", HELLBARK_LIGHT_CEILING_FAN_BLADE);
        MODELS.put("empyreal_light", EMPYREAL_LIGHT_CEILING_FAN_BLADE);

        MODELS.put("fir_dark", FIR_DARK_CEILING_FAN_BLADE);
        MODELS.put("pine_dark", PINE_DARK_CEILING_FAN_BLADE);
        MODELS.put("maple_dark", MAPLE_DARK_CEILING_FAN_BLADE);
        MODELS.put("redwood_dark", REDWOOD_DARK_CEILING_FAN_BLADE);
        MODELS.put("mahogany_dark", MAHOGANY_DARK_CEILING_FAN_BLADE);
        MODELS.put("jacaranda_dark", JACARANDA_DARK_CEILING_FAN_BLADE);
        MODELS.put("palm_dark", PALM_DARK_CEILING_FAN_BLADE);
        MODELS.put("willow_dark", WILLOW_DARK_CEILING_FAN_BLADE);
        MODELS.put("dead_dark", DEAD_DARK_CEILING_FAN_BLADE);
        MODELS.put("magic_dark", MAGIC_DARK_CEILING_FAN_BLADE);
        MODELS.put("umbran_dark", UMBRAN_DARK_CEILING_FAN_BLADE);
        MODELS.put("hellbark_dark", HELLBARK_DARK_CEILING_FAN_BLADE);
        MODELS.put("empyreal_dark", EMPYREAL_DARK_CEILING_FAN_BLADE);
    }

    public static ResourceLocation get(String name) {
        return MODELS.get(name);
    }

    public static void register(IEventBus eventBus) {
    }
}
