package Basics;

public class Variables {  
		  
		   // static variable  
		   static int a = 10;  
		    
		   // non-static or local variable  
		   int b = 20;  		  
	
		   public static void main(String[] args) {  
		       Variables obj = new Variables();  
		  
		       // accessing the non-static variable  
		       System.out.println("Value of non-static variable is: " + (obj.b));  
		  
		       // accessing the static variable  
		       System.out.println("Value of static variable is:" + (Variables.a));  
		   }  
}
