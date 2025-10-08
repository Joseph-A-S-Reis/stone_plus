package jr.stoneplus.mod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class PolishedDeepdayWallBlock extends WallBlock {
	public PolishedDeepdayWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.9f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).forceSolidOn());
	}
}