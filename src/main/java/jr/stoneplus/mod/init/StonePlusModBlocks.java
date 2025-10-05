/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package jr.stoneplus.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import jr.stoneplus.mod.block.TravertineBlock;
import jr.stoneplus.mod.block.SlateBlock;
import jr.stoneplus.mod.block.ShaleBlock;
import jr.stoneplus.mod.block.ScoriaBricksBlock;
import jr.stoneplus.mod.block.ScoriaBlock;
import jr.stoneplus.mod.block.QuartziteBlock;
import jr.stoneplus.mod.block.PolishedScoriaWallBlock;
import jr.stoneplus.mod.block.PolishedScoriaStairsBlock;
import jr.stoneplus.mod.block.PolishedScoriaSlabBlock;
import jr.stoneplus.mod.block.PolishedScoriaBlock;
import jr.stoneplus.mod.block.PolishedQuartziteWallBlock;
import jr.stoneplus.mod.block.PolishedQuartziteStairsBlock;
import jr.stoneplus.mod.block.PolishedQuartziteSlabBlock;
import jr.stoneplus.mod.block.PolishedQuartziteBlock;
import jr.stoneplus.mod.block.PolishedMarbleWallBlock;
import jr.stoneplus.mod.block.PolishedMarbleStairsBlock;
import jr.stoneplus.mod.block.PolishedMarbleSlabBlock;
import jr.stoneplus.mod.block.PolishedMarbleBlock;
import jr.stoneplus.mod.block.PolishedLimestoneWallBlock;
import jr.stoneplus.mod.block.PolishedLimestoneStairsBlock;
import jr.stoneplus.mod.block.PolishedLimestoneSlabBlock;
import jr.stoneplus.mod.block.PolishedLimestoneBlock;
import jr.stoneplus.mod.block.PolishedGreenstoneWallBlock;
import jr.stoneplus.mod.block.PolishedGreenstoneStairsBlock;
import jr.stoneplus.mod.block.PolishedGreenstoneSlabBlock;
import jr.stoneplus.mod.block.PolishedGreenstoneBlock;
import jr.stoneplus.mod.block.PolishedBasaniteWallBlock;
import jr.stoneplus.mod.block.PolishedBasaniteStairsBlock;
import jr.stoneplus.mod.block.PolishedBasaniteSlabBlock;
import jr.stoneplus.mod.block.PolishedBasaniteBlock;
import jr.stoneplus.mod.block.MarbleBlock;
import jr.stoneplus.mod.block.LimestoneBlock;
import jr.stoneplus.mod.block.GreenstoneBlock;
import jr.stoneplus.mod.block.GabbroBlock;
import jr.stoneplus.mod.block.CutTravertineWallBlock;
import jr.stoneplus.mod.block.CutTravertineStairsBlock;
import jr.stoneplus.mod.block.CutTravertineSlabBlock;
import jr.stoneplus.mod.block.CutTravertineBlock;
import jr.stoneplus.mod.block.CobbledSlateBlock;
import jr.stoneplus.mod.block.CobbledShaleBlock;
import jr.stoneplus.mod.block.CobbledGabbroBlock;
import jr.stoneplus.mod.block.BasaniteBricksBlock;
import jr.stoneplus.mod.block.BasaniteBlock;
import jr.stoneplus.mod.StonePlusMod;

public class StonePlusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StonePlusMod.MODID);
	public static final RegistryObject<Block> BASANITE = REGISTRY.register("basanite", () -> new BasaniteBlock());
	public static final RegistryObject<Block> GABBRO = REGISTRY.register("gabbro", () -> new GabbroBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> MARBLE = REGISTRY.register("marble", () -> new MarbleBlock());
	public static final RegistryObject<Block> QUARTZITE = REGISTRY.register("quartzite", () -> new QuartziteBlock());
	public static final RegistryObject<Block> SCORIA = REGISTRY.register("scoria", () -> new ScoriaBlock());
	public static final RegistryObject<Block> SHALE = REGISTRY.register("shale", () -> new ShaleBlock());
	public static final RegistryObject<Block> SLATE = REGISTRY.register("slate", () -> new SlateBlock());
	public static final RegistryObject<Block> TRAVERTINE = REGISTRY.register("travertine", () -> new TravertineBlock());
	public static final RegistryObject<Block> GREENSTONE = REGISTRY.register("greenstone", () -> new GreenstoneBlock());
	public static final RegistryObject<Block> COBBLED_GABBRO = REGISTRY.register("cobbled_gabbro", () -> new CobbledGabbroBlock());
	public static final RegistryObject<Block> COBBLED_SHALE = REGISTRY.register("cobbled_shale", () -> new CobbledShaleBlock());
	public static final RegistryObject<Block> COBBLED_SLATE = REGISTRY.register("cobbled_slate", () -> new CobbledSlateBlock());
	public static final RegistryObject<Block> POLISHED_BASANITE = REGISTRY.register("polished_basanite", () -> new PolishedBasaniteBlock());
	public static final RegistryObject<Block> BASANITE_BRICKS = REGISTRY.register("basanite_bricks", () -> new BasaniteBricksBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE = REGISTRY.register("polished_limestone", () -> new PolishedLimestoneBlock());
	public static final RegistryObject<Block> POLISHED_MARBLE = REGISTRY.register("polished_marble", () -> new PolishedMarbleBlock());
	public static final RegistryObject<Block> POLISHED_QUARTZITE = REGISTRY.register("polished_quartzite", () -> new PolishedQuartziteBlock());
	public static final RegistryObject<Block> POLISHED_SCORIA = REGISTRY.register("polished_scoria", () -> new PolishedScoriaBlock());
	public static final RegistryObject<Block> SCORIA_BRICKS = REGISTRY.register("scoria_bricks", () -> new ScoriaBricksBlock());
	public static final RegistryObject<Block> CUT_TRAVERTINE = REGISTRY.register("cut_travertine", () -> new CutTravertineBlock());
	public static final RegistryObject<Block> POLISHED_GREENSTONE = REGISTRY.register("polished_greenstone", () -> new PolishedGreenstoneBlock());
	public static final RegistryObject<Block> POLISHED_BASANITE_STAIRS = REGISTRY.register("polished_basanite_stairs", () -> new PolishedBasaniteStairsBlock());
	public static final RegistryObject<Block> POLISHED_BASANITE_SLAB = REGISTRY.register("polished_basanite_slab", () -> new PolishedBasaniteSlabBlock());
	public static final RegistryObject<Block> POLISHED_BASANITE_WALL = REGISTRY.register("polished_basanite_wall", () -> new PolishedBasaniteWallBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = REGISTRY.register("polished_limestone_stairs", () -> new PolishedLimestoneStairsBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = REGISTRY.register("polished_limestone_slab", () -> new PolishedLimestoneSlabBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = REGISTRY.register("polished_limestone_wall", () -> new PolishedLimestoneWallBlock());
	public static final RegistryObject<Block> POLISHED_MARBLE_STAIRS = REGISTRY.register("polished_marble_stairs", () -> new PolishedMarbleStairsBlock());
	public static final RegistryObject<Block> POLISHED_MARBLE_SLAB = REGISTRY.register("polished_marble_slab", () -> new PolishedMarbleSlabBlock());
	public static final RegistryObject<Block> POLISHED_MARBLE_WALL = REGISTRY.register("polished_marble_wall", () -> new PolishedMarbleWallBlock());
	public static final RegistryObject<Block> POLISHED_QUARTZITE_STAIRS = REGISTRY.register("polished_quartzite_stairs", () -> new PolishedQuartziteStairsBlock());
	public static final RegistryObject<Block> POLISHED_QUARTZITE_SLAB = REGISTRY.register("polished_quartzite_slab", () -> new PolishedQuartziteSlabBlock());
	public static final RegistryObject<Block> POLISHED_QUARTZITE_WALL = REGISTRY.register("polished_quartzite_wall", () -> new PolishedQuartziteWallBlock());
	public static final RegistryObject<Block> POLISHED_SCORIA_STAIRS = REGISTRY.register("polished_scoria_stairs", () -> new PolishedScoriaStairsBlock());
	public static final RegistryObject<Block> POLISHED_SCORIA_SLAB = REGISTRY.register("polished_scoria_slab", () -> new PolishedScoriaSlabBlock());
	public static final RegistryObject<Block> POLISHED_SCORIA_WALL = REGISTRY.register("polished_scoria_wall", () -> new PolishedScoriaWallBlock());
	public static final RegistryObject<Block> CUT_TRAVERTINE_STAIRS = REGISTRY.register("cut_travertine_stairs", () -> new CutTravertineStairsBlock());
	public static final RegistryObject<Block> CUT_TRAVERTINE_SLAB = REGISTRY.register("cut_travertine_slab", () -> new CutTravertineSlabBlock());
	public static final RegistryObject<Block> CUT_TRAVERTINE_WALL = REGISTRY.register("cut_travertine_wall", () -> new CutTravertineWallBlock());
	public static final RegistryObject<Block> POLISHED_GREENSTONE_STAIRS = REGISTRY.register("polished_greenstone_stairs", () -> new PolishedGreenstoneStairsBlock());
	public static final RegistryObject<Block> POLISHED_GREENSTONE_SLAB = REGISTRY.register("polished_greenstone_slab", () -> new PolishedGreenstoneSlabBlock());
	public static final RegistryObject<Block> POLISHED_GREENSTONE_WALL = REGISTRY.register("polished_greenstone_wall", () -> new PolishedGreenstoneWallBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}