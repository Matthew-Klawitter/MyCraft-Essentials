package cafe.seafarers.block;

import cafe.seafarers.MyCraftEssentials;
import cafe.seafarers.block.custom.TomatoCropBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static List<Block> BLOCKS = new ArrayList<>();

    // Crops are to be registered individually and act more like items (see blocks inherited from CropBlock)
    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK,
            new Identifier(MyCraftEssentials.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        BLOCKS.add(block);
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MyCraftEssentials.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MyCraftEssentials.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MyCraftEssentials.LOGGER.info(MyCraftEssentials.MOD_ID, ": Registering Mod Blocks...");
    }
}