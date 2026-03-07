package net.slyzowo.decorations.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.slyzowo.decorations.Decorations;
import net.slyzowo.decorations.entity.custom.ChairEntity;

public class ModEntities {
  public static final EntityType<ChairEntity> CHAIR = Registry.register(Registries.ENTITY_TYPE,
          Identifier.of(Decorations.MOD_ID, "chair_entity"),
          EntityType.Builder.create(ChairEntity::new, SpawnGroup.MISC)
                  .dimensions(0.5f, 0.5f).build());

  public static void registerModEntities(){
    Decorations.LOGGER.info("Registering Mod Entities for " + Decorations.MOD_ID);
  }
}
