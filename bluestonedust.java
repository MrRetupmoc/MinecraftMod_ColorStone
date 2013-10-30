package MrRetupmoc42.Chatman;

import cpw.mods.fml.relauncher.*;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

public class bluestonedust extends Item {
	public bluestonedust(int ID)
    {
        super(ID);
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }
	public String getTextureFile() {
		return CommonProxy.BluestoneDust;
	}
}