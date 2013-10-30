package MrRetupmoc42.Chatman;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;

import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

// Forge Mod Setup
@Mod(modid="mod_Colorstone",name="Colorstone",version="v0.1")
@NetworkMod(clientSideRequired=true,serverSideRequired=false)

public class Colorstone {

	// The instance of your mod that Forge uses.
	@Instance("Colorstone")
	public static Colorstone instance;
	
	// Redstone
	//public static final Block oreRedstone = (new BlockRedstoneOre(73, false)).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreRedstone").setCreativeTab(CreativeTabs.tabBlock);
	//public static final Block oreRedstoneGlowing = (new BlockRedstoneOre(74, true)).setLightValue(0.625F).setHardness(3.0F).setResistance(5.0F).setStepSound(soundStoneFootstep).setUnlocalizedName("oreRedstone");
	//public static final Block torchRedstoneIdle = (new BlockRedstoneTorch(75, false)).setHardness(0.0F).setStepSound(soundWoodFootstep).setUnlocalizedName("notGate");
	//public static final Block torchRedstoneActive = (new BlockRedstoneTorch(76, true)).setHardness(0.0F).setLightValue(0.5F).setStepSound(soundWoodFootstep).setUnlocalizedName("notGate").setCreativeTab(CreativeTabs.tabRedstone);
	
	// Greenstone
	public static Item greenstone = (new greenstonedust(30303)).setUnlocalizedName("greenstone");
	public static Block greenstoneore = (new greenstoneore(3979, false)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("greenstoneore").setCreativeTab(CreativeTabs.tabBlock);
	public static Block greenstoneoreGlowing = (new greenstoneoreGlowing(3980, true)).setLightValue(0.625F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("greenstoneore");
	public static Block greenstonetorchIdle = (new greenstonetorchIdle(3981, false)).setHardness(0.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("greenstonetorch");
	public static Block greenstonetorchActive = (new greenstonetorchActive(3982, true)).setHardness(0.0F).setLightValue(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("greenstonetorch_lit").setCreativeTab(CreativeTabs.tabRedstone);
	
	// Bluestone
	public static Item bluestone = (new bluestonedust(30304)).setUnlocalizedName("bluestone");
	public static Block bluestoneore = (new bluestoneore(3975, false)).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("bluestoneore").setCreativeTab(CreativeTabs.tabBlock);
	public static Block bluestoneoreGlowing = (new bluestoneoreGlowing(3976, true)).setLightValue(0.625F).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("bluestoneore");
	public static final Block bluestonetorchIdle = (new bluestonetorchIdle(3977, false)).setHardness(0.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("bluestonetorch");
	public static final Block bluestonetorchActive = (new bluestonetorchActive(3978, true)).setHardness(0.0F).setLightValue(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("bluestonetorch_lit").setCreativeTab(CreativeTabs.tabRedstone);
	
	// Yellowstone
	public static Item yellowstone = (new yellowstonedust(30305)).setUnlocalizedName("yellowstone");
	public static Block yellowstonetorchIdle = (new yellowstonetorchIdle(3983, false)).setHardness(0.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("yellowstonetorch");
	public static Block yellowstonetorchActive = (new yellowstonetorchActive(3984, true)).setHardness(0.0F).setLightValue(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("yellowstonetorch_lit").setCreativeTab(CreativeTabs.tabRedstone);
	
	// Cyanstone
	public static Item cyanstone = (new cyanstonedust(30306)).setUnlocalizedName("cyanstone");
	public static Block cyanstonetorchIdle = (new cyanstonetorchIdle(3985, false)).setHardness(0.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("cyanstonetorch");
	public static Block cyanstonetorchActive = (new cyanstonetorchActive(3986, true)).setHardness(0.0F).setLightValue(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("cyanstonetorch_lit").setCreativeTab(CreativeTabs.tabRedstone);
	
	// Pinkstone
	public static Item pinkstone = (new pinkstonedust(30307)).setUnlocalizedName("pinkstone");
	public static Block pinkstonetorchIdle = (new pinkstonetorchIdle(3987, false)).setHardness(0.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("pinkstonetorch");
	public static Block pinkstonetorchActive = (new pinkstonetorchActive(3988, true)).setHardness(0.0F).setLightValue(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("pinkstonetorch_lit").setCreativeTab(CreativeTabs.tabRedstone);
	
	// Orangestone

	// YellowGreenstone

	// Violetstone

	// PinkRedstone

	// CyanGreenstone

	// CyanBluestone
	
	// FRC Mod?
	public static Item frisbeewhite = new frisbeewhite(30314,64,CreativeTabs.tabMaterials,0,"frisbee_white");;
	public static Item frisbeered = new frisbeered(30315,64,CreativeTabs.tabMaterials,0,"frisbee_red");;
	public static Item frisbeeblue = new frisbeeblue(30316,64,CreativeTabs.tabMaterials,0,"frisbee_blue");;
	
	// Other Block(s)
	public static Block GraviTonController = new gravitoncontroller(3995, "gravitoncontroller").setUnlocalizedName("graviton_controller").setHardness(10.0F).setStepSound(Block.soundMetalFootstep).setResistance(20.0F);;
	public static Block FRCRobot = new frcrobot(3996, "frcrobot").setUnlocalizedName("frc_robot").setHardness(15.0F).setStepSound(Block.soundMetalFootstep).setResistance(20.0F);
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="MrRetupmoc42.Chatman.client.ClientProxy", serverSide="MrRetupmoc42.Chatman.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		proxy.registerRenderers();
		
		//Redstone is In Vanilla Already...
		
		// Bluestone
		GameRegistry.registerBlock(bluestoneore, "bluestoneore");
		GameRegistry.registerBlock(bluestonetorchActive, "bluestonetorch");	
		LanguageRegistry.addName(bluestoneore, "Bluestone Ore");
		LanguageRegistry.addName(bluestone, "Bluestone");
		LanguageRegistry.addName(bluestonetorchActive, "Bluestone Torch");
		
		// Greenstone
		GameRegistry.registerBlock(greenstoneore, "greenstoneore");
		GameRegistry.registerBlock(greenstonetorchActive, "greenstonetorch");
		LanguageRegistry.addName(greenstoneore, "Greenstone Ore");
		LanguageRegistry.addName(greenstone, "Greenstone");
		LanguageRegistry.addName(greenstonetorchActive, "Greenstone Torch");
		
		// Yellowstone
		GameRegistry.registerBlock(yellowstonetorchActive, "yellowstonetorch");
		LanguageRegistry.addName(yellowstone, "Yellowstone");
		LanguageRegistry.addName(yellowstonetorchActive, "Yellowstone Torch");
		
		// Cyanstone
		GameRegistry.registerBlock(cyanstonetorchActive, "cyanstonetorch");
		LanguageRegistry.addName(cyanstone, "Cyanstone");
		LanguageRegistry.addName(cyanstonetorchActive, "Cyanstone Torch");
		
		// Pinkstone
		GameRegistry.registerBlock(pinkstonetorchActive, "pinkstonetorch");
		LanguageRegistry.addName(pinkstone, "Pinkstone");
		LanguageRegistry.addName(pinkstonetorchActive, "Pinkstone Torch");
		
		// Orangestone
		//GameRegistry.registerBlock(orangestonetorchActive, "orangestonetorch");
		//LanguageRegistry.addName(orangestone, "Orangestone");
		//LanguageRegistry.addName(orangestonetorchActive, "Orangestone Torch");
		
		// YellowGreenstone
		
		// Violetstone
		
		// PinkRedstone
		
		// CyanGreenstone
		
		// CyanBluestone
		
		// ColorStone Ore World Gen
		GameRegistry.registerWorldGenerator(new WorldGeneratorRetupmoc());
		
		//ColorStone Crafting
		// Single Dust Creation
		GameRegistry.addShapelessRecipe(new ItemStack(yellowstone,1),greenstone,Item.redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(pinkstone,1),bluestone,Item.redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(cyanstone,1),greenstone,bluestone);
		
		//GameRegistry.addShapelessRecipe(new ItemStack(orangestone,1),yellowstone,Item.redstone);
		
		// Single Torch Creation
		GameRegistry.addShapelessRecipe(new ItemStack(Block.torchRedstoneActive,1),Item.redstone,Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(bluestonetorchActive,1),bluestone,Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(greenstonetorchActive,1),greenstone,Item.stick);
		
		GameRegistry.addShapelessRecipe(new ItemStack(yellowstonetorchActive,1),yellowstone,Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(pinkstonetorchActive,1),pinkstone,Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(cyanstonetorchActive,1),cyanstone,Item.stick);
		
		//GameRegistry.addShapelessRecipe(new ItemStack(orangestonetorchActive,1),orangestone,Item.stick);
		
		// Multi Dust Creation
		//GameRegistry.addShapelessRecipe(new ItemStack(orangestone,1),greenstone,Item.redstone,Item.redstone);
		
		// Multi Torch Creation
		GameRegistry.addShapelessRecipe(new ItemStack(yellowstonetorchActive,1),greenstone,Item.redstone,Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(pinkstonetorchActive,1),bluestone,Item.redstone,Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(cyanstonetorchActive,1),greenstone,bluestone,Item.stick);
		
		//GameRegistry.addShapelessRecipe(new ItemStack(orangestonetorchActive,1),greenstone,Item.redstone,Item.redstone,Item.stick);
		
		
		
		// FRC Frisbees
		LanguageRegistry.addName(frisbeered, "FRC Red Frisbee");
		LanguageRegistry.addName(frisbeeblue, "FRC Blue Frisbee");
		LanguageRegistry.addName(frisbeewhite, "FRC White Frisbee");
		
		// FRC Frisbee Crafting
		GameRegistry.addRecipe(new ItemStack(frisbeered,1), new Object[] {" F ","FFF"," F ",'F',Item.redstone});
		GameRegistry.addRecipe(new ItemStack(frisbeeblue,1), new Object[] {" F ","FFF"," F ",'F',bluestone});
		GameRegistry.addRecipe(new ItemStack(frisbeewhite,1), new Object[] {" F ","FFF"," F ",'F',greenstone});
		
		// FRC Frisbee Reverse Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone,5), new Object[]{frisbeered});
		GameRegistry.addShapelessRecipe(new ItemStack(bluestone,5), new Object[]{frisbeeblue});
		GameRegistry.addShapelessRecipe(new ItemStack(greenstone,5), new Object[]{frisbeewhite});
		
		
		// FRC Robot Block
		GameRegistry.registerBlock(FRCRobot, "frcrobot");
		LanguageRegistry.addName(FRCRobot, "FRC Robot");
		
		// FRC Robot Block Controller Crafting
		GameRegistry.addRecipe(new ItemStack(FRCRobot,1), new Object[] {"BBB","BBB","BBB",'B',bluestone});
		
		// FRC Robot Block Reverse Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(bluestone,9), new Object[]{FRCRobot});
		
		
		// GraviTon Controller Block
		GameRegistry.registerBlock(GraviTonController, "gravitoncontroller");
		LanguageRegistry.addName(GraviTonController, "GraviTon Controller");
		
		// GraviTon Controller Block Crafting
		GameRegistry.addRecipe(new ItemStack(GraviTonController,1), new Object[] {"GGG","GGG","GGG",'G',greenstone});
		
		// GraviTon Controller Block Reverse Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(greenstone,9), new Object[]{GraviTonController});
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}