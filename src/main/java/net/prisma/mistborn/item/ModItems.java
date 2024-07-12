package net.prisma.mistborn.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prisma.mistborn.ScadrianInvestiture;

public class ModItems {

    public static final Item INGOT_STEEL = registerItem("steel-ingot", new Item(new FabricItemSettings()));
    public static final Item INGOT_TIN = registerItem("tin-ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_TIN = registerItem("tin-raw", new Item(new FabricItemSettings()));
    public static final Item INGOT_PEWTER = registerItem("pewter-ingot", new Item(new FabricItemSettings()));
    public static final Item INGOT_ZINC = registerItem("zinc-ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ZINC = registerItem("zinc-raw", new Item(new FabricItemSettings()));
    public static final Item INGOT_BRASS = registerItem("brass-ingot", new Item(new FabricItemSettings()));
    public static final Item INGOT_BRONZE = registerItem("bronze-ingot", new Item(new FabricItemSettings()));
    public static final Item INGOT_SILVER = registerItem("silver-ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("silver-raw", new Item(new FabricItemSettings()));
    public static final Item INGOT_ELECTRUM = registerItem("electrum-ingot", new Item(new FabricItemSettings()));
    public static final Item INGOT_CADMIUM = registerItem("cadmium-ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_CADMIUM = registerItem("cadmium-raw", new Item(new FabricItemSettings()));
    public static final Item INGOT_BENDALLOY = registerItem("bendalloy-ingot", new Item(new FabricItemSettings()));
    public static final Item INGOT_ALUMINUM = registerItem("aluminum-ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ALUMINUM = registerItem("aluminum-raw", new Item(new FabricItemSettings()));
    public static final Item INGOT_DURALUMIN = registerItem("duralumin-ingot", new Item(new FabricItemSettings()));
    public static final Item INGOT_CHROMIUM = registerItem("chromium-ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_CHROMIUM = registerItem("chromium-raw", new Item(new FabricItemSettings()));
    public static final Item INGOT_NICROSIL = registerItem("nicrosil-ingot", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ScadrianInvestiture.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ScadrianInvestiture.LOGGER.info("Registering mod items for Scadrian Investiture");

    }

}
