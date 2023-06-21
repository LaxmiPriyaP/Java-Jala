package Basics;

public class IncrementOperator {

		public static void main(String[] args) {

			int variable = 15;
			System.out.println("Original value of the variable = " + variable);

			// after using increment operator
			variable++; 	 //  increments 1, variable = 16
			System.out.println("variable++ = " + variable);

			++variable;		//  increments 1, variable = 17
			System.out.println("++variable = " + variable);

			System.out.println("Original value of the variable = " + variable);

			// using post-increment operator
			int postIncrement = variable++; // postIncrement = 15, variable = 16

			System.out.println("postIncrement = " + postIncrement);
			System.out.println("variable = " + variable + "\n");

	            // postIncrement = 16
			System.out.println("postIncrement++ = " + postIncrement++);
	            // postIncrement = 17
			System.out.println("postIncrement++ = " + postIncrement++);
	            // postIncrement = 18
			System.out.println("postIncrement++ = " + postIncrement++);

			System.out.println("\npostIncrement = " + postIncrement);
	}
}