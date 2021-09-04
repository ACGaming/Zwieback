package mod.acgaming.zwieback;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import mod.acgaming.zwieback.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class ZwiebackMod implements ModInitializer
{
    public static final String MOD_ID = "zwieback";

    public static final ItemGroup ZwiebackGroup = FabricItemGroupBuilder.create(new Identifier(ZwiebackMod.MOD_ID, "zwieback_items")).icon(() -> new ItemStack(ModItems.ZWIEBACK)).appendItems(stacks -> {
        stacks.add(new ItemStack(ModItems.RAW_EINBACK));
        stacks.add(new ItemStack(ModItems.EINBACK));
        stacks.add(new ItemStack(ModItems.ZWIEBACK));
        stacks.add(new ItemStack(ModItems.ZWIEBACK_SLICE));
    }).build();

    @Override
    public void onInitialize()
    {
        ModItems.registerItems();
    }
}