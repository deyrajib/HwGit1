package hw;

public class Casting {
	//What is costing ?
		// costing is  when you assign a value of one primitive data type to another type. 
	
	
	static int Price= 200;
	static double TotalPrice =400;
	float Tx = 2.03f;
	
	
	public static void main(String[] args) {
		int ll  =400;
		
		System.out.println (Casting.a);	 
		
		Casting zz = new Casting ();
		
		int ss= (int)zz.Tx;
		
		System.out.println(ss);
		
		double q = (double)ll;
		System.out.println(q);
	}		 
			 
	 static double a =(double)Price;		 
			 
			 
			 
		
}
