package MrRetupmoc42.Chatman;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class frisbeeblue extends Item 
{
	public frisbeeblue(int id, int maxStackSize, CreativeTabs tab, int texture, String name)
	{
			super(id);
			setMaxStackSize(maxStackSize);
			setCreativeTab(tab);
			setUnlocalizedName(name);
	}
}