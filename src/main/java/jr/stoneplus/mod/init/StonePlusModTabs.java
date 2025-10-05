/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jr.stoneplus.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import jr.stoneplus.mod.StonePlusMod;

public class StonePlusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StonePlusMod.MODID);
	public static final RegistryObject<CreativeModeTab> STONE_PLUS_TAB = REGISTRY.register("stone_plus_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stone_plus.stone_plus_tab")).icon(() -> new ItemStack(Blocks.STONE)).displayItems((parameters, tabData) -> {
				tabData.accept(StonePlusModBlocks.BASANITE.get().asItem());
				tabData.accept(StonePlusModBlocks.GABBRO.get().asItem());
				tabData.accept(StonePlusModBlocks.LIMESTONE.get().asItem());
				tabData.accept(StonePlusModBlocks.MARBLE.get().asItem());
				tabData.accept(StonePlusModBlocks.QUARTZITE.get().asItem());
				tabData.accept(StonePlusModBlocks.SCORIA.get().asItem());
				tabData.accept(StonePlusModBlocks.SHALE.get().asItem());
				tabData.accept(StonePlusModBlocks.SLATE.get().asItem());
				tabData.accept(StonePlusModBlocks.TRAVERTINE.get().asItem());
				tabData.accept(StonePlusModBlocks.GREENSTONE.get().asItem());
				tabData.accept(StonePlusModBlocks.COBBLED_GABBRO.get().asItem());
				tabData.accept(StonePlusModBlocks.COBBLED_SHALE.get().asItem());
				tabData.accept(StonePlusModBlocks.COBBLED_SLATE.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_BASANITE.get().asItem());
				tabData.accept(StonePlusModBlocks.BASANITE_BRICKS.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_LIMESTONE.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_MARBLE.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_QUARTZITE.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_SCORIA.get().asItem());
				tabData.accept(StonePlusModBlocks.SCORIA_BRICKS.get().asItem());
				tabData.accept(StonePlusModBlocks.CUT_TRAVERTINE.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_GREENSTONE.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_BASANITE_STAIRS.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_BASANITE_SLAB.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_BASANITE_WALL.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_LIMESTONE_STAIRS.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_LIMESTONE_SLAB.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_LIMESTONE_WALL.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_MARBLE_STAIRS.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_MARBLE_SLAB.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_MARBLE_WALL.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_QUARTZITE_STAIRS.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_QUARTZITE_SLAB.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_QUARTZITE_WALL.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_SCORIA_STAIRS.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_SCORIA_SLAB.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_SCORIA_WALL.get().asItem());
				tabData.accept(StonePlusModBlocks.CUT_TRAVERTINE_STAIRS.get().asItem());
				tabData.accept(StonePlusModBlocks.CUT_TRAVERTINE_SLAB.get().asItem());
				tabData.accept(StonePlusModBlocks.CUT_TRAVERTINE_WALL.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_GREENSTONE_STAIRS.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_GREENSTONE_SLAB.get().asItem());
				tabData.accept(StonePlusModBlocks.POLISHED_GREENSTONE_WALL.get().asItem());
			}).withSearchBar().build());
}