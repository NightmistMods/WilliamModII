package william.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import william.mod.objects.blocks.BlockBase;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
	public static final Block BLOCK_VASIMION = new BlockBase("block_vasimion", Material.IRON);
}
