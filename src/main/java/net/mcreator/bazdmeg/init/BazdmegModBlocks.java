
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bazdmeg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bazdmeg.block.IsdBlock;
import net.mcreator.bazdmeg.BazdmegMod;

public class BazdmegModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BazdmegMod.MODID);
	public static final RegistryObject<Block> ISD = REGISTRY.register("isd", () -> new IsdBlock());
}
