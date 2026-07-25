package com.rslover521.furnituresoplenty.compat.backpacked;

import java.util.function.Function;

import com.mrcrayfish.backpacked.blockentity.ShelfBlockEntity;
import com.rslover521.furnituresoplenty.core.ModBlockEntities;
import com.rslover521.furnituresoplenty.core.ModBlocks;
import com.rslover521.furnituresoplenty.core.ModItems;
import biomesoplenty.api.block.BOPWoodTypes;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

public final class BackpackedCompat {
    public static RegistrySupplier<BlockEntityType<ShelfBlockEntity>> CUSTOM_SHELF;

    private BackpackedCompat() {
    }

    public static void register(BlockEntityType.BlockEntitySupplier<ShelfBlockEntity> blockEntityFactory,
            Function<WoodType, MapColor> mapColorFactory) {
        ModBlocks.FIR_BACKPACK_SHELF = registerShelf("fir", BOPWoodTypes.FIR, blockEntityFactory, mapColorFactory);
        ModBlocks.PINE_BACKPACK_SHELF = registerShelf("pine", BOPWoodTypes.PINE, blockEntityFactory, mapColorFactory);
        ModBlocks.MAPLE_BACKPACK_SHELF = registerShelf("maple", BOPWoodTypes.MAPLE, blockEntityFactory, mapColorFactory);
        ModBlocks.REDWOOD_BACKPACK_SHELF = registerShelf("redwood", BOPWoodTypes.REDWOOD, blockEntityFactory, mapColorFactory);
        ModBlocks.MAHOGANY_BACKPACK_SHELF = registerShelf("mahogany", BOPWoodTypes.MAHOGANY, blockEntityFactory, mapColorFactory);
        ModBlocks.JACARANDA_BACKPACK_SHELF = registerShelf("jacaranda", BOPWoodTypes.JACARANDA, blockEntityFactory, mapColorFactory);
        ModBlocks.PALM_BACKPACK_SHELF = registerShelf("palm", BOPWoodTypes.PALM, blockEntityFactory, mapColorFactory);
        ModBlocks.WILLOW_BACKPACK_SHELF = registerShelf("willow", BOPWoodTypes.WILLOW, blockEntityFactory, mapColorFactory);
        ModBlocks.DEAD_BACKPACK_SHELF = registerShelf("dead", BOPWoodTypes.DEAD, blockEntityFactory, mapColorFactory);
        ModBlocks.MAGIC_BACKPACK_SHELF = registerShelf("magic", BOPWoodTypes.MAGIC, blockEntityFactory, mapColorFactory);
        ModBlocks.UMBRAN_BACKPACK_SHELF = registerShelf("umbran", BOPWoodTypes.UMBRAN, blockEntityFactory, mapColorFactory);
        ModBlocks.HELLBARK_BACKPACK_SHELF = registerShelf("hellbark", BOPWoodTypes.HELLBARK, blockEntityFactory, mapColorFactory);
        ModBlocks.EMPYREAL_BACKPACK_SHELF = registerShelf("empyreal", BOPWoodTypes.EMPYREAL, blockEntityFactory, mapColorFactory);

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
                () -> BlockEntityType.Builder.of(blockEntityFactory,
                        ModBlocks.FIR_BACKPACK_SHELF.get(), ModBlocks.PINE_BACKPACK_SHELF.get(),
                        ModBlocks.MAPLE_BACKPACK_SHELF.get(), ModBlocks.REDWOOD_BACKPACK_SHELF.get(),
                        ModBlocks.MAHOGANY_BACKPACK_SHELF.get(), ModBlocks.JACARANDA_BACKPACK_SHELF.get(),
                        ModBlocks.PALM_BACKPACK_SHELF.get(), ModBlocks.WILLOW_BACKPACK_SHELF.get(),
                        ModBlocks.DEAD_BACKPACK_SHELF.get(), ModBlocks.MAGIC_BACKPACK_SHELF.get(),
                        ModBlocks.UMBRAN_BACKPACK_SHELF.get(), ModBlocks.HELLBARK_BACKPACK_SHELF.get(),
                        ModBlocks.EMPYREAL_BACKPACK_SHELF.get()).build(null));
    }

    private static RegistrySupplier<Block> registerShelf(String name, WoodType woodType,
            BlockEntityType.BlockEntitySupplier<ShelfBlockEntity> blockEntityFactory,
            Function<WoodType, MapColor> mapColorFactory) {
        return ModBlocks.BLOCKS.register(name + "_backpack_shelf",
                () -> new CustomShelfBlock(woodType, BlockBehaviour.Properties.of()
                        .mapColor(mapColorFactory.apply(woodType)).instrument(NoteBlockInstrument.BASS)
                        .strength(2.0F).sound(SoundType.WOOD).ignitedByLava()
                        .noOcclusion().forceSolidOn(), blockEntityFactory));
    }

    private static RegistrySupplier<Item> registerItem(String name, RegistrySupplier<Block> block) {
        return ModItems.ITEMS.register(name + "_backpack_shelf",
                () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
