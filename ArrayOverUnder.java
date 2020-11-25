public class ArrayOverUnder {

	public static void main(String args[]) {
		
		int size = 0;
		int chosenNumber = 0;
		int below = 0;
		int above = 0;
		int[] inputArray;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How large is your array?");
		
    //Gets the size of the array
		if(input.hasNextInt()) {
			size = input.nextInt();
			if(size == 0) {
				System.out.println("Size cannot be zero, reset program.");
				input.close();
				System.exit(0);
			}
		} else {
			System.out.println("Invalid size, reset program");
			input.close();
			System.exit(0);
		}
		
		inputArray = new int[size];
		
		System.out.println("Enter the numbers for your array, make sure its the correct amount.");
		
    //Retrieves the numbers to input into array
		for(int i = 0; i < size; i++) {
			if(input.hasNextInt()) {	
				inputArray[i] = input.nextInt();	
			} else {	
				System.out.println("Invalid sequence of numbers, reset program");
				input.close();
				System.exit(0);
			}
		}
			
		System.out.println("What number do you want to see the over/under on?");
		
    //The number to determine what numbers are higher or lower
		if(input.hasNextInt()) {
			chosenNumber = input.nextInt();
		} else {
			System.out.println("Invalid chosen number, reset program");
			input.close();
			System.exit(0);
		}
		
    //Counts the numbers that are higher/lower, if the chosen number is part of the array
    //it will count as above.
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] < chosenNumber) {
				below++;
			} else {
				above++;
			}
		}
		
		System.out.println("Above: " + above + " Below: " + below);
		input.close();
	}
}
