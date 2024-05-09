package cafe.seafarers.item;

import cafe.seafarers.MyCraftEssentials;
import cafe.seafarers.block.ModBlocks;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static List<Item> ITEMS = new ArrayList<>();

    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings()
            .food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).build())));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        ITEMS.add(item);
        return Registry.register(Registries.ITEM, new Identifier(MyCraftEssentials.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MyCraftEssentials.LOGGER.info(MyCraftEssentials.MOD_ID, ": Registering Mod Items...");
    }
}
