package mod.acgaming.zwieback.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import mod.acgaming.zwieback.ZwiebackMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItems
{
    public static final Item RAW_EINBACK = new Item(new FabricItemSettings().group(ZwiebackMod.ZwiebackGroup));
    public static final Item ZWIEBACK = new Item(new FabricItemSettings().group(ZwiebackMod.ZwiebackGroup));

    public static final Item EINBACK = new Item(new FabricItemSettings()
        .group(ZwiebackMod.ZwiebackGroup)
        .food((new FoodComponent.Builder())
            .hunger(4)
            .saturationModifier(0.6F)
            .build()));

    public static final Item ZWIEBACK_SLICE = new Item(new FabricItemSettings()
        .group(ZwiebackMod.ZwiebackGroup)
        .food((new FoodComponent.Builder())
            .alwaysEdible()
            .snack()
            .hunger(2)
            .saturationModifier(0.4F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 0), 1.0F)
            .build()));

    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(ZwiebackMod.MOD_ID, "raw_einback"), RAW_EINBACK);
        Registry.register(Registry.ITEM, new Identifier(ZwiebackMod.MOD_ID, "einback"), EINBACK);
        Registry.register(Registry.ITEM, new Identifier(ZwiebackMod.MOD_ID, "zwieback"), ZWIEBACK);
        Registry.register(Registry.ITEM, new Identifier(ZwiebackMod.MOD_ID, "zwieback_slice"), ZWIEBACK_SLICE);
    }
}