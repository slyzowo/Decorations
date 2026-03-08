package net.slyzowo.decorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.slyzowo.decorations.entity.ModEntities;
import net.slyzowo.decorations.entity.custom.ChairEntity;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import java.util.List;

public class ChairBlock extends HorizontalFacingBlock {
  public static final MapCodec<ChairBlock> CODEC = createCodec(ChairBlock::new);
  private static final VoxelShape CHAIR_BOTTOM_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 9.0, 14.0);
  private static final VoxelShape BASE_CHAIR_SHAPE = VoxelShapes.union(CHAIR_BOTTOM_SHAPE);

  public static final VoxelShape NORTH_SHAPE = VoxelShapes.union(
          Block.createCuboidShape(2.0, 9.0, 12.0, 14.0, 21.0, 14.0),
          BASE_CHAIR_SHAPE
  );
  public static final VoxelShape EAST_SHAPE = VoxelShapes.union(
          Block.createCuboidShape(2.0, 9.0, 2.0, 4.0, 21.0, 14.0),
          BASE_CHAIR_SHAPE
  );
  public static final VoxelShape SOUTH_SHAPE = VoxelShapes.union(
          Block.createCuboidShape(2.0, 9.0, 2.0, 14.0, 21.0, 4.0),
          BASE_CHAIR_SHAPE
  );
  public static final VoxelShape WEST_SHAPE = VoxelShapes.union(
          Block.createCuboidShape(12.0, 9.0, 2.0, 14.0, 21.0, 14.0),
          BASE_CHAIR_SHAPE
  );

  public ChairBlock(Settings settings) {
    super(settings);
  }

  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
    if(!world.isClient()) {
      Entity entity = null;
      List<ChairEntity> entities = world.getEntitiesByType(ModEntities.CHAIR, new Box(pos), chair -> true);
      if(entities.isEmpty()) {
        entity = ModEntities.CHAIR.spawn((ServerWorld) world, pos, SpawnReason.TRIGGERED);
      } else {
        entity = entities.get(0);
      }

      player.startRiding(entity);
    }

    return ActionResult.SUCCESS;
  }

  @Override
  protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    switch ((Direction)state.get(FACING)) {
      case NORTH:
        return NORTH_SHAPE;
      case SOUTH:
        return SOUTH_SHAPE;
      case EAST:
        return EAST_SHAPE;
      case WEST:
        return WEST_SHAPE;
      default:
        return BASE_CHAIR_SHAPE;
    }
  }

  @Override
  protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
    return CODEC;
  }

  @Nullable
  @Override
  public BlockState getPlacementState(ItemPlacementContext ctx) {
    return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
  }

  @Override
  protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
    builder.add(FACING);
  }
}
