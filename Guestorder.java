package rbm;
import java.util.ArrayList;
import java.util.Scanner;

public class Guestorder {
	public String IdTable;
	ArrayList<Food> EatList = new ArrayList<Food>();
	public float TotalPayment;
	 
	public String getIdTable() {
		return IdTable;
	}
    public void setEatList(Food food) {
    	EatList.add(food);
    }
      public void setTotalpayment(float Totalpayment) {
		this.TotalPayment=Totalpayment;
	}
	    public void input() {
	    	Scanner bp=new Scanner(System.in);
	    	System.out.println("number table:");
	    	IdTable=bp.nextLine();
	  }
	    public void print() {
	    	  System.out.println("------------------");
	    	  System.out.println("number table: "+this.IdTable+" total payment: "+ this.TotalPayment);
	    	  for(Food m : this.EatList) {
	    	  System.out.println("Selected Food is "+ m.Name);
	    	  }
	    	  System.out.println();
	    }
	  
	     }
	      
	





