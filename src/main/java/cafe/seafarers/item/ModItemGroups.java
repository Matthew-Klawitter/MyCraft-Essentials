package cafe.seafarers.item;

import cafe.seafarers.MyCraftEssentials;
import cafe.seafarers.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MYCRAFTESSENTIALS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MyCraftEssentials.MOD_ID, "mycraftessentials"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mycraftessentials"))
                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries((displayContext, entries) -> {

                for (Item item : ModItems.ITEMS) {
                    entries.add(item);
                }

                for (Block block : ModBlocks.BLOCKS) {
                    entries.add(block);
                }

            }).build());

    public static void registerItemGroups() {
        MyCraftEssentials.LOGGER.info(MyCraftEssentials.MOD_ID, ": Registering ItemGroups...");
    }
}
