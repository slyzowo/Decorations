package net.slyzowo.decorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class TableBlock extends Block {
  public static final MapCodec<TableBlock> CODEC = createCodec(TableBlock::new);
  private static final VoxelShape TABLE_LEG_NW_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 4.0, 13.0, 4.0);
  private static final VoxelShape TABLE_LEG_NE_SHAPE = Block.createCuboidShape(12.0, 0.0, 1.0, 15.0, 13.0, 4.0);
  private static final VoxelShape TABLE_LEG_SW_SHAPE = Block.createCuboidShape(1.0, 0.0, 12.0, 4.0, 13.0, 15.0);
  private static final VoxelShape TABLE_LEG_SE_SHAPE = Block.createCuboidShape(12.0, 0.0, 12.0, 15.0, 13.0, 15.0);

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