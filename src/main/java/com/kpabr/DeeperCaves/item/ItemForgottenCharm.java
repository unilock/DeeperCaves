package com.kpabr.DeeperCaves.item;

import com.kpabr.DeeperCaves.DeeperCaves;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemForgottenCharm extends Item {

	public ItemForgottenCharm() {
		
	}
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) 
	{
		DeeperCaves.deepFlag = true;
	}
	

}
