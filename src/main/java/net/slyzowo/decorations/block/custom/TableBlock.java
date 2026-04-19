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

public class TableBlock extends Block {
  public static final MapCodec<TableBlock> CODEC = createCodec(TableBlock::new);
  private static final VoxelShape TABLE_LEG_NW_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 4.0, 13.0, 4.0);
  private static final VoxelShape TABLE_LEG_NE_SHAPE = Block.createCuboidShape(12.0, 0.0, 2.0, 13.0, 13.0, 4.0);
  private static final VoxelShape TABLE_LEG_SW_SHAPE = Block.createCuboidShape(2.0, 0.0, 12.0, 4.0, 13.0, 13.0);
  private static final VoxelShape TABLE_LEG_SE_SHAPE = Block.createCuboidShape(12.0, 0.0, 12.0, 13.0, 13.0, 13.0);

  private static final VoxelShape TABLE_TOP_SHAPE =
          Block.createCuboidShape(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);

  private static final VoxelShape TABLE_SHAPE = VoxelShapes.union(
          TABLE_LEG_NW_SHAPE,
          TABLE_LEG_NE_SHAPE,
          TABLE_LEG_SW_SHAPE,
          TABLE_LEG_SE_SHAPE,
          TABLE_TOP_SHAPE
  );

  public TableBlock(Settings settings) {
    super(settings);
  }

  @Override
  protected MapCodec<TableBlock> getCodec() {
    return CODEC;
  }

  @Override
  protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    return TABLE_SHAPE;
  }

  public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    return TABLE_SHAPE;
  }

  @Override
  protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
    builder.add();
  }
}