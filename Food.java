package rbm;
import java.util.Scanner;


      public class Food {
		 public String Name;
		 public float price;
		
		public Food() {		
         this.Name=Name;
         this.price=price;
		}
		
       public void input() {
		Scanner bp=new Scanner(System.in);
		System.out.println("Enter Name Food");
		Name=bp.nextLine();
		System.out.println("Enter Price Food");
		price=bp.nextFloat();
	 }
		  
	  public void payment() {
	  System.out.println("price: "+price);
  }
	  public String detail() {
	 return Name+" "+price;
			  
  }
	 public float getprice() {
	 return price;
  }
	  public String getName() {
	  return Name;
	   
  }
	  public void setname(String name) {
	  this.Name=name;
 }
	 public void setprice(float price) {
	  this.price=price;
			  
		  }
		  
	     }
			  
		  
		 
		
			  
			  



