package net.slyzowo.decorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.slyzowo.decorations.entity.ModEntities;
import net.slyzowo.decorations.entity.custom.ChairEntity;

import java.util.List;

public class StoolBlock extends Block {

  public static final MapCodec<StoolBlock> CODEC = createCodec(StoolBlock::new);
  private static final VoxelShape STOOL_LEG_NW_SHAPE = Block.createCuboidShape(3.0, 0.0, 3.0, 5.0, 9.0, 5.0);
  private static final VoxelShape STOOL_LEG_NE_SHAPE = Block.createCuboidShape(11.0, 0.0, 3.0, 13.0, 9.0, 5.0);
  private static final VoxelShape STOOL_LEG_SW_SHAPE = Block.createCuboidShape(3.0, 0.0, 11.0, 5.0, 9.0, 13.0);
  private static final VoxelShape STOOL_LEG_SE_SHAPE = Block.createCuboidShape(11.0, 0.0, 11.0, 13.0, 9.0, 13.0);

  private static final VoxelShape STOOL_TOP_SHAPE =
          Block.createCuboidShape(3.0, 8.0, 3.0, 13.0, 9.0, 13.0);

  private static final VoxelShape STOOL_SHAPE = VoxelShapes.union(
          STOOL_LEG_NW_SHAPE,
          STOOL_LEG_NE_SHAPE,
          STOOL_LEG_SW_SHAPE,
          STOOL_LEG_SE_SHAPE,
          STOOL_TOP_SHAPE
  );

  public StoolBlock(Settings settings) {
    super(settings);
  }

  @Override
  protected MapCodec<StoolBlock> getCodec() {
    return CODEC;
  }

  @Override
  public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

    if(!world.isClient()) {
      Entity entity;

      List<ChairEntity> entities = world.getEntitiesByType(ModEntities.CHAIR, new Box(pos), chair -> true);

      if(entities.isEmpty()) {
        entity = ModEntities.CHAIR.spawn((ServerWorld) world, pos, SpawnReason.TRIGGERED);
      }
      else {
        entity = entities.getFirst();
      }

      player.startRiding(entity);
    }

    return ActionResult.SUCCESS;
  }

  @Override
  protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    return STOOL_SHAPE;
  }

  @Override
  protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    return STOOL_SHAPE;
  }
}
