package com.rslover521.furnituresoplenty.compat.backpacked;

import java.util.function.Supplier;

import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import com.rslover521.furnituresoplenty.core.ModBlocks;
import com.rslover521.furnituresoplenty.core.ModItems;
import com.rslover521.furnituresoplenty.customBlockEntities.CustomShelfBlockEntity;
import com.rslover521.furnituresoplenty.customFurnitures.CustomShelfBlock;

import biomesoplenty.api.block.BOPWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.RegistryObject;

/** Loaded only after Forge confirms that Backpacked is present. */
public final class BackpackedCompat {
    public static RegistryObject<BlockEntityType<CustomShelfBlockEntity>> CUSTOM_SHELF;

    private BackpackedCompat() {
    }

    public static void register() {
        ModBlocks.FIR_BACKPACK_SHELF = registerShelf("fir", BOPWoodTypes.FIR);
        ModBlocks.PINE_BACKPACK_SHELF = registerShelf("pine", BOPWoodTypes.PINE);
        ModBlocks.MAPLE_BACKPACK_SHELF = registerShelf("maple", BOPWoodTypes.MAPLE);
        ModBlocks.REDWOOD_BACKPACK_SHELF = registerShelf("redwood", BOPWoodTypes.REDWOOD);
        ModBlocks.MAHOGANY_BACKPACK_SHELF = registerShelf("mahogany", BOPWoodTypes.MAHOGANY);
        ModBlocks.JACARANDA_BACKPACK_SHELF = registerShelf("jacaranda", BOPWoodTypes.JACARANDA);
        ModBlocks.PALM_BACKPACK_SHELF = registerShelf("palm", BOPWoodTypes.PALM);
        ModBlocks.WILLOW_BACKPACK_SHELF = registerShelf("willow", BOPWoodTypes.WILLOW);
        ModBlocks.DEAD_BACKPACK_SHELF = registerShelf("dead", BOPWoodTypes.DEAD);
        ModBlocks.MAGIC_BACKPACK_SHELF = registerShelf("magic", BOPWoodTypes.MAGIC);
        ModBlocks.UMBRAN_BACKPACK_SHELF = registerShelf("umbran", BOPWoodTypes.UMBRAN);
        ModBlocks.HELLBARK_BACKPACK_SHELF = registerShelf("hellbark", BOPWoodTypes.HELLBARK);
        ModBlocks.EMPYREAL_BACKPACK_SHELF = registerShelf("empyreal", BOPWoodTypes.EMPYREAL);

        ModItems.FIR_BACKPACK_SHELF = registerItem("fir", ModBlocks.FIR_BACKPACK_SHELF);
        ModItems.PINE_BACKPACK_SHELF = registerItem("pine", ModBlocks.PINE_BACKPACK_SHELF);
        ModItems.MAPLE_BACKPACK_SHELF = registerItem("maple", ModBlocks.MAPLE_BACKPACK_SHELF);
        ModItems.REDWOOD_BACKPACK_SHELF = registerItem("redwood", ModBlocks.REDWOOD_BACKPACK_SHELF);
        ModItems.MAHOGANY_BACKPACK_SHELF = registerItem("mahogany", ModBlocks.MAHOGANY_BACKPACK_SHELF);
        ModItems.JACARANDA_BACKPACK_SHELF = registerItem("jacaranda", ModBlocks.JACARANDA_BACKPACK_SHELF);
        ModItems.PALM_BACKPACK_SHELF = registerItem("palm", ModBlocks.PALM_BACKPACK_SHELF);
        ModItems.WILLOW_BACKPACK_SHELF = registerItem("willow", ModBlocks.WILLOW_BACKPACK_SHELF);
        ModItems.DEAD_BACKPACK_SHELF = registerItem("dead", ModBlocks.DEAD_BACKPACK_SHELF);
        ModItems.MAGIC_BACKPACK_SHELF = registerItem("magic", ModBlocks.MAGIC_BACKPACK_SHELF);
        ModItems.UMBRAN_BACKPACK_SHELF = registerItem("umbran", ModBlocks.UMBRAN_BACKPACK_SHELF);
        ModItems.HELLBARK_BACKPACK_SHELF = registerItem("hellbark", ModBlocks.HELLBARK_BACKPACK_SHELF);
        ModItems.EMPYREAL_BACKPACK_SHELF = registerItem("empyreal", ModBlocks.EMPYREAL_BACKPACK_SHELF);

        CUSTOM_SHELF = ModBlockEntities.BLOCK_ENTITIES.register("custom_shelf",
                () -> BlockEntityType.Builder.of(CustomShelfBlockEntity::new,
                        ModBlocks.FIR_BACKPACK_SHELF.get(), ModBlocks.PINE_BACKPACK_SHELF.get(),
                        ModBlocks.MAPLE_BACKPACK_SHELF.get(), ModBlocks.REDWOOD_BACKPACK_SHELF.get(),
                        ModBlocks.MAHOGANY_BACKPACK_SHELF.get(), ModBlocks.JACARANDA_BACKPACK_SHELF.get(),
                        ModBlocks.PALM_BACKPACK_SHELF.get(), ModBlocks.WILLOW_BACKPACK_SHELF.get(),
                        ModBlocks.DEAD_BACKPACK_SHELF.get(), ModBlocks.MAGIC_BACKPACK_SHELF.get(),
                        ModBlocks.UMBRAN_BACKPACK_SHELF.get(), ModBlocks.HELLBARK_BACKPACK_SHELF.get(),
                        ModBlocks.EMPYREAL_BACKPACK_SHELF.get()).build(null));
    }

    private static RegistryObject<Block> registerShelf(String name, WoodType woodType) {
        return ModBlocks.BLOCKS.register(name + "_backpack_shelf", () -> {
            Supplier<Block> plankSupplier = ModBlocks.BOP_PLANKS_BY_WOOD.get(woodType);
            Block planks = plankSupplier.get();
            return new CustomShelfBlock(woodType, BlockBehaviour.Properties.of()
                    .mapColor(planks.defaultMapColor()).instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sound(SoundType.WOOD).ignitedByLava()
                    .noOcclusion().forceSolidOn());
        });
    }

    private static RegistryObject<Item> registerItem(String name, RegistryObject<Block> block) {
        return ModItems.ITEMS.register(name + "_backpack_shelf",
                () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
