package net.mcreator.fireemblem.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import net.mcreator.fireemblem.FireEmblemMod;

import java.util.Map;

public class IcebringerToolInHandTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FireEmblemMod.LOGGER.warn("Failed to load dependency entity for procedure IcebringerToolInHandTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FireEmblemMod.LOGGER.warn("Failed to load dependency x for procedure IcebringerToolInHandTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FireEmblemMod.LOGGER.warn("Failed to load dependency y for procedure IcebringerToolInHandTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FireEmblemMod.LOGGER.warn("Failed to load dependency z for procedure IcebringerToolInHandTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FireEmblemMod.LOGGER.warn("Failed to load dependency world for procedure IcebringerToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z)))) {
			entity.setFire((int) 1);
		}
	}
}
