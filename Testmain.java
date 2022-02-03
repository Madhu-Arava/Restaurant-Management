package rbm;
import java.util.ArrayList;
import java.util.Scanner;

public class Testmain {
	
	public static void main(String[] args) {
		ArrayList<Food> foodlist = new ArrayList<> ();
	    Managefood managefood = new Managefood();
	    int select;
	     
	    Scanner bp=new Scanner(System.in);
	    do {
		   Menumain();
	    	select=Integer.parseInt(bp.nextLine());
	         switch (select) {
	    	 case 1:
	    	    	do {
	    	    	    MenuManageFood();
	    	    	    select=Integer.parseInt(bp.nextLine());
	    	    	    switch (select) {
	    	    	     case 1:
	    	    	    	    managefood.bp();
	    	    	    	    break;
	    	    	   	case 2:
	    	    	    	   	managefood.print();
	    	    	    	    managefood.EditFood();
	    	    	    	    break;
	    	    	   	case 3:
	    	    	    	  	managefood.print();
	    	    	    	  	managefood.DeleteFood();
	    	    	    	    break;
	    	    	   	case 4:
	    	    	    	   	managefood.printorder();
	    	    	    	    break;
	    	    	   	case 5:
	    	    	    	   	managefood.search();
	    	    	    	   	break;
	    	    	    case 0:
	    	    	    	    System.out.println("back");
	    	    	    	    break;
	    	    	     default:
	    	    	    	    break;
	    	    	    	 }
	    	    	      } while (select !=0);
	    	       	         break;
	    	           	case 2:
	    	           		do {
	    	        			Menuorder();
	    	        			select=Integer.parseInt(bp.nextLine());
	    	        			switch (select) {
	    	        	case 1:
	    	        	    managefood.print();
	    	        	    managefood.price();
	    	        	      	     break;
	    	        	 case 0:
	    	        	    	System.out.println("back");
	    	        	    	break;
	    	                 default:
	    	        	         break; 
	    	        	    	}
	    	        		} while (select !=0);
	    	        		break;
	    	        	  default:
	    	        			break; 
	    	        	}
	    	    	} while (select !=3);
	    	    	
	  	}
	  
	static void MenuManageFood() {
		System.out.println("------MENU MANAGEFOOD------");
		System.out.println("0. Back to main menu");
		System.out.println("1. Add food");
		System.out.println("2. Edit food");
		System.out.println("3. Delete food");
		System.out.println("4. print info table order");
		System.out.println("5. payment");
		System.out.println("-----------------------------");
		System.out.println("select");
	}
	static void Menuorder() {
		System.out.println("------MENU MAIN------");
		System.out.println("0. back to main menu");
		System.out.println("1. print menu Food and order");
		System.out.println("-----------------------------------------");
		System.out.println("select");
	}
	       	static void Menumain() {
	  		System.out.println("------MENU MAIN------");
	  		System.out.println("1. Manage Food");
	  		System.out.println("2. Manage order");
	  		System.out.println("3. exit");
			
	  		
	  	
	  	
	  	}
	  

	   
	}
	
