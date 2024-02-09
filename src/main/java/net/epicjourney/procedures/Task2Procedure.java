package net.epicjourney.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.levelgen.Heightmap;

import net.epicjourney.network.EpicJourneyModVariables;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber
public class Task2Procedure {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if ((entity.getCapability(EpicJourneyModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new EpicJourneyModVariables.PlayerVariables())).task_progress < 2) {
            BlockPos pos = new BlockPos((int)Math.floor(x), (int)Math.floor(y), (int)Math.floor(z));
            if (world.getBiome(pos).is(new ResourceLocation("epic_journey:fick_forvoss"))) {
                Random rand = new Random();
                BlockPos newPos;
                do {
                    int offsetX = rand.nextInt(65) - 32; // 随机生成 -32 到 32 的整数
                    int offsetZ = rand.nextInt(65) - 32; // 随机生成 -32 到 32 的整数
                    newPos = pos.offset(offsetX, 0, offsetZ); // 更新位置到新的 X 和 Z 坐标
                    newPos = world.getHeightmapPos(Heightmap.Types.WORLD_SURFACE, newPos); // 获取新位置的地表高度
                } while (!world.getBiome(newPos).is(new ResourceLocation("epic_journey:fick_forvoss"))); // 检查新位置是否仍在同一群系内
                pos = newPos;
                if (world instanceof ServerLevel _serverworld) {
                    StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("epic_journey", "the_final_message"));
                    if (template != null) {
                        Vec3i templateSizeVec = template.getSize();
                        BlockPos templateSize = new BlockPos(templateSizeVec.getX(), templateSizeVec.getY(), templateSizeVec.getZ());
                        template.placeInWorld(_serverworld, pos, templateSize,
                            new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 2);
                    }
                }
                {
                    double _setval = 2;
                    entity.getCapability(EpicJourneyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                        capability.task_progress = _setval;
                        capability.syncPlayerVariables(entity);
                    });
                }
            }
        }
    }
}

