import java.util.Scanner;

public class MyHomework {

//	public static void main(String[] args) {
//		
//		long number;
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.print("Write your number : ");
//		number = scan.nextInt();
//		
//		String result = String.format("%,d", number);
//		
//		System.out.println("Result = " + result);
		
//		long number;
//		int temp = 1000;
//		String result = "";
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.print("Write your number : ");
//		number = scan.nextLong();
//		
//		long X = number;
//		while (X >= 1000) {
//			result = "," + (X % 1000) + result;
//			System.out.println("Result = " + result);
//			
//			X = X / 1000;
//			System.out.println("X1 = " + X);
//		}
//		result = X + result;
//		System.out.println("Final = " + result);
		
//	}
	
	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		int selection;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("~Select One~");
		System.out.println("1. Summary");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		System.out.print("Your selection : ");
		selection = scan.nextInt();
		
		while (selection > 4 || selection < 1) {
			System.out.println("Choose the right number");
			System.out.print("Your selection : ");
			selection = scan.nextInt();
			
		}
		System.out.print("First number : ");
		number1 = scan.nextInt ();
		
		System.out.print("Second number : ");
		number2 = scan.nextInt ();
		
		int resultSum = number1 + number2;
		int resultSub = number1 - number2;
		int resultMulti = number1 * number2;
		int resultDiv = number1 / number2;
		
		if (selection == 1) {
			System.out.println("Final result = " + resultSum);
		} else if (selection == 2) {
			System.out.println("Final result = " + resultSub);
		} else if (selection == 3) {
			System.out.println("Final result = " + resultMulti);
		} else if (selection == 4) {
			System.out.println("Final result = " + resultDiv);
		} else {
			System.out.println("Calculation can't be executed");
		}

	}

}
