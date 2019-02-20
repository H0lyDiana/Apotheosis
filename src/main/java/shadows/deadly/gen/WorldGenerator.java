package shadows.deadly.gen;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Predicate;

import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.MutableBlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import shadows.deadly.DeadlyModule;
import shadows.deadly.config.DeadlyConfig;

public class WorldGenerator {

	public static final List<WorldFeature> FEATURES = new ArrayList<>();
	public static final BrutalSpawner BRUTAL_SPAWNER = new BrutalSpawner();
	public static final BossFeature BOSS_GENERATOR = new BossFeature();
	public static final SwarmSpawner SWARM_SPAWNER = new SwarmSpawner();
	public static final LongList SUCCESSES = new LongArrayList();
	public static final Predicate<IBlockState> STONE_TEST = s -> s.getBlock() == Blocks.STONE && s.getValue(BlockStone.VARIANT).isNatural();

	@SubscribeEvent
	public void terrainGen(PopulateChunkEvent.Pre e) {
		if (DeadlyConfig.DIM_WHITELIST.contains(e.getWorld().provider.getDimension())) for (WorldFeature feature : FEATURES) {
			if (SUCCESSES.contains(ChunkPos.asLong(e.getChunkX(), e.getChunkZ()))) return;
			feature.generate(e.getWorld(), e.getChunkX(), e.getChunkZ(), e.getRand());
		}
	}

	public static void init() {
		if (BRUTAL_SPAWNER.isEnabled()) FEATURES.add(BRUTAL_SPAWNER);
		if (SWARM_SPAWNER.isEnabled()) FEATURES.add(SWARM_SPAWNER);
		if (BOSS_GENERATOR.isEnabled()) FEATURES.add(BOSS_GENERATOR);
	}

	public static void debugPillar(World world, BlockPos pos) {
		MutableBlockPos mPos = new MutableBlockPos(pos);
		DeadlyModule.LOGGER.info("Marking! " + pos.toString());
		while (mPos.getY() < 127)
			world.setBlockState(mPos.setPos(mPos.getX(), mPos.getY() + 1, mPos.getZ()), Blocks.GLASS.getDefaultState());
	}

	public static final boolean DEBUG = false;

	public static void debugLog(BlockPos pos, String name) {
		if (DEBUG) DeadlyModule.LOGGER.info("Generated {} at {}", name, pos);
	}
}