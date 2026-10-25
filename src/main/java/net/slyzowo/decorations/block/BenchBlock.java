package net.slyzowo.decorations.block;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class BenchBlock extends Seat {
    public BenchBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SEAT_BOTTOM_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 9.0, 14.0);
    private static final VoxelShape BASE_SEAT_SHAPE = VoxelShapes.union(SEAT_BOTTOM_SHAPE);

    public static final VoxelShape NORTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(2.0, 9.0, 12.0, 14.0, 21.0, 14.0),
            BASE_SEAT_SHAPE
    );
    public static final VoxelShape EAST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(2.0, 9.0, 2.0, 4.0, 21.0, 14.0),
            BASE_SEAT_SHAPE
    );
    public static final VoxelShape SOUTH_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(2.0, 9.0, 2.0, 14.0, 21.0, 4.0),
            BASE_SEAT_SHAPE
    );
    public static final VoxelShape WEST_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(12.0, 9.0, 2.0, 14.0, 21.0, 14.0),
            BASE_SEAT_SHAPE
    );
}
