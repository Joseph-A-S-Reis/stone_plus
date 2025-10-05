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
	public static final RegistryObject<Item> BASANITE = block(StonePlusModBlocks.BASANITE);
	public static final RegistryObject<Item> GABBRO = block(StonePlusModBlocks.GABBRO);
	public static final RegistryObject<Item> LIMESTONE = block(StonePlusModBlocks.LIMESTONE);
	public static final RegistryObject<Item> MARBLE = block(StonePlusModBlocks.MARBLE);
	public static final RegistryObject<Item> QUARTZITE = block(StonePlusModBlocks.QUARTZITE);
	public static final RegistryObject<Item> SCORIA = block(StonePlusModBlocks.SCORIA);
	public static final RegistryObject<Item> SHALE = block(StonePlusModBlocks.SHALE);
	public static final RegistryObject<Item> SLATE = block(StonePlusModBlocks.SLATE);
	public static final RegistryObject<Item> TRAVERTINE = block(StonePlusModBlocks.TRAVERTINE);
	public static final RegistryObject<Item> GREENSTONE = block(StonePlusModBlocks.GREENSTONE);
	public static final RegistryObject<Item> COBBLED_GABBRO = block(StonePlusModBlocks.COBBLED_GABBRO);
	public static final RegistryObject<Item> COBBLED_SHALE = block(StonePlusModBlocks.COBBLED_SHALE);
	public static final RegistryObject<Item> COBBLED_SLATE = block(StonePlusModBlocks.COBBLED_SLATE);
	public static final RegistryObject<Item> POLISHED_BASANITE = block(StonePlusModBlocks.POLISHED_BASANITE);
	public static final RegistryObject<Item> BASANITE_BRICKS = block(StonePlusModBlocks.BASANITE_BRICKS);
	public static final RegistryObject<Item> POLISHED_LIMESTONE = block(StonePlusModBlocks.POLISHED_LIMESTONE);
	public static final RegistryObject<Item> POLISHED_MARBLE = block(StonePlusModBlocks.POLISHED_MARBLE);
	public static final RegistryObject<Item> POLISHED_QUARTZITE = block(StonePlusModBlocks.POLISHED_QUARTZITE);
	public static final RegistryObject<Item> POLISHED_SCORIA = block(StonePlusModBlocks.POLISHED_SCORIA);
	public static final RegistryObject<Item> SCORIA_BRICKS = block(StonePlusModBlocks.SCORIA_BRICKS);
	public static final RegistryObject<Item> CUT_TRAVERTINE = block(StonePlusModBlocks.CUT_TRAVERTINE);
	public static final RegistryObject<Item> POLISHED_GREENSTONE = block(StonePlusModBlocks.POLISHED_GREENSTONE);
	public static final RegistryObject<Item> POLISHED_BASANITE_STAIRS = block(StonePlusModBlocks.POLISHED_BASANITE_STAIRS);
	public static final RegistryObject<Item> POLISHED_BASANITE_SLAB = block(StonePlusModBlocks.POLISHED_BASANITE_SLAB);
	public static final RegistryObject<Item> POLISHED_BASANITE_WALL = block(StonePlusModBlocks.POLISHED_BASANITE_WALL);
	public static final RegistryObject<Item> POLISHED_LIMESTONE_STAIRS = block(StonePlusModBlocks.POLISHED_LIMESTONE_STAIRS);
	public static final RegistryObject<Item> POLISHED_LIMESTONE_SLAB = block(StonePlusModBlocks.POLISHED_LIMESTONE_SLAB);
	public static final RegistryObject<Item> POLISHED_LIMESTONE_WALL = block(StonePlusModBlocks.POLISHED_LIMESTONE_WALL);
	public static final RegistryObject<Item> POLISHED_MARBLE_STAIRS = block(StonePlusModBlocks.POLISHED_MARBLE_STAIRS);
	public static final RegistryObject<Item> POLISHED_MARBLE_SLAB = block(StonePlusModBlocks.POLISHED_MARBLE_SLAB);
	public static final RegistryObject<Item> POLISHED_MARBLE_WALL = block(StonePlusModBlocks.POLISHED_MARBLE_WALL);
	public static final RegistryObject<Item> POLISHED_QUARTZITE_STAIRS = block(StonePlusModBlocks.POLISHED_QUARTZITE_STAIRS);
	public static final RegistryObject<Item> POLISHED_QUARTZITE_SLAB = block(StonePlusModBlocks.POLISHED_QUARTZITE_SLAB);
	public static final RegistryObject<Item> POLISHED_QUARTZITE_WALL = block(StonePlusModBlocks.POLISHED_QUARTZITE_WALL);
	public static final RegistryObject<Item> POLISHED_SCORIA_STAIRS = block(StonePlusModBlocks.POLISHED_SCORIA_STAIRS);
	public static final RegistryObject<Item> POLISHED_SCORIA_SLAB = block(StonePlusModBlocks.POLISHED_SCORIA_SLAB);
	public static final RegistryObject<Item> POLISHED_SCORIA_WALL = block(StonePlusModBlocks.POLISHED_SCORIA_WALL);
	public static final RegistryObject<Item> CUT_TRAVERTINE_STAIRS = block(StonePlusModBlocks.CUT_TRAVERTINE_STAIRS);
	public static final RegistryObject<Item> CUT_TRAVERTINE_SLAB = block(StonePlusModBlocks.CUT_TRAVERTINE_SLAB);
	public static final RegistryObject<Item> CUT_TRAVERTINE_WALL = block(StonePlusModBlocks.CUT_TRAVERTINE_WALL);
	public static final RegistryObject<Item> POLISHED_GREENSTONE_STAIRS = block(StonePlusModBlocks.POLISHED_GREENSTONE_STAIRS);
	public static final RegistryObject<Item> POLISHED_GREENSTONE_SLAB = block(StonePlusModBlocks.POLISHED_GREENSTONE_SLAB);
	public static final RegistryObject<Item> POLISHED_GREENSTONE_WALL = block(StonePlusModBlocks.POLISHED_GREENSTONE_WALL);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}