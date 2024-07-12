package net.prisma.mistborn.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.prisma.mistborn.ScadrianInvestiture;

public class ModItemGroups {

    public static final ItemGroup MISTBORN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ScadrianInvestiture.MOD_ID, "scadrian-investiture"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scadrian-investiture"))
                    .icon(() -> new ItemStack(ModItems.INGOT_STEEL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.INGOT_STEEL);
                        entries.add(ModItems.INGOT_TIN);
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.INGOT_PEWTER);
                        entries.add(ModItems.INGOT_ZINC);
                        entries.add(ModItems.RAW_ZINC);
                        entries.add(ModItems.INGOT_BRASS);
                        entries.add(ModItems.INGOT_BRONZE);
                        entries.add(ModItems.INGOT_SILVER);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.INGOT_ELECTRUM);
                        entries.add(ModItems.INGOT_CADMIUM);
                        entries.add(ModItems.RAW_CADMIUM);
                        entries.add(ModItems.INGOT_BENDALLOY);
                        entries.add(ModItems.INGOT_ALUMINUM);
                        entries.add(ModItems.RAW_ALUMINUM);
                        entries.add(ModItems.INGOT_DURALUMIN);
                        entries.add(ModItems.INGOT_CHROMIUM);
                        entries.add(ModItems.RAW_CHROMIUM);
                        entries.add(ModItems.INGOT_NICROSIL);
                    }).build());

    public static void registerItemGroups() {
        ScadrianInvestiture.LOGGER.info("Registering item groups");

    }

}
