// Joshua Routledge
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Joshua_Routledge_Week6Assignment {
	
	static Scanner input  = new Scanner(System.in);
	
	public static void main(String[] args) {
		int exit = 0;
		String[] menuOptions = {"Part 1: For Loop","Part 2: While Loop","Part 3: Do While Loop"};
		
		do {
			System.out.print("==============================\nSelect A Part\n==============================\n");
			int i;
			String enterString = "Enter ";
			for(i = 0; i < menuOptions.length; i++) {
				System.out.printf("%d: %s%n",i+1, menuOptions[i]);
				enterString = enterString + (i+1) +", ";
			}
			enterString = enterString + "or " + (i+1) + " to Exit:";
			System.out.printf("%d: Exit%n",i+1);
			System.out.print("==============================\n");
			System.out.print(enterString);
			exit = input.nextInt();
			
			switch(exit) {
			
				case 1: forLoop(); break;
				
				case 2: whileLoop(); break;
				
				case 3: doWhileLoop(); break;
				
				case 4: System.out.print("Goodbye!\n=============================="); break;
				
				default: System.out.print("Goodbye!\n==============================");
			}
			
			
		} while (exit != menuOptions.length + 1);
		
	}
	
	public static void mainMenu() {
		
		int exit = 0;
		String[] menuOptions = {"Part 1: For Loop","Part 2: While Loop","Part 3: Do While Loop"};
		
		do {
			System.out.print("==============================\nSelect A Part\n==============================\n");
			int i;
			String enterString = "Enter ";
			for(i = 0; i < menuOptions.length; i++) {
				System.out.printf("%d: %s%n",i+1, menuOptions[i]);
				enterString = enterString + (i+1) +", ";
			}
			enterString = enterString + "or " + (i+1) + " to Exit:";
			System.out.printf("%d: Exit%n",i+1);
			System.out.print("==============================\n");
			System.out.print(enterString);
			exit = input.nextInt();
			
			switch(exit) {
			
			case 1: forLoop(); break;
			
			case 2: whileLoop(); break;
			
			case 3: doWhileLoop(); break;
			
			case 4: System.out.print("Goodbye!\n=============================="); break;
			
			default: System.out.print("Goodbye!\n==============================");
			}
		} while (exit != menuOptions.length + 1);

		
		
		
	}
	
	public static void forLoop() {
		System.out.print("---------------------------------------------------------------------");
		System.out.print("\nPart 1: for loop: Average of randomly generated integers");
		System.out.print("\n---------------------------------------------------------------------");
		System.out.print("\nEnter the bottom number of the range: ");
		int bottom = input.nextInt();
		System.out.print("Enter the top number of the range: ");
		int top = input.nextInt();
		System.out.print("Enter How Many Numbers to Generate: ");
		int generate = input.nextInt();
		int[] generatedList = {};
		
		for(int j = 0; j < generate; j++) {
			int generatedNumber = (int)((Math.random() * ((top - bottom) + 1)) + bottom);
			generatedList = appendIntArray(generatedList, generatedNumber);
		}
		System.out.print("Generated Random Numbers: ");
		System.out.print(Arrays.toString(generatedList));
		System.out.printf("\nAverage of generated numbers: %d ", averageIntArray(generatedList));
		System.out.println("\n---------------------------------------------------------------------");
	}
	
	public static void whileLoop() {
		System.out.print("---------------------------------------------------------------------");
		System.out.print("\nPart 2: while loop: Average of user-entered integers using While loop");
		System.out.print("\n---------------------------------------------------------------------");
		System.out.print("\nEnter integers to average. Enter -1 to finish.\n");
		int entry = 0;
		int i = 1;
		int[] enteredNumbers = {};
		while(entry != -1) {
			
			System.out.printf("Entry %d: ",i);
			entry = input.nextInt();
			if (entry != -1) {
				enteredNumbers = appendIntArray(enteredNumbers, entry);
			}
			i++;
		}
		
		System.out.printf("Number of entries: %d ",enteredNumbers.length);
		System.out.printf("\nAverage of user-entered numbers: %d ",averageIntArray(enteredNumbers));
		System.out.print("\n---------------------------------------------------------------------\n");
	}
	
	public static void doWhileLoop() {
		
		System.out.print("---------------------------------------------------------------------");
		System.out.print("\nPart 3: do-while loop: Display menu until user chooses to exit");
		System.out.print("\n---------------------------------------------------------------------");
		int entry = 0;
		do {
			System.out.print("\n==============================" +
					"\nMENU" + 
					"\n==============================" + 
					"\n1: Choice 1" + 
					"\n2: Choice 2" + 
					"\n3: Choice 3" + 
					"\n4: Exit" + 
					"\n==============================" + 
					"\nEnter 1, 2, 3 or 4 to Exit: ");
			entry = input.nextInt();
		} while(entry != 4);
	}
	
	public static int[] appendIntArray(int[] base, int addition) {
		int[] appendedArray = Arrays.copyOf(base, base.length +1);
		appendedArray[appendedArray.length-1] = addition;
		return appendedArray;
	}
	
	public static int averageIntArray(int[] intArray) {
		int total = 0;
		for(int j = 0; j < intArray.length; j++) {
			total = total + intArray[j];
		}
		int average = total /intArray.length;
		return average;
	}
	
	
	
	
	
	
	
}