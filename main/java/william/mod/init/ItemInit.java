package william.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import william.mod.objects.items.ItemBase;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item VASIMION_INGOT = new ItemBase("vasimion_ingot");
}
