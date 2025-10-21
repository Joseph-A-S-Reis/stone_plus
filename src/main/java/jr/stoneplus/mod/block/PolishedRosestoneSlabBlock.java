package jr.stoneplus.mod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class PolishedRosestoneSlabBlock extends SlabBlock {
	public PolishedRosestoneSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.7f, 5.5f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}