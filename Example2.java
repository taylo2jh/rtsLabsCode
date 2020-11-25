public class example2 {
	public static void main(String args[]) {
		
		int manipulatedNumber = 0;
		String characters = new String();
		String rotatedString = new String();
		String holder = new String();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String you want manipulated.");
		
		if(input.hasNext()) {
			holder = input.next();
		} else {
			System.out.println("Invalid input, reset program.");
			input.close();
			System.exit(0);
		}
		
		System.out.println("Enter the number you want the String rotated by.");
		
		//
		if(input.hasNextInt()) {
			manipulatedNumber = input.nextInt();
		} else {
			System.out.println("Invalid number, reset program.");
			input.close();
			System.exit(0);
		}
		
		//Cuts and stores the characters to be put at the end
		characters = holder.substring(0, manipulatedNumber);
		
		//Takes the rest of the characters and stores them
		rotatedString = holder.substring(manipulatedNumber, holder.length());
		
		//Prints the rotated String
		System.out.println("This is your rotated string: " + rotatedString + characters);
		input.close();
	}
}
