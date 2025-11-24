package com.rslover521.furnituresoplenty.core;

import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FurnituresOPlenty.MODID);
	
	// === BASINS ===
    public static final RegistryObject<Item> FIR_BASIN = ITEMS.register("fir_basin", () -> new BlockItem(ModBlocks.FIR_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_BASIN = ITEMS.register("pine_basin", () -> new BlockItem(ModBlocks.PINE_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_BASIN = ITEMS.register("maple_basin", () -> new BlockItem(ModBlocks.MAPLE_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_BASIN = ITEMS.register("redwood_basin", () -> new BlockItem(ModBlocks.REDWOOD_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_BASIN = ITEMS.register("mahogany_basin", () -> new BlockItem(ModBlocks.MAHOGANY_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_BASIN = ITEMS.register("jacaranda_basin", () -> new BlockItem(ModBlocks.JACARANDA_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_BASIN = ITEMS.register("palm_basin", () -> new BlockItem(ModBlocks.PALM_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_BASIN = ITEMS.register("willow_basin", () -> new BlockItem(ModBlocks.WILLOW_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_BASIN = ITEMS.register("dead_basin", () -> new BlockItem(ModBlocks.DEAD_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_BASIN = ITEMS.register("magic_basin", () -> new BlockItem(ModBlocks.MAGIC_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_BASIN = ITEMS.register("umbran_basin", () -> new BlockItem(ModBlocks.UMBRAN_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_BASIN = ITEMS.register("hellbark_basin", () -> new BlockItem(ModBlocks.HELLBARK_BASIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_BASIN = ITEMS.register("empyreal_basin", () -> new BlockItem(ModBlocks.EMPYREAL_BASIN.get(), new Item.Properties()));

    // === BATHS ===
    public static final RegistryObject<Item> FIR_BATH = ITEMS.register("fir_bath", () -> new BlockItem(ModBlocks.FIR_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_BATH = ITEMS.register("pine_bath", () -> new BlockItem(ModBlocks.PINE_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_BATH = ITEMS.register("maple_bath", () -> new BlockItem(ModBlocks.MAPLE_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_BATH = ITEMS.register("redwood_bath", () -> new BlockItem(ModBlocks.REDWOOD_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_BATH = ITEMS.register("mahogany_bath", () -> new BlockItem(ModBlocks.MAHOGANY_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_BATH = ITEMS.register("jacaranda_bath", () -> new BlockItem(ModBlocks.JACARANDA_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_BATH = ITEMS.register("palm_bath", () -> new BlockItem(ModBlocks.PALM_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_BATH = ITEMS.register("willow_bath", () -> new BlockItem(ModBlocks.WILLOW_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_BATH = ITEMS.register("dead_bath", () -> new BlockItem(ModBlocks.DEAD_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_BATH = ITEMS.register("magic_bath", () -> new BlockItem(ModBlocks.MAGIC_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_BATH = ITEMS.register("umbran_bath", () -> new BlockItem(ModBlocks.UMBRAN_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_BATH = ITEMS.register("hellbark_bath", () -> new BlockItem(ModBlocks.HELLBARK_BATH.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_BATH = ITEMS.register("empyreal_bath", () -> new BlockItem(ModBlocks.EMPYREAL_BATH.get(), new Item.Properties()));

    // === LIGHT CEILING FANS ===
    public static final RegistryObject<Item> FIR_LIGHT_CEILING_FAN = ITEMS.register("fir_light_ceiling_fan", () -> new BlockItem(ModBlocks.FIR_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_LIGHT_CEILING_FAN = ITEMS.register("pine_light_ceiling_fan", () -> new BlockItem(ModBlocks.PINE_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_LIGHT_CEILING_FAN = ITEMS.register("maple_light_ceiling_fan", () -> new BlockItem(ModBlocks.MAPLE_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_LIGHT_CEILING_FAN = ITEMS.register("redwood_light_ceiling_fan", () -> new BlockItem(ModBlocks.REDWOOD_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_LIGHT_CEILING_FAN = ITEMS.register("mahogany_light_ceiling_fan", () -> new BlockItem(ModBlocks.MAHOGANY_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_LIGHT_CEILING_FAN = ITEMS.register("jacaranda_light_ceiling_fan", () -> new BlockItem(ModBlocks.JACARANDA_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_LIGHT_CEILING_FAN = ITEMS.register("palm_light_ceiling_fan", () -> new BlockItem(ModBlocks.PALM_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_LIGHT_CEILING_FAN = ITEMS.register("willow_light_ceiling_fan", () -> new BlockItem(ModBlocks.WILLOW_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_LIGHT_CEILING_FAN = ITEMS.register("dead_light_ceiling_fan", () -> new BlockItem(ModBlocks.DEAD_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_LIGHT_CEILING_FAN = ITEMS.register("magic_light_ceiling_fan", () -> new BlockItem(ModBlocks.MAGIC_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_LIGHT_CEILING_FAN = ITEMS.register("umbran_light_ceiling_fan", () -> new BlockItem(ModBlocks.UMBRAN_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_LIGHT_CEILING_FAN = ITEMS.register("hellbark_light_ceiling_fan", () -> new BlockItem(ModBlocks.HELLBARK_LIGHT_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_LIGHT_CEILING_FAN = ITEMS.register("empyreal_light_ceiling_fan", () -> new BlockItem(ModBlocks.EMPYREAL_LIGHT_CEILING_FAN.get(), new Item.Properties()));

    // === DARK CEILING FANS ===
    public static final RegistryObject<Item> FIR_DARK_CEILING_FAN = ITEMS.register("fir_dark_ceiling_fan", () -> new BlockItem(ModBlocks.FIR_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DARK_CEILING_FAN = ITEMS.register("pine_dark_ceiling_fan", () -> new BlockItem(ModBlocks.PINE_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DARK_CEILING_FAN = ITEMS.register("maple_dark_ceiling_fan", () -> new BlockItem(ModBlocks.MAPLE_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_DARK_CEILING_FAN = ITEMS.register("redwood_dark_ceiling_fan", () -> new BlockItem(ModBlocks.REDWOOD_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_DARK_CEILING_FAN = ITEMS.register("mahogany_dark_ceiling_fan", () -> new BlockItem(ModBlocks.MAHOGANY_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_DARK_CEILING_FAN = ITEMS.register("jacaranda_dark_ceiling_fan", () -> new BlockItem(ModBlocks.JACARANDA_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DARK_CEILING_FAN = ITEMS.register("palm_dark_ceiling_fan", () -> new BlockItem(ModBlocks.PALM_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DARK_CEILING_FAN = ITEMS.register("willow_dark_ceiling_fan", () -> new BlockItem(ModBlocks.WILLOW_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_DARK_CEILING_FAN = ITEMS.register("dead_dark_ceiling_fan", () -> new BlockItem(ModBlocks.DEAD_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_DARK_CEILING_FAN = ITEMS.register("magic_dark_ceiling_fan", () -> new BlockItem(ModBlocks.MAGIC_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_DARK_CEILING_FAN = ITEMS.register("umbran_dark_ceiling_fan", () -> new BlockItem(ModBlocks.UMBRAN_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_DARK_CEILING_FAN = ITEMS.register("hellbark_dark_ceiling_fan", () -> new BlockItem(ModBlocks.HELLBARK_DARK_CEILING_FAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_DARK_CEILING_FAN = ITEMS.register("empyreal_dark_ceiling_fan", () -> new BlockItem(ModBlocks.EMPYREAL_DARK_CEILING_FAN.get(), new Item.Properties()));

    // === CHAIRS ===
    public static final RegistryObject<Item> FIR_CHAIR = ITEMS.register("fir_chair", () -> new BlockItem(ModBlocks.FIR_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_CHAIR = ITEMS.register("pine_chair", () -> new BlockItem(ModBlocks.PINE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_CHAIR = ITEMS.register("maple_chair", () -> new BlockItem(ModBlocks.MAPLE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_CHAIR = ITEMS.register("redwood_chair", () -> new BlockItem(ModBlocks.REDWOOD_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_CHAIR = ITEMS.register("mahogany_chair", () -> new BlockItem(ModBlocks.MAHOGANY_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_CHAIR = ITEMS.register("jacaranda_chair", () -> new BlockItem(ModBlocks.JACARANDA_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_CHAIR = ITEMS.register("palm_chair", () -> new BlockItem(ModBlocks.PALM_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CHAIR = ITEMS.register("willow_chair", () -> new BlockItem(ModBlocks.WILLOW_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_CHAIR = ITEMS.register("dead_chair", () -> new BlockItem(ModBlocks.DEAD_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_CHAIR = ITEMS.register("magic_chair", () -> new BlockItem(ModBlocks.MAGIC_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_CHAIR = ITEMS.register("umbran_chair", () -> new BlockItem(ModBlocks.UMBRAN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_CHAIR = ITEMS.register("hellbark_chair", () -> new BlockItem(ModBlocks.HELLBARK_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_CHAIR = ITEMS.register("empyreal_chair", () -> new BlockItem(ModBlocks.EMPYREAL_CHAIR.get(), new Item.Properties()));

    // === CRATES ===
    public static final RegistryObject<Item> FIR_CRATE = ITEMS.register("fir_crate", () -> new BlockItem(ModBlocks.FIR_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_CRATE = ITEMS.register("pine_crate", () -> new BlockItem(ModBlocks.PINE_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_CRATE = ITEMS.register("maple_crate", () -> new BlockItem(ModBlocks.MAPLE_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_CRATE = ITEMS.register("redwood_crate", () -> new BlockItem(ModBlocks.REDWOOD_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_CRATE = ITEMS.register("mahogany_crate", () -> new BlockItem(ModBlocks.MAHOGANY_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_CRATE = ITEMS.register("jacaranda_crate", () -> new BlockItem(ModBlocks.JACARANDA_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_CRATE = ITEMS.register("palm_crate", () -> new BlockItem(ModBlocks.PALM_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CRATE = ITEMS.register("willow_crate", () -> new BlockItem(ModBlocks.WILLOW_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_CRATE = ITEMS.register("dead_crate", () -> new BlockItem(ModBlocks.DEAD_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_CRATE = ITEMS.register("magic_crate", () -> new BlockItem(ModBlocks.MAGIC_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_CRATE = ITEMS.register("umbran_crate", () -> new BlockItem(ModBlocks.UMBRAN_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_CRATE = ITEMS.register("hellbark_crate", () -> new BlockItem(ModBlocks.HELLBARK_CRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_CRATE = ITEMS.register("empyreal_crate", () -> new BlockItem(ModBlocks.EMPYREAL_CRATE.get(), new Item.Properties()));

    // === CUTTING BOARDS ===
    public static final RegistryObject<Item> FIR_CUTTING_BOARD = ITEMS.register("fir_cutting_board", () -> new BlockItem(ModBlocks.FIR_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_CUTTING_BOARD = ITEMS.register("pine_cutting_board", () -> new BlockItem(ModBlocks.PINE_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_CUTTING_BOARD = ITEMS.register("maple_cutting_board", () -> new BlockItem(ModBlocks.MAPLE_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_CUTTING_BOARD = ITEMS.register("redwood_cutting_board", () -> new BlockItem(ModBlocks.REDWOOD_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_CUTTING_BOARD = ITEMS.register("mahogany_cutting_board", () -> new BlockItem(ModBlocks.MAHOGANY_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_CUTTING_BOARD = ITEMS.register("jacaranda_cutting_board", () -> new BlockItem(ModBlocks.JACARANDA_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_CUTTING_BOARD = ITEMS.register("palm_cutting_board", () -> new BlockItem(ModBlocks.PALM_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CUTTING_BOARD = ITEMS.register("willow_cutting_board", () -> new BlockItem(ModBlocks.WILLOW_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_CUTTING_BOARD = ITEMS.register("dead_cutting_board", () -> new BlockItem(ModBlocks.DEAD_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_CUTTING_BOARD = ITEMS.register("magic_cutting_board", () -> new BlockItem(ModBlocks.MAGIC_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_CUTTING_BOARD = ITEMS.register("umbran_cutting_board", () -> new BlockItem(ModBlocks.UMBRAN_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_CUTTING_BOARD = ITEMS.register("hellbark_cutting_board", () -> new BlockItem(ModBlocks.HELLBARK_CUTTING_BOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_CUTTING_BOARD = ITEMS.register("empyreal_cutting_board", () -> new BlockItem(ModBlocks.EMPYREAL_CUTTING_BOARD.get(), new Item.Properties()));

    // === DESKS ===
    public static final RegistryObject<Item> FIR_DESK = ITEMS.register("fir_desk", () -> new BlockItem(ModBlocks.FIR_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DESK = ITEMS.register("pine_desk", () -> new BlockItem(ModBlocks.PINE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DESK = ITEMS.register("maple_desk", () -> new BlockItem(ModBlocks.MAPLE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_DESK = ITEMS.register("redwood_desk", () -> new BlockItem(ModBlocks.REDWOOD_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_DESK = ITEMS.register("mahogany_desk", () -> new BlockItem(ModBlocks.MAHOGANY_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_DESK = ITEMS.register("jacaranda_desk", () -> new BlockItem(ModBlocks.JACARANDA_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DESK = ITEMS.register("palm_desk", () -> new BlockItem(ModBlocks.PALM_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DESK = ITEMS.register("willow_desk", () -> new BlockItem(ModBlocks.WILLOW_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_DESK = ITEMS.register("dead_desk", () -> new BlockItem(ModBlocks.DEAD_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_DESK = ITEMS.register("magic_desk", () -> new BlockItem(ModBlocks.MAGIC_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_DESK = ITEMS.register("umbran_desk", () -> new BlockItem(ModBlocks.UMBRAN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_DESK = ITEMS.register("hellbark_desk", () -> new BlockItem(ModBlocks.HELLBARK_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_DESK = ITEMS.register("empyreal_desk", () -> new BlockItem(ModBlocks.EMPYREAL_DESK.get(), new Item.Properties()));

    // === DRAWERS ===
    public static final RegistryObject<Item> FIR_DRAWER = ITEMS.register("fir_drawer", () -> new BlockItem(ModBlocks.FIR_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DRAWER = ITEMS.register("pine_drawer", () -> new BlockItem(ModBlocks.PINE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DRAWER = ITEMS.register("maple_drawer", () -> new BlockItem(ModBlocks.MAPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_DRAWER = ITEMS.register("redwood_drawer", () -> new BlockItem(ModBlocks.REDWOOD_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_DRAWER = ITEMS.register("mahogany_drawer", () -> new BlockItem(ModBlocks.MAHOGANY_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_DRAWER = ITEMS.register("jacaranda_drawer", () -> new BlockItem(ModBlocks.JACARANDA_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DRAWER = ITEMS.register("palm_drawer", () -> new BlockItem(ModBlocks.PALM_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DRAWER = ITEMS.register("willow_drawer", () -> new BlockItem(ModBlocks.WILLOW_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_DRAWER = ITEMS.register("dead_drawer", () -> new BlockItem(ModBlocks.DEAD_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_DRAWER = ITEMS.register("magic_drawer", () -> new BlockItem(ModBlocks.MAGIC_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_DRAWER = ITEMS.register("umbran_drawer", () -> new BlockItem(ModBlocks.UMBRAN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_DRAWER = ITEMS.register("hellbark_drawer", () -> new BlockItem(ModBlocks.HELLBARK_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_DRAWER = ITEMS.register("empyreal_drawer", () -> new BlockItem(ModBlocks.EMPYREAL_DRAWER.get(), new Item.Properties()));

    // === KITCHEN CABINETRYS ===
    public static final RegistryObject<Item> FIR_KITCHEN_CABINETRY = ITEMS.register("fir_kitchen_cabinetry", () -> new BlockItem(ModBlocks.FIR_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_KITCHEN_CABINETRY = ITEMS.register("pine_kitchen_cabinetry", () -> new BlockItem(ModBlocks.PINE_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_KITCHEN_CABINETRY = ITEMS.register("maple_kitchen_cabinetry", () -> new BlockItem(ModBlocks.MAPLE_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_KITCHEN_CABINETRY = ITEMS.register("redwood_kitchen_cabinetry", () -> new BlockItem(ModBlocks.REDWOOD_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_KITCHEN_CABINETRY = ITEMS.register("mahogany_kitchen_cabinetry", () -> new BlockItem(ModBlocks.MAHOGANY_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_KITCHEN_CABINETRY = ITEMS.register("jacaranda_kitchen_cabinetry", () -> new BlockItem(ModBlocks.JACARANDA_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_KITCHEN_CABINETRY = ITEMS.register("palm_kitchen_cabinetry", () -> new BlockItem(ModBlocks.PALM_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_KITCHEN_CABINETRY = ITEMS.register("willow_kitchen_cabinetry", () -> new BlockItem(ModBlocks.WILLOW_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_KITCHEN_CABINETRY = ITEMS.register("dead_kitchen_cabinetry", () -> new BlockItem(ModBlocks.DEAD_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_KITCHEN_CABINETRY = ITEMS.register("magic_kitchen_cabinetry", () -> new BlockItem(ModBlocks.MAGIC_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_KITCHEN_CABINETRY = ITEMS.register("umbran_kitchen_cabinetry", () -> new BlockItem(ModBlocks.UMBRAN_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_KITCHEN_CABINETRY = ITEMS.register("hellbark_kitchen_cabinetry", () -> new BlockItem(ModBlocks.HELLBARK_KITCHEN_CABINETRY.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_KITCHEN_CABINETRY = ITEMS.register("empyreal_kitchen_cabinetry", () -> new BlockItem(ModBlocks.EMPYREAL_KITCHEN_CABINETRY.get(), new Item.Properties()));

    // === KITCHEN DRAWERS ===
    public static final RegistryObject<Item> FIR_KITCHEN_DRAWER = ITEMS.register("fir_kitchen_drawer", () -> new BlockItem(ModBlocks.FIR_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_KITCHEN_DRAWER = ITEMS.register("pine_kitchen_drawer", () -> new BlockItem(ModBlocks.PINE_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_KITCHEN_DRAWER = ITEMS.register("maple_kitchen_drawer", () -> new BlockItem(ModBlocks.MAPLE_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_KITCHEN_DRAWER = ITEMS.register("redwood_kitchen_drawer", () -> new BlockItem(ModBlocks.REDWOOD_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_KITCHEN_DRAWER = ITEMS.register("mahogany_kitchen_drawer", () -> new BlockItem(ModBlocks.MAHOGANY_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_KITCHEN_DRAWER = ITEMS.register("jacaranda_kitchen_drawer", () -> new BlockItem(ModBlocks.JACARANDA_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_KITCHEN_DRAWER = ITEMS.register("palm_kitchen_drawer", () -> new BlockItem(ModBlocks.PALM_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_KITCHEN_DRAWER = ITEMS.register("willow_kitchen_drawer", () -> new BlockItem(ModBlocks.WILLOW_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_KITCHEN_DRAWER = ITEMS.register("dead_kitchen_drawer", () -> new BlockItem(ModBlocks.DEAD_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_KITCHEN_DRAWER = ITEMS.register("magic_kitchen_drawer", () -> new BlockItem(ModBlocks.MAGIC_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_KITCHEN_DRAWER = ITEMS.register("umbran_kitchen_drawer", () -> new BlockItem(ModBlocks.UMBRAN_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_KITCHEN_DRAWER = ITEMS.register("hellbark_kitchen_drawer", () -> new BlockItem(ModBlocks.HELLBARK_KITCHEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_KITCHEN_DRAWER = ITEMS.register("empyreal_kitchen_drawer", () -> new BlockItem(ModBlocks.EMPYREAL_KITCHEN_DRAWER.get(), new Item.Properties()));

    // === KITCHEN SINKS ===
    public static final RegistryObject<Item> FIR_KITCHEN_SINK = ITEMS.register("fir_kitchen_sink", () -> new BlockItem(ModBlocks.FIR_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_KITCHEN_SINK = ITEMS.register("pine_kitchen_sink", () -> new BlockItem(ModBlocks.PINE_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_KITCHEN_SINK = ITEMS.register("maple_kitchen_sink", () -> new BlockItem(ModBlocks.MAPLE_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_KITCHEN_SINK = ITEMS.register("redwood_kitchen_sink", () -> new BlockItem(ModBlocks.REDWOOD_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_KITCHEN_SINK = ITEMS.register("mahogany_kitchen_sink", () -> new BlockItem(ModBlocks.MAHOGANY_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_KITCHEN_SINK = ITEMS.register("jacaranda_kitchen_sink", () -> new BlockItem(ModBlocks.JACARANDA_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_KITCHEN_SINK = ITEMS.register("palm_kitchen_sink", () -> new BlockItem(ModBlocks.PALM_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_KITCHEN_SINK = ITEMS.register("willow_kitchen_sink", () -> new BlockItem(ModBlocks.WILLOW_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_KITCHEN_SINK = ITEMS.register("dead_kitchen_sink", () -> new BlockItem(ModBlocks.DEAD_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_KITCHEN_SINK = ITEMS.register("magic_kitchen_sink", () -> new BlockItem(ModBlocks.MAGIC_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_KITCHEN_SINK = ITEMS.register("umbran_kitchen_sink", () -> new BlockItem(ModBlocks.UMBRAN_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_KITCHEN_SINK = ITEMS.register("hellbark_kitchen_sink", () -> new BlockItem(ModBlocks.HELLBARK_KITCHEN_SINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_KITCHEN_SINK = ITEMS.register("empyreal_kitchen_sink", () -> new BlockItem(ModBlocks.EMPYREAL_KITCHEN_SINK.get(), new Item.Properties()));

    // === KITCHEN STORAGE CABINETS ===
    public static final RegistryObject<Item> FIR_KITCHEN_STORAGE_CABINET = ITEMS.register("fir_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.FIR_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_KITCHEN_STORAGE_CABINET = ITEMS.register("pine_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.PINE_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_KITCHEN_STORAGE_CABINET = ITEMS.register("maple_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.MAPLE_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_KITCHEN_STORAGE_CABINET = ITEMS.register("redwood_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.REDWOOD_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_KITCHEN_STORAGE_CABINET = ITEMS.register("mahogany_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.MAHOGANY_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_KITCHEN_STORAGE_CABINET = ITEMS.register("jacaranda_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.JACARANDA_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_KITCHEN_STORAGE_CABINET = ITEMS.register("palm_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.PALM_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_KITCHEN_STORAGE_CABINET = ITEMS.register("willow_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.WILLOW_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_KITCHEN_STORAGE_CABINET = ITEMS.register("dead_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.DEAD_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_KITCHEN_STORAGE_CABINET = ITEMS.register("magic_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.MAGIC_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_KITCHEN_STORAGE_CABINET = ITEMS.register("umbran_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.UMBRAN_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_KITCHEN_STORAGE_CABINET = ITEMS.register("hellbark_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.HELLBARK_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_KITCHEN_STORAGE_CABINET = ITEMS.register("empyreal_kitchen_storage_cabinet", () -> new BlockItem(ModBlocks.EMPYREAL_KITCHEN_STORAGE_CABINET.get(), new Item.Properties()));

    // === LATTICE FENCE GATES ===
    public static final RegistryObject<Item> FIR_LATTICE_FENCE_GATE = ITEMS.register("fir_lattice_fence_gate", () -> new BlockItem(ModBlocks.FIR_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_LATTICE_FENCE_GATE = ITEMS.register("pine_lattice_fence_gate", () -> new BlockItem(ModBlocks.PINE_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_LATTICE_FENCE_GATE = ITEMS.register("maple_lattice_fence_gate", () -> new BlockItem(ModBlocks.MAPLE_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_LATTICE_FENCE_GATE = ITEMS.register("redwood_lattice_fence_gate", () -> new BlockItem(ModBlocks.REDWOOD_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_LATTICE_FENCE_GATE = ITEMS.register("mahogany_lattice_fence_gate", () -> new BlockItem(ModBlocks.MAHOGANY_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_LATTICE_FENCE_GATE = ITEMS.register("jacaranda_lattice_fence_gate", () -> new BlockItem(ModBlocks.JACARANDA_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_LATTICE_FENCE_GATE = ITEMS.register("palm_lattice_fence_gate", () -> new BlockItem(ModBlocks.PALM_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_LATTICE_FENCE_GATE = ITEMS.register("willow_lattice_fence_gate", () -> new BlockItem(ModBlocks.WILLOW_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_LATTICE_FENCE_GATE = ITEMS.register("dead_lattice_fence_gate", () -> new BlockItem(ModBlocks.DEAD_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_LATTICE_FENCE_GATE = ITEMS.register("magic_lattice_fence_gate", () -> new BlockItem(ModBlocks.MAGIC_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_LATTICE_FENCE_GATE = ITEMS.register("umbran_lattice_fence_gate", () -> new BlockItem(ModBlocks.UMBRAN_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_LATTICE_FENCE_GATE = ITEMS.register("hellbark_lattice_fence_gate", () -> new BlockItem(ModBlocks.HELLBARK_LATTICE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_LATTICE_FENCE_GATE = ITEMS.register("empyreal_lattice_fence_gate", () -> new BlockItem(ModBlocks.EMPYREAL_LATTICE_FENCE_GATE.get(), new Item.Properties()));

    // === LATTICE FENCES ===
    public static final RegistryObject<Item> FIR_LATTICE_FENCE = ITEMS.register("fir_lattice_fence", () -> new BlockItem(ModBlocks.FIR_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_LATTICE_FENCE = ITEMS.register("pine_lattice_fence", () -> new BlockItem(ModBlocks.PINE_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_LATTICE_FENCE = ITEMS.register("maple_lattice_fence", () -> new BlockItem(ModBlocks.MAPLE_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_LATTICE_FENCE = ITEMS.register("redwood_lattice_fence", () -> new BlockItem(ModBlocks.REDWOOD_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_LATTICE_FENCE = ITEMS.register("mahogany_lattice_fence", () -> new BlockItem(ModBlocks.MAHOGANY_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_LATTICE_FENCE = ITEMS.register("jacaranda_lattice_fence", () -> new BlockItem(ModBlocks.JACARANDA_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_LATTICE_FENCE = ITEMS.register("palm_lattice_fence", () -> new BlockItem(ModBlocks.PALM_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_LATTICE_FENCE = ITEMS.register("willow_lattice_fence", () -> new BlockItem(ModBlocks.WILLOW_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_LATTICE_FENCE = ITEMS.register("dead_lattice_fence", () -> new BlockItem(ModBlocks.DEAD_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_LATTICE_FENCE = ITEMS.register("magic_lattice_fence", () -> new BlockItem(ModBlocks.MAGIC_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_LATTICE_FENCE = ITEMS.register("umbran_lattice_fence", () -> new BlockItem(ModBlocks.UMBRAN_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_LATTICE_FENCE = ITEMS.register("hellbark_lattice_fence", () -> new BlockItem(ModBlocks.HELLBARK_LATTICE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_LATTICE_FENCE = ITEMS.register("empyreal_lattice_fence", () -> new BlockItem(ModBlocks.EMPYREAL_LATTICE_FENCE.get(), new Item.Properties()));

    // === MAIL BOXS ===
    public static final RegistryObject<Item> FIR_MAIL_BOX = ITEMS.register("fir_mail_box", () -> new BlockItem(ModBlocks.FIR_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_MAIL_BOX = ITEMS.register("pine_mail_box", () -> new BlockItem(ModBlocks.PINE_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_MAIL_BOX = ITEMS.register("maple_mail_box", () -> new BlockItem(ModBlocks.MAPLE_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_MAIL_BOX = ITEMS.register("redwood_mail_box", () -> new BlockItem(ModBlocks.REDWOOD_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_MAIL_BOX = ITEMS.register("mahogany_mail_box", () -> new BlockItem(ModBlocks.MAHOGANY_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_MAIL_BOX = ITEMS.register("jacaranda_mail_box", () -> new BlockItem(ModBlocks.JACARANDA_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_MAIL_BOX = ITEMS.register("palm_mail_box", () -> new BlockItem(ModBlocks.PALM_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_MAIL_BOX = ITEMS.register("willow_mail_box", () -> new BlockItem(ModBlocks.WILLOW_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_MAIL_BOX = ITEMS.register("dead_mail_box", () -> new BlockItem(ModBlocks.DEAD_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_MAIL_BOX = ITEMS.register("magic_mail_box", () -> new BlockItem(ModBlocks.MAGIC_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_MAIL_BOX = ITEMS.register("umbran_mail_box", () -> new BlockItem(ModBlocks.UMBRAN_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_MAIL_BOX = ITEMS.register("hellbark_mail_box", () -> new BlockItem(ModBlocks.HELLBARK_MAIL_BOX.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_MAIL_BOX = ITEMS.register("empyreal_mail_box", () -> new BlockItem(ModBlocks.EMPYREAL_MAIL_BOX.get(), new Item.Properties()));

    // === STORAGE CABINETS ===
    public static final RegistryObject<Item> FIR_STORAGE_CABINET = ITEMS.register("fir_storage_cabinet", () -> new BlockItem(ModBlocks.FIR_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_STORAGE_CABINET = ITEMS.register("pine_storage_cabinet", () -> new BlockItem(ModBlocks.PINE_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_STORAGE_CABINET = ITEMS.register("maple_storage_cabinet", () -> new BlockItem(ModBlocks.MAPLE_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_STORAGE_CABINET = ITEMS.register("redwood_storage_cabinet", () -> new BlockItem(ModBlocks.REDWOOD_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_STORAGE_CABINET = ITEMS.register("mahogany_storage_cabinet", () -> new BlockItem(ModBlocks.MAHOGANY_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_STORAGE_CABINET = ITEMS.register("jacaranda_storage_cabinet", () -> new BlockItem(ModBlocks.JACARANDA_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_STORAGE_CABINET = ITEMS.register("palm_storage_cabinet", () -> new BlockItem(ModBlocks.PALM_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_STORAGE_CABINET = ITEMS.register("willow_storage_cabinet", () -> new BlockItem(ModBlocks.WILLOW_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_STORAGE_CABINET = ITEMS.register("dead_storage_cabinet", () -> new BlockItem(ModBlocks.DEAD_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_STORAGE_CABINET = ITEMS.register("magic_storage_cabinet", () -> new BlockItem(ModBlocks.MAGIC_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_STORAGE_CABINET = ITEMS.register("umbran_storage_cabinet", () -> new BlockItem(ModBlocks.UMBRAN_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_STORAGE_CABINET = ITEMS.register("hellbark_storage_cabinet", () -> new BlockItem(ModBlocks.HELLBARK_STORAGE_CABINET.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_STORAGE_CABINET = ITEMS.register("empyreal_storage_cabinet", () -> new BlockItem(ModBlocks.EMPYREAL_STORAGE_CABINET.get(), new Item.Properties()));

    // === STORAGE JARS ===
    public static final RegistryObject<Item> FIR_STORAGE_JAR = ITEMS.register("fir_storage_jar", () -> new BlockItem(ModBlocks.FIR_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_STORAGE_JAR = ITEMS.register("pine_storage_jar", () -> new BlockItem(ModBlocks.PINE_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_STORAGE_JAR = ITEMS.register("maple_storage_jar", () -> new BlockItem(ModBlocks.MAPLE_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_STORAGE_JAR = ITEMS.register("redwood_storage_jar", () -> new BlockItem(ModBlocks.REDWOOD_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_STORAGE_JAR = ITEMS.register("mahogany_storage_jar", () -> new BlockItem(ModBlocks.MAHOGANY_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_STORAGE_JAR = ITEMS.register("jacaranda_storage_jar", () -> new BlockItem(ModBlocks.JACARANDA_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_STORAGE_JAR = ITEMS.register("palm_storage_jar", () -> new BlockItem(ModBlocks.PALM_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_STORAGE_JAR = ITEMS.register("willow_storage_jar", () -> new BlockItem(ModBlocks.WILLOW_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_STORAGE_JAR = ITEMS.register("dead_storage_jar", () -> new BlockItem(ModBlocks.DEAD_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_STORAGE_JAR = ITEMS.register("magic_storage_jar", () -> new BlockItem(ModBlocks.MAGIC_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_STORAGE_JAR = ITEMS.register("umbran_storage_jar", () -> new BlockItem(ModBlocks.UMBRAN_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_STORAGE_JAR = ITEMS.register("hellbark_storage_jar", () -> new BlockItem(ModBlocks.HELLBARK_STORAGE_JAR.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_STORAGE_JAR = ITEMS.register("empyreal_storage_jar", () -> new BlockItem(ModBlocks.EMPYREAL_STORAGE_JAR.get(), new Item.Properties()));

    // === TABLES ===
    public static final RegistryObject<Item> FIR_TABLE = ITEMS.register("fir_table", () -> new BlockItem(ModBlocks.FIR_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_TABLE = ITEMS.register("pine_table", () -> new BlockItem(ModBlocks.PINE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_TABLE = ITEMS.register("maple_table", () -> new BlockItem(ModBlocks.MAPLE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_TABLE = ITEMS.register("redwood_table", () -> new BlockItem(ModBlocks.REDWOOD_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_TABLE = ITEMS.register("mahogany_table", () -> new BlockItem(ModBlocks.MAHOGANY_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_TABLE = ITEMS.register("jacaranda_table", () -> new BlockItem(ModBlocks.JACARANDA_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_TABLE = ITEMS.register("palm_table", () -> new BlockItem(ModBlocks.PALM_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_TABLE = ITEMS.register("willow_table", () -> new BlockItem(ModBlocks.WILLOW_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_TABLE = ITEMS.register("dead_table", () -> new BlockItem(ModBlocks.DEAD_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_TABLE = ITEMS.register("magic_table", () -> new BlockItem(ModBlocks.MAGIC_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_TABLE = ITEMS.register("umbran_table", () -> new BlockItem(ModBlocks.UMBRAN_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_TABLE = ITEMS.register("hellbark_table", () -> new BlockItem(ModBlocks.HELLBARK_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_TABLE = ITEMS.register("empyreal_table", () -> new BlockItem(ModBlocks.EMPYREAL_TABLE.get(), new Item.Properties()));

    // === TOILETS ===
    public static final RegistryObject<Item> FIR_TOILET = ITEMS.register("fir_toilet", () -> new BlockItem(ModBlocks.FIR_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_TOILET = ITEMS.register("pine_toilet", () -> new BlockItem(ModBlocks.PINE_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_TOILET = ITEMS.register("maple_toilet", () -> new BlockItem(ModBlocks.MAPLE_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_TOILET = ITEMS.register("redwood_toilet", () -> new BlockItem(ModBlocks.REDWOOD_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_TOILET = ITEMS.register("mahogany_toilet", () -> new BlockItem(ModBlocks.MAHOGANY_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_TOILET = ITEMS.register("jacaranda_toilet", () -> new BlockItem(ModBlocks.JACARANDA_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_TOILET = ITEMS.register("palm_toilet", () -> new BlockItem(ModBlocks.PALM_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_TOILET = ITEMS.register("willow_toilet", () -> new BlockItem(ModBlocks.WILLOW_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_TOILET = ITEMS.register("dead_toilet", () -> new BlockItem(ModBlocks.DEAD_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_TOILET = ITEMS.register("magic_toilet", () -> new BlockItem(ModBlocks.MAGIC_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_TOILET = ITEMS.register("umbran_toilet", () -> new BlockItem(ModBlocks.UMBRAN_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_TOILET = ITEMS.register("hellbark_toilet", () -> new BlockItem(ModBlocks.HELLBARK_TOILET.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_TOILET = ITEMS.register("empyreal_toilet", () -> new BlockItem(ModBlocks.EMPYREAL_TOILET.get(), new Item.Properties()));
    
    public static void register(IEventBus eventBus) {
    	ITEMS.register(eventBus);
    }
}
