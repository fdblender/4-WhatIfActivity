/*
 * Create a program that allows the user enter a sales record 
 * (which includes customer number, name, sales amount and a tax code).
tax code 	tax amount
NRM 	6%
NPF 	0%
BIZ 	4.5%

The program should output a total that includes the tax owed (if any).
 */

import java.util.Scanner;

public class SalesRecord {


	public static void main(String[] args) {
		int customerNo;
		String name, taxCode;
		double tax = 0.0;
		double salesAmt;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Customer No? :" );
		customerNo = keyboard.nextInt();
		
		System.out.print("Customer Name? :");
		name = keyboard.next();
		
		System.out.print("Tax Code (NRM, NPF, BIZ): ");
		taxCode = keyboard.next();
		
		System.out.print("Sales Amount: ");
		salesAmt = keyboard.nextDouble();
		
		if (taxCode.equals("NRM")) {
	       tax = .06;
		}
		else if (taxCode.equals("NPF")) {
	    	tax = 0.0;
		}
		else if (taxCode.equals("BIZ")) {
	    	tax = .045;
		}
		else {
	       System.out.print("Error: invalid tax code");
		}
		
		System.out.println("Sales Record");
		System.out.print("Customer: "+name+ " Customer No: "+customerNo);
		System.out.print("  Sales Amount: $"+String.format("%.02f",salesAmt));
		System.out.print(" Tax Code: "+taxCode+" Tax Rate: "+String.format("%.02f",tax));
		System.out.print("%  Total Owed: $"+String.format("%.02f",salesAmt * (1+tax)));
	}	

}
