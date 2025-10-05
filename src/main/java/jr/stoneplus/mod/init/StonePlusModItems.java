/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jr.stoneplus.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import jr.stoneplus.mod.StonePlusMod;

public class StonePlusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StonePlusMod.MODID);
	public static final RegistryObject<Item> LIMESTONE = block(StonePlusModBlocks.LIMESTONE);
	public static final RegistryObject<Item> COBBLED_LIMESTONE = block(StonePlusModBlocks.COBBLED_LIMESTONE);
	public static final RegistryObject<Item> MARBLE = block(StonePlusModBlocks.MARBLE);
	public static final RegistryObject<Item> SLATE = block(StonePlusModBlocks.SLATE);
	public static final RegistryObject<Item> GNEISS = block(StonePlusModBlocks.GNEISS);
	public static final RegistryObject<Item> COBBLED_SLATE = block(StonePlusModBlocks.COBBLED_SLATE);
	public static final RegistryObject<Item> SCHIST = block(StonePlusModBlocks.SCHIST);
	public static final RegistryObject<Item> LIMESTONE_BRICKS = block(StonePlusModBlocks.LIMESTONE_BRICKS);
	public static final RegistryObject<Item> SLATE_BRICKS = block(StonePlusModBlocks.SLATE_BRICKS);
	public static final RegistryObject<Item> MARBLE_PILLAR = block(StonePlusModBlocks.MARBLE_PILLAR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}