import java.util.*;

class Item{
	Integer item_id;
	String item_name;
	
	
	Item(int item_id, String item_name){
		this.item_id=item_id;
		this.item_name=item_name;		
	}
	Item(){}
	void setitem_id(int item_id){
		this.item_id=item_id;	
	}
	void setitem_name(String item_name){
		this.item_name=item_name;	
	}
	public String toString(){
	return this.item_id+" "+this.item_name;
	}
	@Override
	public boolean equals(Object o){
	if (o instanceof Item){
		Item temp=(Item) o;
		if (this.item_id.equals(temp.item_id)&&(this.item_name.equals(temp.item_name)))
		{
			return true;
	}
	}
		return false;
	
}
@Override
public int hashCode(){
	int prime=13;
	int val=1;
	val= val*prime+ this.item_id.hashCode();
	val= val*prime+ this.item_name.hashCode();
	
	return val;
	}
}
class namesort implements Comparator<Item>{
	public int compare(Item I1, Item I2){
		return I1.item_name.compareTo(I2.item_name);
	}
}
class idsort implements Comparator<Item>{
	public int compare(Item I1, Item I2){
		return I1.item_id-(I2.item_id);
	}
}

class Inventory{
	static Item I=new Item();
	static ArrayList<Item> list= new ArrayList <> ();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice;
	Item I1= new Item(1,"ItemA");
	Item I2= new Item(2,"ItemB");
	Item I4= new Item(4,"ItemD");
	Item I3= new Item(3,"ItemC");
	
	list.add(I1);
	list.add(I2);
	list.add(I4);
	list.add(I3);
	System.out.println(list);
	do{
		System.out.println("Enter your choice== ");
		System.out.println("1) Add Item .\n2) Display complete inventory in sorted order of names as well as Itemid.\n3) Remove Item.\n4) Exit");
		choice= sc.nextInt();
		switch(choice){
		case 1:
		System.out.println("Enter the details as follows");
		System.out.println("Enter Item you want");
		
		for(int i =1; i<=1;i++){
			System.out.println("Please enter the Itemid ");
			int d=sc.nextInt();
			I.setitem_id(d);
			System.out.println("Please enter the Itemname ");
			sc.nextLine();
			String itn=sc.nextLine();
			I.setitem_name(itn);
			if(!list.contains(I)){
			list.add(I);}
			}
			System.out.println("Item added are as bellow ");
			System.out.println( list);
			break;
			
		case 2:
		System.out.println(" List before sorting");
		System.out.println(list);
		System.out.println("List sorted by Itemid");
		idsort m2=new idsort();
		Collections.sort(list,m2);
		System.out.println(list);
		System.out.println("List sorted by Itemname");
		namesort m1=new namesort();
		Collections.sort(list,m1);
		System.out.println(list);
		break;
		
		case 3:
		System.out.println("Current list");
		System.out.println(list);
		System.out.println("To remove Item Please enter the index of item");
		int rem=sc.nextInt();
		list.remove(rem);
		System.out.println("List after removing the Item");
		System.out.println(list);
		break;
		
		case 4:
		System.out.println("Exit");
		break;
		
		
		
		
		
		
		
	}
	}while(choice!=4);
	
}
}

