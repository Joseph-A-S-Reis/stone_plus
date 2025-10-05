/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jr.stoneplus.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import jr.stoneplus.mod.block.SlateBricksBlock;
import jr.stoneplus.mod.block.SlateBlock;
import jr.stoneplus.mod.block.SchistBlock;
import jr.stoneplus.mod.block.MarblePillarBlock;
import jr.stoneplus.mod.block.MarbleBlock;
import jr.stoneplus.mod.block.LimestoneBricksBlock;
import jr.stoneplus.mod.block.LimestoneBlock;
import jr.stoneplus.mod.block.GneissBlock;
import jr.stoneplus.mod.block.CobbledSlateBlock;
import jr.stoneplus.mod.block.CobbledLimestoneBlock;
import jr.stoneplus.mod.StonePlusMod;

public class StonePlusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StonePlusMod.MODID);
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> COBBLED_LIMESTONE = REGISTRY.register("cobbled_limestone", () -> new CobbledLimestoneBlock());
	public static final RegistryObject<Block> MARBLE = REGISTRY.register("marble", () -> new MarbleBlock());
	public static final RegistryObject<Block> SLATE = REGISTRY.register("slate", () -> new SlateBlock());
	public static final RegistryObject<Block> GNEISS = REGISTRY.register("gneiss", () -> new GneissBlock());
	public static final RegistryObject<Block> COBBLED_SLATE = REGISTRY.register("cobbled_slate", () -> new CobbledSlateBlock());
	public static final RegistryObject<Block> SCHIST = REGISTRY.register("schist", () -> new SchistBlock());
	public static final RegistryObject<Block> LIMESTONE_BRICKS = REGISTRY.register("limestone_bricks", () -> new LimestoneBricksBlock());
	public static final RegistryObject<Block> SLATE_BRICKS = REGISTRY.register("slate_bricks", () -> new SlateBricksBlock());
	public static final RegistryObject<Block> MARBLE_PILLAR = REGISTRY.register("marble_pillar", () -> new MarblePillarBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}