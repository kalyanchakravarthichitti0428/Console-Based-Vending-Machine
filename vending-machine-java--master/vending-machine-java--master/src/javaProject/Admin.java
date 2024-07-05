package javaProject;
import javaProject.Item;


public class Admin extends Item{
	
	@SuppressWarnings("unused")
	private void removeProduct(int id) {
		for (int i=0;i<numberofitems;i++) {
			if(item_ids[i] == id) {
				item_ids[i] = -999;
				item_name[i] = "Null";
				item_price[i] = -999;
				item_description[i] ="No Longer available";
				item_category[i] = "Null";
				
			}
		}
	}
	{
		Item i = new Item();
		i.item_ids[0] = itemid++;
		i.item_name[0] = "Bag";
		i.item_price[0] = 150;
		i.item_description[0] = "Well rounded and no leaks!";
		i.item_category[0] = "General";
		
		i.item_ids[1] = itemid++;
		i.item_name[1] = "HP envy lappy";
		i.item_price[1] = 55000;
		i.item_category[1] = "Electronic appliances";
		i.item_description[1] = "Core I7,1tb rom,12gb ram";
		
		
		i.item_ids[2] = itemid++;
		i.item_name[2] = "One Plus 6";
		i.item_price[2] = 32000;
		i.item_category[2] = "Electronic appliances";
		i.item_description[2] = "Snap drag 845,16+12 MP,3300mAh";
	
	}

}
