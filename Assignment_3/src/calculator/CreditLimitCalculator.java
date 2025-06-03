package calculator;

import java.util.Scanner;

public class CreditLimitCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true){
			System.out.println("Enter Account Number (or -1 to quit)");
			int accountNumber = sc.nextInt();
			
			if (accountNumber == -1) {
				System.out.println("Exiting the credit limit calculator");
				break;
			}
			
			System.out.println(" enter balance at the beginning of the month");
			int beginingBalance = sc.nextInt();
			
			System.out.println("Enter total charges this month: ");
			int totalCharges = sc.nextInt();
			
			System.out.println("Enter total credits this month: ");
			int totalCredits=sc.nextInt();
			
			System.out.print("Enter Allowed credit limit: ");
            int creditLimit = sc.nextInt();
            
            int newBalance=beginingBalance+totalCharges-totalCredits;
            
            System.out.println("New balance for account"+accountNumber+":"+newBalance);
            
            if(newBalance>creditLimit) {
            	System.out.println("Credit Limit Exceeded.");
            	
            }
            System.out.println();
			
			
			
			
			
		}
		sc.close();
	}
}



