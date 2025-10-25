package com.rslover521.furnituresoplenty.modFurnitures;

import com.mrcrayfish.furniture.refurbished.block.MetalType;
import com.rslover521.furnituresoplenty.FurnituresOPlenty;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = 
			DeferredRegister.create(ForgeRegistries.BLOCKS, FurnituresOPlenty.MODID);
			
	// === All Furniture Blocks in one class
	public static final RegistryObject<Block> FIR_BASIN;
	public static final RegistryObject<Block> PINE_BASIN;
	public static final RegistryObject<Block> MAPLE_BASIN;
	public static final RegistryObject<Block> REDWOOD_BASIN;
	public static final RegistryObject<Block> MAHOGANY_BASIN;
	public static final RegistryObject<Block> JACARANDA_BASIN;
	public static final RegistryObject<Block> PALM_BASIN;
	public static final RegistryObject<Block> WILLOW_BASIN;
	public static final RegistryObject<Block> DEAD_BASIN;
	public static final RegistryObject<Block> MAGIC_BASIN;
	public static final RegistryObject<Block> UMBRAN_BASIN;
	public static final RegistryObject<Block> HELLBARK_BASIN;
	public static final RegistryObject<Block> EMPYREAL_BASIN;

	public static final RegistryObject<Block> FIR_BATH;
	public static final RegistryObject<Block> PINE_BATH;
	public static final RegistryObject<Block> MAPLE_BATH;
	public static final RegistryObject<Block> REDWOOD_BATH;
	public static final RegistryObject<Block> MAHOGANY_BATH;
	public static final RegistryObject<Block> JACARANDA_BATH;
	public static final RegistryObject<Block> PALM_BATH;
	public static final RegistryObject<Block> WILLOW_BATH;
	public static final RegistryObject<Block> DEAD_BATH;
	public static final RegistryObject<Block> MAGIC_BATH;
	public static final RegistryObject<Block> UMBRAN_BATH;
	public static final RegistryObject<Block> HELLBARK_BATH;
	public static final RegistryObject<Block> EMPYREAL_BATH;

	public static final RegistryObject<Block> FIR_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> PINE_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> MAPLE_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> REDWOOD_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> MAHOGANY_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> JACARANDA_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> PALM_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> WILLOW_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> DEAD_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> MAGIC_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> UMBRAN_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> HELLBARK_LIGHT_CEILING_FAN;
	public static final RegistryObject<Block> EMPYREAL_LIGHT_CEILING_FAN;

	public static final RegistryObject<Block> FIR_DARK_CEILING_FAN;
	public static final RegistryObject<Block> PINE_DARK_CEILING_FAN;
	public static final RegistryObject<Block> MAPLE_DARK_CEILING_FAN;
	public static final RegistryObject<Block> REDWOOD_DARK_CEILING_FAN;
	public static final RegistryObject<Block> MAHOGANY_DARK_CEILING_FAN;
	public static final RegistryObject<Block> JACARANDA_DARK_CEILING_FAN;
	public static final RegistryObject<Block> PALM_DARK_CEILING_FAN;
	public static final RegistryObject<Block> WILLOW_DARK_CEILING_FAN;
	public static final RegistryObject<Block> DEAD_DARK_CEILING_FAN;
	public static final RegistryObject<Block> MAGIC_DARK_CEILING_FAN;
	public static final RegistryObject<Block> UMBRAN_DARK_CEILING_FAN;
	public static final RegistryObject<Block> HELLBARK_DARK_CEILING_FAN;
	public static final RegistryObject<Block> EMPYREAL_DARK_CEILING_FAN;

	public static final RegistryObject<Block> FIR_CHAIR;
	public static final RegistryObject<Block> PINE_CHAIR;
	public static final RegistryObject<Block> MAPLE_CHAIR;
	public static final RegistryObject<Block> REDWOOD_CHAIR;
	public static final RegistryObject<Block> MAHOGANY_CHAIR;
	public static final RegistryObject<Block> JACARANDA_CHAIR;
	public static final RegistryObject<Block> PALM_CHAIR;
	public static final RegistryObject<Block> WILLOW_CHAIR;
	public static final RegistryObject<Block> DEAD_CHAIR;
	public static final RegistryObject<Block> MAGIC_CHAIR;
	public static final RegistryObject<Block> UMBRAN_CHAIR;
	public static final RegistryObject<Block> HELLBARK_CHAIR;
	public static final RegistryObject<Block> EMPYREAL_CHAIR;

	public static final RegistryObject<Block> FIR_CRATE;
	public static final RegistryObject<Block> PINE_CRATE;
	public static final RegistryObject<Block> MAPLE_CRATE;
	public static final RegistryObject<Block> REDWOOD_CRATE;
	public static final RegistryObject<Block> MAHOGANY_CRATE;
	public static final RegistryObject<Block> JACARANDA_CRATE;
	public static final RegistryObject<Block> PALM_CRATE;
	public static final RegistryObject<Block> WILLOW_CRATE;
	public static final RegistryObject<Block> DEAD_CRATE;
	public static final RegistryObject<Block> MAGIC_CRATE;
	public static final RegistryObject<Block> UMBRAN_CRATE;
	public static final RegistryObject<Block> HELLBARK_CRATE;
	public static final RegistryObject<Block> EMPYREAL_CRATE;

	public static final RegistryObject<Block> FIR_CUTTING_BOARD;
	public static final RegistryObject<Block> PINE_CUTTING_BOARD;
	public static final RegistryObject<Block> MAPLE_CUTTING_BOARD;
	public static final RegistryObject<Block> REDWOOD_CUTTING_BOARD;
	public static final RegistryObject<Block> MAHOGANY_CUTTING_BOARD;
	public static final RegistryObject<Block> JACARANDA_CUTTING_BOARD;
	public static final RegistryObject<Block> PALM_CUTTING_BOARD;
	public static final RegistryObject<Block> WILLOW_CUTTING_BOARD;
	public static final RegistryObject<Block> DEAD_CUTTING_BOARD;
	public static final RegistryObject<Block> MAGIC_CUTTING_BOARD;
	public static final RegistryObject<Block> UMBRAN_CUTTING_BOARD;
	public static final RegistryObject<Block> HELLBARK_CUTTING_BOARD;
	public static final RegistryObject<Block> EMPYREAL_CUTTING_BOARD;

	public static final RegistryObject<Block> FIR_DESK;
	public static final RegistryObject<Block> PINE_DESK;
	public static final RegistryObject<Block> MAPLE_DESK;
	public static final RegistryObject<Block> REDWOOD_DESK;
	public static final RegistryObject<Block> MAHOGANY_DESK;
	public static final RegistryObject<Block> JACARANDA_DESK;
	public static final RegistryObject<Block> PALM_DESK; 
	public static final RegistryObject<Block> WILLOW_DESK;
	public static final RegistryObject<Block> DEAD_DESK;
	public static final RegistryObject<Block> MAGIC_DESK;
	public static final RegistryObject<Block> UMBRAN_DESK;
	public static final RegistryObject<Block> HELLBARK_DESK;
	public static final RegistryObject<Block> EMPYREAL_DESK;

	public static final RegistryObject<Block> FIR_DRAWER;
	public static final RegistryObject<Block> PINE_DRAWER;
	public static final RegistryObject<Block> MAPLE_DRAWER;
	public static final RegistryObject<Block> REDWOOD_DRAWER;
	public static final RegistryObject<Block> MAHOGANY_DRAWER;
	public static final RegistryObject<Block> JACARANDA_DRAWER;
	public static final RegistryObject<Block> PALM_DRAWER;
	public static final RegistryObject<Block> WILLOW_DRAWER;
	public static final RegistryObject<Block> DEAD_DRAWER;
	public static final RegistryObject<Block> MAGIC_DRAWER;
	public static final RegistryObject<Block> UMBRAN_DRAWER;
	public static final RegistryObject<Block> HELLBARK_DRAWER;
	public static final RegistryObject<Block> EMPYREAL_DRAWER;

	public static final RegistryObject<Block> FIR_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> PINE_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> MAPLE_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> REDWOOD_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> MAHOGANY_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> JACARANDA_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> PALM_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> WILLOW_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> DEAD_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> MAGIC_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> UMBRAN_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> HELLBARK_KITCHEN_CABINETRY;
	public static final RegistryObject<Block> EMPYREAL_KITCHEN_CABINETRY;

	public static final RegistryObject<Block> FIR_KITCHEN_DRAWER;
	public static final RegistryObject<Block> PINE_KITCHEN_DRAWER;
	public static final RegistryObject<Block> MAPLE_KITCHEN_DRAWER;
	public static final RegistryObject<Block> REDWOOD_KITCHEN_DRAWER;
	public static final RegistryObject<Block> MAHOGANY_KITCHEN_DRAWER;
	public static final RegistryObject<Block> JACARANDA_KITCHEN_DRAWER;
	public static final RegistryObject<Block> PALM_KITCHEN_DRAWER;
	public static final RegistryObject<Block> WILLOW_KITCHEN_DRAWER;
	public static final RegistryObject<Block> DEAD_KITCHEN_DRAWER;
	public static final RegistryObject<Block> MAGIC_KITCHEN_DRAWER;
	public static final RegistryObject<Block> UMBRAN_KITCHEN_DRAWER;
	public static final RegistryObject<Block> HELLBARK_KITCHEN_DRAWER;
	public static final RegistryObject<Block> EMPYREAL_KITCHEN_DRAWER;

	public static final RegistryObject<Block> FIR_KITCHEN_SINK;
	public static final RegistryObject<Block> PINE_KITCHEN_SINK;
	public static final RegistryObject<Block> MAPLE_KITCHEN_SINK;
	public static final RegistryObject<Block> REDWOOD_KITCHEN_SINK;
	public static final RegistryObject<Block> MAHOGANY_KITCHEN_SINK;
	public static final RegistryObject<Block> JACARANDA_KITCHEN_SINK;
	public static final RegistryObject<Block> PALM_KITCHEN_SINK;
	public static final RegistryObject<Block> WILLOW_KITCHEN_SINK;
	public static final RegistryObject<Block> DEAD_KITCHEN_SINK;
	public static final RegistryObject<Block> MAGIC_KITCHEN_SINK;
	public static final RegistryObject<Block> UMBRAN_KITCHEN_SINK;
	public static final RegistryObject<Block> HELLBARK_KITCHEN_SINK;
	public static final RegistryObject<Block> EMPYREAL_KITCHEN_SINK;

	public static final RegistryObject<Block> FIR_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> PINE_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> MAPLE_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> REDWOOD_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> MAHOGANY_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> JACARANDA_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> PALM_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> WILLOW_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> DEAD_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> MAGIC_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> UMBRAN_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> HELLBARK_KITCHEN_STORAGE_CABINET;
	public static final RegistryObject<Block> EMPYREAL_KITCHEN_STORAGE_CABINET;

	public static final RegistryObject<Block> FIR_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> PINE_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> MAPLE_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> REDWOOD_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> MAHOGANY_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> JACARANDA_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> PALM_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> WILLOW_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> DEAD_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> MAGIC_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> UMBRAN_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> HELLBARK_LATTICE_FENCE_GATE;
	public static final RegistryObject<Block> EMPYREAL_LATTICE_FENCE_GATE;
	
	public static final RegistryObject<Block> FIR_LATTICE_FENCE;
	public static final RegistryObject<Block> PINE_LATTICE_FENCE;
	public static final RegistryObject<Block> MAPLE_LATTICE_FENCE;
	public static final RegistryObject<Block> REDWOOD_LATTICE_FENCE;
	public static final RegistryObject<Block> MAHOGANY_LATTICE_FENCE;
	public static final RegistryObject<Block> JACARANDA_LATTICE_FENCE;
	public static final RegistryObject<Block> PALM_LATTICE_FENCE;
	public static final RegistryObject<Block> WILLOW_LATTICE_FENCE;
	public static final RegistryObject<Block> DEAD_LATTICE_FENCE;
	public static final RegistryObject<Block> MAGIC_LATTICE_FENCE;
	public static final RegistryObject<Block> UMBRAN_LATTICE_FENCE;
	public static final RegistryObject<Block> HELLBARK_LATTICE_FENCE;
	public static final RegistryObject<Block> EMPYREAL_LATTICE_FENCE;

	public static final RegistryObject<Block> FIR_MAIL_BOX;
	public static final RegistryObject<Block> PINE_MAIL_BOX;
	public static final RegistryObject<Block> MAPLE_MAIL_BOX;
	public static final RegistryObject<Block> REDWOOD_MAIL_BOX;
	public static final RegistryObject<Block> MAHOGANY_MAIL_BOX;
	public static final RegistryObject<Block> JACARANDA_MAIL_BOX;
	public static final RegistryObject<Block> PALM_MAIL_BOX;
	public static final RegistryObject<Block> WILLOW_MAIL_BOX;
	public static final RegistryObject<Block> DEAD_MAIL_BOX;
	public static final RegistryObject<Block> MAGIC_MAIL_BOX;
	public static final RegistryObject<Block> UMBRAN_MAIL_BOX;
	public static final RegistryObject<Block> HELLBARK_MAIL_BOX;
	public static final RegistryObject<Block> EMPYREAL_MAIL_BOX;

	public static final RegistryObject<Block> FIR_STORAGE_CABINET;
	public static final RegistryObject<Block> PINE_STORAGE_CABINET;
	public static final RegistryObject<Block> MAPLE_STORAGE_CABINET;
	public static final RegistryObject<Block> REDWOOD_STORAGE_CABINET;
	public static final RegistryObject<Block> MAHOGANY_STORAGE_CABINET;
	public static final RegistryObject<Block> JACARANDA_STORAGE_CABINET;
	public static final RegistryObject<Block> PALM_STORAGE_CABINET;
	public static final RegistryObject<Block> WILLOW_STORAGE_CABINET;
	public static final RegistryObject<Block> DEAD_STORAGE_CABINET;
	public static final RegistryObject<Block> MAGIC_STORAGE_CABINET;
	public static final RegistryObject<Block> UMBRAN_STORAGE_CABINET;
	public static final RegistryObject<Block> HELLBARK_STORAGE_CABINET;
	public static final RegistryObject<Block> EMPYREAL_STORAGE_CABINET;

	public static final RegistryObject<Block> FIR_STORAGE_JAR;
	public static final RegistryObject<Block> PINE_STORAGE_JAR;
	public static final RegistryObject<Block> MAPLE_STORAGE_JAR;
	public static final RegistryObject<Block> REDWOOD_STORAGE_JAR;
	public static final RegistryObject<Block> MAHOGANY_STORAGE_JAR;
	public static final RegistryObject<Block> JACARANDA_STORAGE_JAR;
	public static final RegistryObject<Block> PALM_STORAGE_JAR;
	public static final RegistryObject<Block> WILLOW_STORAGE_JAR;
	public static final RegistryObject<Block> DEAD_STORAGE_JAR;
	public static final RegistryObject<Block> MAGIC_STORAGE_JAR;
	public static final RegistryObject<Block> UMBRAN_STORAGE_JAR;
	public static final RegistryObject<Block> HELLBARK_STORAGE_JAR;
	public static final RegistryObject<Block> EMPYREAL_STORAGE_JAR;

	public static final RegistryObject<Block> FIR_TABLE;
	public static final RegistryObject<Block> PINE_TABLE;
	public static final RegistryObject<Block> MAPLE_TABLE;
	public static final RegistryObject<Block> REDWOOD_TABLE;
	public static final RegistryObject<Block> MAHOGANY_TABLE;
	public static final RegistryObject<Block> JACARANDA_TABLE;
	public static final RegistryObject<Block> PALM_TABLE;
	public static final RegistryObject<Block> WILLOW_TABLE;
	public static final RegistryObject<Block> DEAD_TABLE;
	public static final RegistryObject<Block> MAGIC_TABLE;
	public static final RegistryObject<Block> UMBRAN_TABLE;
	public static final RegistryObject<Block> HELLBARK_TABLE;
	public static final RegistryObject<Block> EMPYREAL_TABLE;

	public static final RegistryObject<Block> FIR_TOILET;
	public static final RegistryObject<Block> PINE_TOILET;
	public static final RegistryObject<Block> MAPLE_TOILET;
	public static final RegistryObject<Block> REDWOOD_TOILET;
	public static final RegistryObject<Block> MAHOGANY_TOILET;
	public static final RegistryObject<Block> JACARANDA_TOILET;
	public static final RegistryObject<Block> PALM_TOILET;
	public static final RegistryObject<Block> WILLOW_TOILET;
	public static final RegistryObject<Block> DEAD_TOILET;
	public static final RegistryObject<Block> MAGIC_TOILET;
	public static final RegistryObject<Block> UMBRAN_TOILET;
	public static final RegistryObject<Block> HELLBARK_TOILET;
	public static final RegistryObject<Block> EMPYREAL_TOILET;

	static {
		FIR_BASIN = registerBasin("fir", BOPWoodTypes.FIR);
		PINE_BASIN = registerBasin("pine", BOPWoodTypes.PINE);
		MAPLE_BASIN = registerBasin("maple", BOPWoodTypes.MAPLE);
		REDWOOD_BASIN = registerBasin("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_BASIN = registerBasin("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_BASIN = registerBasin("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_BASIN = registerBasin("palm", BOPWoodTypes.PALM);
		WILLOW_BASIN = registerBasin("willow", BOPWoodTypes.WILLOW);
		DEAD_BASIN = registerBasin("dead", BOPWoodTypes.DEAD);
		MAGIC_BASIN = registerBasin("magic", BOPWoodTypes.MAGIC);
		UMBRAN_BASIN = registerBasin("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_BASIN = registerBasin("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_BASIN = registerBasin("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_BATH = registerBath("fir", BOPWoodTypes.FIR);
		PINE_BATH = registerBath("pine", BOPWoodTypes.PINE);
		MAPLE_BATH = registerBath("maple", BOPWoodTypes.MAPLE);
		REDWOOD_BATH = registerBath("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_BATH = registerBath("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_BATH = registerBath("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_BATH = registerBath("palm", BOPWoodTypes.PALM);
		WILLOW_BATH = registerBath("willow", BOPWoodTypes.WILLOW);
		DEAD_BATH = registerBath("dead", BOPWoodTypes.DEAD);
		MAGIC_BATH = registerBath("magic", BOPWoodTypes.MAGIC);
		UMBRAN_BATH = registerBath("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_BATH = registerBath("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_BATH = registerBath("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_LIGHT_CEILING_FAN = registerCeilingFans("light", "fir", BOPWoodTypes.FIR);
		PINE_LIGHT_CEILING_FAN = registerCeilingFans("light", "pine", BOPWoodTypes.PINE);
		MAPLE_LIGHT_CEILING_FAN = registerCeilingFans("light", "maple", BOPWoodTypes.MAPLE);
		REDWOOD_LIGHT_CEILING_FAN = registerCeilingFans("light", "redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_LIGHT_CEILING_FAN = registerCeilingFans("light", "mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_LIGHT_CEILING_FAN = registerCeilingFans("light", "jacaranda", BOPWoodTypes.JACARANDA);
		PALM_LIGHT_CEILING_FAN = registerCeilingFans("light", "palm", BOPWoodTypes.PALM);
		WILLOW_LIGHT_CEILING_FAN = registerCeilingFans("light", "willow", BOPWoodTypes.WILLOW);
		DEAD_LIGHT_CEILING_FAN = registerCeilingFans("light", "dead", BOPWoodTypes.DEAD);
		MAGIC_LIGHT_CEILING_FAN = registerCeilingFans("light", "magic", BOPWoodTypes.MAGIC);
		UMBRAN_LIGHT_CEILING_FAN = registerCeilingFans("light", "umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_LIGHT_CEILING_FAN = registerCeilingFans("light", "hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_LIGHT_CEILING_FAN = registerCeilingFans("light", "empyreal", BOPWoodTypes.EMPYREAL);
		
		FIR_DARK_CEILING_FAN = registerCeilingFans("dark", "fir", BOPWoodTypes.FIR);
		PINE_DARK_CEILING_FAN = registerCeilingFans("dark", "pine", BOPWoodTypes.PINE);
		MAPLE_DARK_CEILING_FAN = registerCeilingFans("dark", "maple", BOPWoodTypes.MAPLE);
		REDWOOD_DARK_CEILING_FAN = registerCeilingFans("dark", "redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_DARK_CEILING_FAN = registerCeilingFans("dark", "mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_DARK_CEILING_FAN = registerCeilingFans("dark", "jacaranda", BOPWoodTypes.JACARANDA);
		PALM_DARK_CEILING_FAN = registerCeilingFans("dark", "palm", BOPWoodTypes.PALM);
		WILLOW_DARK_CEILING_FAN = registerCeilingFans("dark", "willow", BOPWoodTypes.WILLOW);
		DEAD_DARK_CEILING_FAN = registerCeilingFans("dark", "dead", BOPWoodTypes.DEAD);
		MAGIC_DARK_CEILING_FAN = registerCeilingFans("dark", "magic", BOPWoodTypes.MAGIC);
		UMBRAN_DARK_CEILING_FAN = registerCeilingFans("dark", "umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_DARK_CEILING_FAN = registerCeilingFans("dark", "hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_DARK_CEILING_FAN = registerCeilingFans("dark", "empyreal", BOPWoodTypes.EMPYREAL);

		FIR_CHAIR = registerChair("fir", BOPWoodTypes.FIR);
		PINE_CHAIR = registerChair("pine", BOPWoodTypes.PINE);
		MAPLE_CHAIR = registerChair("maple", BOPWoodTypes.MAPLE);
		REDWOOD_CHAIR = registerChair("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_CHAIR = registerChair("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_CHAIR = registerChair("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_CHAIR = registerChair("palm", BOPWoodTypes.PALM);
		WILLOW_CHAIR = registerChair("willow", BOPWoodTypes.WILLOW);
		DEAD_CHAIR = registerChair("dead", BOPWoodTypes.DEAD);
		MAGIC_CHAIR = registerChair("magic", BOPWoodTypes.MAGIC);
		UMBRAN_CHAIR = registerChair("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_CHAIR = registerChair("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_CHAIR = registerChair("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_CRATE = registerCrate("fir", BOPWoodTypes.FIR);
		PINE_CRATE = registerCrate ("pine", BOPWoodTypes.PINE);
		MAPLE_CRATE = registerCrate("maple", BOPWoodTypes.MAPLE);
		REDWOOD_CRATE = registerCrate("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_CRATE = registerCrate("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_CRATE = registerCrate("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_CRATE = registerCrate("palm", BOPWoodTypes.PALM);
		WILLOW_CRATE = registerCrate("willow", BOPWoodTypes.WILLOW);
		DEAD_CRATE = registerCrate("dead", BOPWoodTypes.DEAD);
		MAGIC_CRATE = registerCrate("magic", BOPWoodTypes.MAGIC);
		UMBRAN_CRATE = registerCrate("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_CRATE = registerCrate("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_CRATE = registerCrate("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_CUTTING_BOARD = registerCuttingBoard("fir", BOPWoodTypes.FIR);
		PINE_CUTTING_BOARD = registerCuttingBoard("pine", BOPWoodTypes.PINE);
		MAPLE_CUTTING_BOARD = registerCuttingBoard("maple", BOPWoodTypes.MAPLE);
		REDWOOD_CUTTING_BOARD = registerCuttingBoard("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_CUTTING_BOARD = registerCuttingBoard("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_CUTTING_BOARD = registerCuttingBoard("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_CUTTING_BOARD = registerCuttingBoard("palm", BOPWoodTypes.PALM);
		WILLOW_CUTTING_BOARD = registerCuttingBoard("willow", BOPWoodTypes.WILLOW);
		DEAD_CUTTING_BOARD = registerCuttingBoard("dead", BOPWoodTypes.DEAD);
		MAGIC_CUTTING_BOARD = registerCuttingBoard("magic", BOPWoodTypes.MAGIC);
		UMBRAN_CUTTING_BOARD = registerCuttingBoard("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_CUTTING_BOARD = registerCuttingBoard("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_CUTTING_BOARD = registerCuttingBoard("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_DESK = registerDesk("fir", BOPWoodTypes.FIR);
		PINE_DESK = registerDesk("pine", BOPWoodTypes.PINE);
		MAPLE_DESK = registerDesk("maple", BOPWoodTypes.MAPLE);
		REDWOOD_DESK = registerDesk("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_DESK = registerDesk("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_DESK = registerDesk("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_DESK = registerDesk("palm", BOPWoodTypes.PALM);
		WILLOW_DESK = registerDesk("willow", BOPWoodTypes.WILLOW);
		DEAD_DESK = registerDesk("dead", BOPWoodTypes.DEAD);
		MAGIC_DESK = registerDesk("magic", BOPWoodTypes.MAGIC);
		UMBRAN_DESK = registerDesk("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_DESK = registerDesk("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_DESK = registerDesk("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_DRAWER = registerDrawer("fir", BOPWoodTypes.FIR);
		PINE_DRAWER = registerDrawer("pine", BOPWoodTypes.PINE);
		MAPLE_DRAWER = registerDrawer("maple", BOPWoodTypes.MAPLE);
		REDWOOD_DRAWER = registerDrawer("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_DRAWER = registerDrawer("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_DRAWER = registerDrawer("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_DRAWER = registerDrawer("palm", BOPWoodTypes.PALM);
		WILLOW_DRAWER = registerDrawer("willow", BOPWoodTypes.WILLOW);
		DEAD_DRAWER = registerDrawer("dead", BOPWoodTypes.DEAD);
		MAGIC_DRAWER = registerDrawer("magic", BOPWoodTypes.MAGIC);
		UMBRAN_DRAWER = registerDrawer("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_DRAWER = registerDrawer("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_DRAWER = registerDrawer("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_KITCHEN_CABINETRY = registerKitchenCabinetry("fir", BOPWoodTypes.FIR);
		PINE_KITCHEN_CABINETRY = registerKitchenCabinetry("pine", BOPWoodTypes.PINE);
		MAPLE_KITCHEN_CABINETRY = registerKitchenCabinetry("maple", BOPWoodTypes.MAPLE);
		REDWOOD_KITCHEN_CABINETRY = registerKitchenCabinetry("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_KITCHEN_CABINETRY = registerKitchenCabinetry("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_KITCHEN_CABINETRY = registerKitchenCabinetry("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_KITCHEN_CABINETRY = registerKitchenCabinetry("palm", BOPWoodTypes.PALM);
		WILLOW_KITCHEN_CABINETRY = registerKitchenCabinetry("willow", BOPWoodTypes.WILLOW);
		DEAD_KITCHEN_CABINETRY = registerKitchenCabinetry("dead", BOPWoodTypes.DEAD);
		MAGIC_KITCHEN_CABINETRY = registerKitchenCabinetry("magic", BOPWoodTypes.MAGIC);
		UMBRAN_KITCHEN_CABINETRY = registerKitchenCabinetry("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_KITCHEN_CABINETRY = registerKitchenCabinetry("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_KITCHEN_CABINETRY = registerKitchenCabinetry("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_KITCHEN_DRAWER = registerKitchenDrawer("fir", BOPWoodTypes.FIR);
		PINE_KITCHEN_DRAWER = registerKitchenDrawer("pine", BOPWoodTypes.PINE);
		MAPLE_KITCHEN_DRAWER = registerKitchenDrawer("maple", BOPWoodTypes.MAPLE);
		REDWOOD_KITCHEN_DRAWER = registerKitchenDrawer("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_KITCHEN_DRAWER = registerKitchenDrawer("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_KITCHEN_DRAWER = registerKitchenDrawer("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_KITCHEN_DRAWER = registerKitchenDrawer("palm", BOPWoodTypes.PALM);
		WILLOW_KITCHEN_DRAWER = registerKitchenDrawer("willow", BOPWoodTypes.WILLOW);
		DEAD_KITCHEN_DRAWER = registerKitchenDrawer("dead", BOPWoodTypes.DEAD);
		MAGIC_KITCHEN_DRAWER = registerKitchenDrawer("magic", BOPWoodTypes.MAGIC);
		UMBRAN_KITCHEN_DRAWER = registerKitchenDrawer("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_KITCHEN_DRAWER = registerKitchenDrawer("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_KITCHEN_DRAWER = registerKitchenDrawer("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_KITCHEN_SINK = registerKitchenSink("fir", BOPWoodTypes.FIR);
		PINE_KITCHEN_SINK = registerKitchenSink("pine", BOPWoodTypes.PINE);
		MAPLE_KITCHEN_SINK = registerKitchenSink("maple", BOPWoodTypes.MAPLE);
		REDWOOD_KITCHEN_SINK = registerKitchenSink("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_KITCHEN_SINK = registerKitchenSink("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_KITCHEN_SINK = registerKitchenSink("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_KITCHEN_SINK = registerKitchenSink("palm", BOPWoodTypes.PALM);
		WILLOW_KITCHEN_SINK = registerKitchenSink("willow", BOPWoodTypes.WILLOW);
		DEAD_KITCHEN_SINK = registerKitchenSink("dead", BOPWoodTypes.DEAD);
		MAGIC_KITCHEN_SINK = registerKitchenSink("magic", BOPWoodTypes.MAGIC);
		UMBRAN_KITCHEN_SINK = registerKitchenSink("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_KITCHEN_SINK = registerKitchenSink("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_KITCHEN_SINK = registerKitchenSink("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("fir", BOPWoodTypes.FIR);
		PINE_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("pine", BOPWoodTypes.PINE);
		MAPLE_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("maple", BOPWoodTypes.MAPLE);
		REDWOOD_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("palm", BOPWoodTypes.PALM);
		WILLOW_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("willow", BOPWoodTypes.WILLOW);
		DEAD_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("dead", BOPWoodTypes.DEAD);
		MAGIC_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("magic", BOPWoodTypes.MAGIC);
		UMBRAN_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_KITCHEN_STORAGE_CABINET = registerKitchenStorageCabinets("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_LATTICE_FENCE_GATE = registerLatticeFenceGate("fir", BOPWoodTypes.FIR);
		PINE_LATTICE_FENCE_GATE = registerLatticeFenceGate("pine", BOPWoodTypes.PINE);
		MAPLE_LATTICE_FENCE_GATE = registerLatticeFenceGate("maple", BOPWoodTypes.MAPLE);
		REDWOOD_LATTICE_FENCE_GATE = registerLatticeFenceGate("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_LATTICE_FENCE_GATE = registerLatticeFenceGate("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_LATTICE_FENCE_GATE = registerLatticeFenceGate("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_LATTICE_FENCE_GATE = registerLatticeFenceGate("palm", BOPWoodTypes.PALM);
		WILLOW_LATTICE_FENCE_GATE = registerLatticeFenceGate("willow", BOPWoodTypes.WILLOW);
		DEAD_LATTICE_FENCE_GATE = registerLatticeFenceGate("dead", BOPWoodTypes.DEAD);
		MAGIC_LATTICE_FENCE_GATE = registerLatticeFenceGate("magic", BOPWoodTypes.MAGIC);
		UMBRAN_LATTICE_FENCE_GATE = registerLatticeFenceGate("unbran", BOPWoodTypes.UMBRAN);
		HELLBARK_LATTICE_FENCE_GATE = registerLatticeFenceGate("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_LATTICE_FENCE_GATE = registerLatticeFenceGate("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_LATTICE_FENCE = registerLatticeFences("fir", BOPWoodTypes.FIR);
		PINE_LATTICE_FENCE = registerLatticeFences("pine", BOPWoodTypes.PINE);
		MAPLE_LATTICE_FENCE = registerLatticeFences("maple", BOPWoodTypes.MAPLE);
		REDWOOD_LATTICE_FENCE = registerLatticeFences("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_LATTICE_FENCE = registerLatticeFences("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_LATTICE_FENCE = registerLatticeFences("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_LATTICE_FENCE = registerLatticeFences("palm", BOPWoodTypes.PALM);
		WILLOW_LATTICE_FENCE = registerLatticeFences("willow", BOPWoodTypes.WILLOW);
		DEAD_LATTICE_FENCE = registerLatticeFences("dead", BOPWoodTypes.DEAD);
		MAGIC_LATTICE_FENCE = registerLatticeFences("magic", BOPWoodTypes.MAGIC);
		UMBRAN_LATTICE_FENCE = registerLatticeFences("unbran", BOPWoodTypes.UMBRAN);
		HELLBARK_LATTICE_FENCE = registerLatticeFences("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_LATTICE_FENCE = registerLatticeFences("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_MAIL_BOX = registerMailBox("fir", BOPWoodTypes.FIR);
		PINE_MAIL_BOX = registerMailBox("pine", BOPWoodTypes.PINE);
		MAPLE_MAIL_BOX = registerMailBox("maple", BOPWoodTypes.MAPLE);
		REDWOOD_MAIL_BOX = registerMailBox("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_MAIL_BOX = registerMailBox("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_MAIL_BOX = registerMailBox("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_MAIL_BOX = registerMailBox("palm", BOPWoodTypes.PALM);
		WILLOW_MAIL_BOX = registerMailBox("willow", BOPWoodTypes.WILLOW);
		DEAD_MAIL_BOX = registerMailBox("dead", BOPWoodTypes.DEAD);
		MAGIC_MAIL_BOX = registerMailBox("magic", BOPWoodTypes.MAGIC);
		UMBRAN_MAIL_BOX = registerMailBox("unbran", BOPWoodTypes.UMBRAN);
		HELLBARK_MAIL_BOX = registerMailBox("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_MAIL_BOX = registerMailBox("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_STORAGE_CABINET = registerStorageCabinets("fir", BOPWoodTypes.FIR);
		PINE_STORAGE_CABINET = registerStorageCabinets("pine", BOPWoodTypes.PINE);
		MAPLE_STORAGE_CABINET = registerStorageCabinets("maple", BOPWoodTypes.MAPLE);
		REDWOOD_STORAGE_CABINET = registerStorageCabinets("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_STORAGE_CABINET = registerStorageCabinets("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_STORAGE_CABINET = registerStorageCabinets("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_STORAGE_CABINET = registerStorageCabinets("palm", BOPWoodTypes.PALM);
		WILLOW_STORAGE_CABINET = registerStorageCabinets("willow", BOPWoodTypes.WILLOW);
		DEAD_STORAGE_CABINET = registerStorageCabinets("dead", BOPWoodTypes.DEAD);
		MAGIC_STORAGE_CABINET = registerStorageCabinets("magic", BOPWoodTypes.MAGIC);
		UMBRAN_STORAGE_CABINET = registerStorageCabinets("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_STORAGE_CABINET = registerStorageCabinets("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_STORAGE_CABINET = registerStorageCabinets("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_STORAGE_JAR = registerStorageJar("fir", BOPWoodTypes.FIR);
		PINE_STORAGE_JAR = registerStorageJar("pine", BOPWoodTypes.PINE);
		MAPLE_STORAGE_JAR = registerStorageJar("maple", BOPWoodTypes.MAPLE);
		REDWOOD_STORAGE_JAR = registerStorageJar("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_STORAGE_JAR = registerStorageJar("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_STORAGE_JAR = registerStorageJar("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_STORAGE_JAR = registerStorageJar("palm", BOPWoodTypes.PALM);
		WILLOW_STORAGE_JAR = registerStorageJar("willow", BOPWoodTypes.WILLOW);
		DEAD_STORAGE_JAR = registerStorageJar("dead", BOPWoodTypes.DEAD);
		MAGIC_STORAGE_JAR = registerStorageJar("magic", BOPWoodTypes.MAGIC);
		UMBRAN_STORAGE_JAR = registerStorageJar("unbran", BOPWoodTypes.UMBRAN);
		HELLBARK_STORAGE_JAR = registerStorageJar("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_STORAGE_JAR = registerStorageJar("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_TABLE = registerTable("fir", BOPWoodTypes.FIR);
		PINE_TABLE = registerTable("pine", BOPWoodTypes.PINE);
		MAPLE_TABLE = registerTable("maple", BOPWoodTypes.MAPLE);
		REDWOOD_TABLE = registerTable("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_TABLE = registerTable("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_TABLE = registerTable("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_TABLE = registerTable("palm", BOPWoodTypes.PALM);
		WILLOW_TABLE = registerTable("willow", BOPWoodTypes.WILLOW);
		DEAD_TABLE = registerTable("dead", BOPWoodTypes.DEAD);
		MAGIC_TABLE = registerTable("magic", BOPWoodTypes.MAGIC);
		UMBRAN_TABLE = registerTable("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_TABLE = registerTable("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_TABLE = registerTable("empyreal", BOPWoodTypes.EMPYREAL);

		FIR_TOILET = registerToilet("fir", BOPWoodTypes.FIR);
		PINE_TOILET = registerToilet("pine", BOPWoodTypes.PINE);
		MAPLE_TOILET = registerToilet("maple", BOPWoodTypes.MAPLE);
		REDWOOD_TOILET = registerToilet("redwood", BOPWoodTypes.REDWOOD);
		MAHOGANY_TOILET = registerToilet("mahogany", BOPWoodTypes.MAHOGANY);
		JACARANDA_TOILET = registerToilet("jacaranda", BOPWoodTypes.JACARANDA);
		PALM_TOILET = registerToilet("palm", BOPWoodTypes.PALM);
		WILLOW_TOILET = registerToilet("willow", BOPWoodTypes.WILLOW);
		DEAD_TOILET = registerToilet("dead", BOPWoodTypes.DEAD);
		MAGIC_TOILET = registerToilet("magic", BOPWoodTypes.MAGIC);
		UMBRAN_TOILET = registerToilet("umbran", BOPWoodTypes.UMBRAN);
		HELLBARK_TOILET = registerToilet("hellbark", BOPWoodTypes.HELLBARK);
		EMPYREAL_TOILET = registerToilet("empyreal", BOPWoodTypes.EMPYREAL);
	}

	public static void register(IEventBus modEventBus) {
		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);
	}

	private static RegistryObject<Block> registerBasin(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_basin", () -> 
				new CustomBasinBlock(woodType));
		ITEMS.register(name + "_basin", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_basin");
		return block;
	}
	
	private static RegistryObject<Block> registerBath(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_bath", () -> 
				new CustomBathBlock(woodType));
		ITEMS.register(name + "_bath", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_bath");
		return block;
	}
	
	private static RegistryObject<Block> registerCeilingFans(String metalType, String wood, WoodType woodType) {
		MetalType type = metalType.equals("light") ? MetalType.LIGHT : MetalType.DARK;
		RegistryObject<Block> block = BLOCKS.register(metalType + "_" + wood + "_ceiling_fan", () -> 
				new CustomCeilingFanBlock(woodType, type));
		ITEMS.register(metalType + "_" + wood + "_ceiling_fan", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + metalType + "_" + wood + "_ceiling_fan");
		return block;
	}

	private static RegistryObject<Block> registerChair(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_chair", () -> 
				new CustomChairBlock(woodType));
		ITEMS.register(name + "_chair", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_chair");
		return block;
	}

	private static RegistryObject<Block> registerCrate(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_crate", () -> 
				new CustomCrateBlock(woodType));
		ITEMS.register(name + "_crate", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_crate");
		return block;
	}
	
	private static RegistryObject<Block> registerCuttingBoard(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_cutting_board", () -> 
				new CustomCuttingBoardBlock(woodType));
		ITEMS.register(name + "_cutting_board", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_cutting_board");
		return block;
	}

	private static RegistryObject<Block> registerDesk(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_desk", () -> 
				new CustomDeskBlock(woodType));
		ITEMS.register(name + "_desk", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_desk");
		return block;
	}
	
	private static RegistryObject<Block> registerDrawer(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_drawer", () -> 
				new CustomDrawerBlock(woodType));
		ITEMS.register(name + "_drawer", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + name + "_drawer");
		return block;
	}
	
	private static RegistryObject<Block> registerKitchenCabinetry(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_kitchen_cabinetry", () -> 
				new CustomKitchenCabinetryBlock(woodType));
		ITEMS.register(name + "_kitchen_cabinetry", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_kitchen_cabinetry");
		return block;
	}

	private static RegistryObject<Block> registerKitchenDrawer(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_kitchen_drawer", () -> 
				new CustomKitchenDrawerBlock(woodType));
		ITEMS.register(name + "_kitchen_drawer", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_kitchen_drawer");
		return block;
	}
	
	private static RegistryObject<Block> registerKitchenSink(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_kitchen_sink", () -> 
				new CustomKitchenSinkBlock(woodType));
		ITEMS.register(name + "_kitchen_sink", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_kitchen_sink");
		return block;
	}

	private static RegistryObject<Block> registerKitchenStorageCabinets(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_kitchen_storage_cabinet", () -> 
				new CustomKitchenStorageCabinetBlock(woodType));
		ITEMS.register(name + "_kitchen_storage_cabinet", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name 
				+ "_kitchen_storage_cabinet");
		return block;
	}

	private static RegistryObject<Block> registerLatticeFenceGate(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_lattice_fence_gate", () -> 
				new CustomLatticeFenceGateBlock(woodType));
		ITEMS.register(name + "_lattice_fence_gate", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_lattice_fence_gate");
		return block;
	}

	private static RegistryObject<Block> registerLatticeFences(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_lattice_fence", () -> 
				new CustomLatticeFenceBlock(woodType));
		ITEMS.register(name + "_lattice_fence", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_lattice_fence");
		return block;
	}

	private static RegistryObject<Block> registerMailBox(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_mail_box", () -> 
				new CustomMailboxBlock(woodType));
		ITEMS.register(name + "_mail_box", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_mail_box");
		return block;
	}

	private static RegistryObject<Block> registerStorageCabinets(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_storage_cabinets", () -> 
				new CustomStorageCabinetBlock(woodType));
		ITEMS.register(name + "_storage_cabinets", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name 
				+ "_storage_cabinets");
		return block;
	}

	private static RegistryObject<Block> registerStorageJar(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_storage_jar", () -> 
				new CustomStorageJarBlock(woodType));
		ITEMS.register(name + "_storage_jar", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_storage_jar");
		return block;
	}

	private static RegistryObject<Block> registerTable(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_table", () -> 
				new CustomTableBlock(woodType));
		ITEMS.register(name + "_table", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_table");
		return block;
	}

	private static RegistryObject<Block> registerToilet(String name, WoodType woodType) {
		RegistryObject<Block> block = BLOCKS.register(name + "_toilet", () -> 
				new CustomToiletBlock(woodType));
		ITEMS.register(name + "_table", () -> 
				new BlockItem(block.get(), new Item.Properties()));
		FurnituresOPlenty.LOGGER.info("Successfully registered block and item for " + FurnituresOPlenty.MODID + ":" + name + "_toilet");
		return block;
	}
}
