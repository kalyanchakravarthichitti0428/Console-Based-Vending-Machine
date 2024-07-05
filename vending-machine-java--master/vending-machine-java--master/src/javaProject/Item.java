package javaProject;
import java.util.Scanner;
import javaProject.User;
public class Item extends User {
	//Data Members for an item...
	protected static int itemid = 0;
	protected String name;
	protected int mininumbiddingprice;
	protected String category;
	protected String description;
	public static int numberofitems;

	Scanner in = new Scanner(System.in);
	//To change the things about item.....
	public void setName(String name) {
		System.out.println("Enter the password: ");

		String p = in.next();
		if( p == your_password) {
		this.name=name;
		}
	}
	
	
	public void setminimumbiddingprice(int m) {
		System.out.println("Enter the password: ");
		String p = in.next();
		if( p == your_password) {
		this.mininumbiddingprice = m;
		}
	}
	
	
	public void setcategory(String c) {
		System.out.println("Enter the password: ");
		String p = in.next();
		if( p == your_password) {
			this.category = c;
		}
	}
	public void setdescription(String d) {
		System.out.println("Enter the password: ");
		String p = in.next();
		if( p == your_password) {
			this.description = d;
		}
	}
	
	//creation of the data base
	
	int[] item_ids = new int[1000];
	String [] item_name = new String[1000];
	int[] item_price = new int[1000];
	String[] item_category = new String[1000];
	String[] item_description = new String[1000];
	//search through category
	public void searchCategory(String cat) {
		for(int i=0;i<numberofitems;i++){
			if(item_category[i]==cat && item_ids[i]!=-999) {
				System.out.println(item_ids[i]+"\t"+item_name[i]+"\t"+item_price[i]+"\t");
				showDescription(item_ids[i]);
			}
		}
	}
	//search through description
	public void showDescription(int id) {
		for(int i=0;i<numberofitems;i++) {
			if(item_ids[i] == id) {
				System.out.println(item_description[i]);
			}
		}
	}
	//print whole data base
	public void  showDatabase() {
		for(int i=0;i<numberofitems;i++) {
			if(item_ids[i]!=-999) {
			System.out.println(item_ids[i]+"\t"+item_name[i]+"\t"+item_price[i]+"\t");
			}
		}
		System.out.print("If you would like to know about the description. "+"\n"+"please remember the item id and visit the show description page");
	}
	
	
}
	
	
