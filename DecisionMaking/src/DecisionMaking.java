import java.util.*;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String response;
	
		System.out.println("Hello, please enter your name: ");
		String name = scan.nextLine();
		
		do {

			System.out.println(name + ", Enter a number between 1 and 100:");
			int OutPut = scan.nextInt();
			
			if(OutPut <= 1 || OutPut >= 100) {
				System.out.println(name + " Please enter a number between 1 and 100");
			}
			
			else if (OutPut % 2 !=0 && OutPut <= 60) {
				System.out.println("OutPut: " + OutPut + " and odd");
			}
			
			else if (OutPut % 2 != 0 && OutPut >= 60 && OutPut <= 100) {
				System.out.println(OutPut + " Odd and over 60");
			}

			else if (OutPut % 2 == 0 && OutPut >= 2 && OutPut <= 25) {
				System.out.println(OutPut + " Even and less than 25");
			}

			else if (OutPut % 2 == 0 && OutPut >= 26 && OutPut <= 60) {
				System.out.println("Even");
			}

			else { 
				
				System.out.println(OutPut + " Your number is even");
				
			}
			System.out.println("Do you wih to continue? (y/n)");
			response = scan.next();
		} while (!response.equalsIgnoreCase("Yes"));
	}
}
