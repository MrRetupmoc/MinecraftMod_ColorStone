package MrRetupmoc42.Chatman;

import java.util.Random;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class gravitoncontroller extends Block {
	public gravitoncontroller(int par1, String texture) {
		super(par1, Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	//drops when broken with pickaxe
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return Colorstone.GraviTonController.blockID;
	}
	
	public int quantityDropped(Random random)
	{
		return 1;
	}
}