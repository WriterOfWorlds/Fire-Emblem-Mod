package net.mcreator.fireemblem.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.fireemblem.FireEmblemMod;

import java.util.Random;
import java.util.Map;

public class RelicSwordRightClickedInAirProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FireEmblemMod.LOGGER.warn("Failed to load dependency entity for procedure RelicSwordRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				FireEmblemMod.LOGGER.warn("Failed to load dependency itemstack for procedure RelicSwordRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((entity.isBurning())) {
			entity.extinguish();
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
		}
	}
}
