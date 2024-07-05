package javaProject;
import javaProject.Item;
import java.util.Scanner;

public class User  {
	protected String your_id;
	protected String your_password;
	Scanner sc=new Scanner(System.in);
	
	String[] added_items = new String[1000];
	User() {
		for(int i=0;i<1000;i++) {
			added_items[i] = "Null";
		}
	}
	
    public void addProduct() {
    	
    	Item i=new Item();
    	i.item_ids[(Item.itemid)] = Item.itemid++;
    	added_items[Item.itemid] = Integer.toString(Item.itemid);
    	String name=sc.next();
    	i.setName(name);
    	String c=sc.next();
    	i.setcategory(c);
    	String d=sc.nextLine();
    	i.setdescription(d);
    	int m=sc.nextInt();
    	i.setminimumbiddingprice(m);
    	
    }
    
    
    public void Report() {
    	System.out.println("Enter the item id");
    	String s = sc.next();
    	System.out.println("Thank you very much for reporting....");
    }
	
	public  void myProducts() {
		Item it=new Item();
		for(int i=0;i<1000;i++) {
			if(added_items[i]!=null ) {
				System.out.println(it.item_ids[i]+"\t"+it.item_name[i]+"\t"+it.item_price[i]+"\t");
				it.showDescription(i);
			}
		}
	}
	public void shareContact() {
}
}
