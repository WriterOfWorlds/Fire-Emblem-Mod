package net.mcreator.fireemblem.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.entity.Entity;

import net.mcreator.fireemblem.FireEmblemMod;

import java.util.Map;

public class IcebringerLivingEntityIsHitWithToolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FireEmblemMod.LOGGER.warn("Failed to load dependency entity for procedure IcebringerLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
		entity.setAir((int) 0);
	}
}
