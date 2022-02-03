package rbm;
import java.util.ArrayList;
import java.util.Scanner;

	public class Managefood {
		
		ArrayList<Food> foodlist=new ArrayList<>();
		ArrayList<Guestorder> guestsorder=new ArrayList<>();
		Food Food;
		public Guestorder Guestorder;
		public int SelectFood;
		
		public Managefood() {
		}
		Scanner bp=new Scanner(System.in);
		
		public void bp() {
		System.out.println("Enter number food add in menu");
		int n = Integer.parseInt(bp.nextLine());
		for(int i = 0; i < n ; i++) {
			Food food = new Food();
			food.input();
			foodlist.add(food);
		}
		}
		public void print() {
			for(int i = 0;i < foodlist.size(); i++) {	
			System.out.println((i+1)+"."+foodlist.get(i).detail());		
			}
	}
		 public void price() {
		    	float priceFood=0;
		    	float Totalpayment=0;
		    	int number;
		    	Guestorder guest = new Guestorder();
		    	guest.input();
		    	guestsorder.add(guest);
		    	for(int i = 0; i < 10; i++) {
		    		System.out.println("Select Food "+(i+1));
		    		SelectFood = bp.nextInt();
		    		if(SelectFood==0) {
		    		guest.setTotalpayment(Totalpayment);
		    		System.out.println("Total payment");
		    		System.out.println(Totalpayment);
		    		System.out.println("Thank you, see you again");
		    		break;
		    		
		    		}	else {
		    			System.out.println("Enter number");
		    			number=bp.nextInt();
		    			Food food = foodlist.get(SelectFood-1);
		    			guest.setEatList(food);
		    			priceFood = food.price*number;
		    		}
		    		    Totalpayment=+priceFood;
		    		    System.out.println("order finish");
		    		    System.out.println("payment "+(i+1)+" is:");
		    		    System.out.println(" "+priceFood);
		    		    System.out.println("finish order enter 0");
		    	}
		      }
		 public void printorder() {
         	for (int i = 0;i < guestsorder.size(); i++) {
         		guestsorder.get(i).print();
	}    
		 }
		 public void search() {
	    	Scanner bp=new Scanner(System.in);
	    	String idtable;
	    	int up=0;
	    	System.out.println("Enter table number payment:");
			idtable = bp.nextLine();
			for (int i = 0; i < guestsorder.size(); i++) {
			     if (guestsorder.get(i).getIdTable().equalsIgnoreCase(idtable)) {
			       	guestsorder.get(i).print();
				    up++;
				}
			
			}	if (up==0) {
	     		System.out.println("no table "+idtable);
	     		}
	            	 }
	            	 public String EditName() {
	            		 System.out.println("Enter name edit:");
	            		 return bp.nextLine();
	            	 }
	            	 public float Editprice() {
	            		 System.out.println("Enter price edit:");
	            		 return bp.nextFloat();
	            		 
	     			}
	            	 public void EditFood() {
	            		 String namefood;
	            		 int up=0;
	            		 System.out.println("Enter food name to fix");
	            		 namefood=bp.nextLine();
	            		 for (int i=0;i<foodlist.size(); i++) {
	            			 if(foodlist.get(i).getName().equals(namefood)) {
	            				 up++;
	            				 foodlist.get(i).setname(EditName());
	            				 foodlist.get(i).setprice(Editprice());
	            				 break;
	            			 } 
	            		 } if (up==0) {
            				 System.out.println("no food name is "+namefood);
            			 } 
            		 }
            	 	 public void DeleteFood() {
            	 		 String deletefood;
            	 		 int up=0;
            	 		 System.out.println("Enter name food to delete");
            	 		 deletefood=bp.nextLine();
            	 		 deletefood=bp.nextLine();
            	 		 for (int i = 0; i < foodlist.size(); i++) {
	            			 if(foodlist.get(i).getName().equals(deletefood)) {
	            				 up++;
	            				 foodlist.remove(i);
	            				 System.out.println("delete finish");
	            				 break;
	            			 }  
	            		        
	            			 } if (up==0) {
	            				 System.out.println("no food name is "+deletefood);
	            		 } 
	            	 }
	} 