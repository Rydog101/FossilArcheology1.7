package mods.fossil.blocks;

import mods.fossil.Fossil;
import mods.fossil.client.LocalizationStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockMarble extends Block
{
	public BlockMarble()
	{
		super(Material.rock);
		setCreativeTab(Fossil.tabFBlocks);
		setHardness(2.0F);
		setHardness(1.5F);
		setBlockName(LocalizationStrings.MARBLE_NAME);
	}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("fossil:MarbleStoneBrick");
	}
}
