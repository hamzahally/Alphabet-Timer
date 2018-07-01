import java.util.Scanner;

public class App {


	public static void main(String[] args) {

		String userInput;
		String start;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter all the letters of the alphabet, press ENTER to start...");
		
		start = input.nextLine();
		
		System.out.println("started...");

		long startTime = System.nanoTime();
		
		userInput = input.nextLine();

		long endTime = System.nanoTime();

		long duration = (endTime - startTime) / 1000000000;

		if (userInput.equals("abcdefghijklmnopqrstuvwxyz")) {
			System.out.println("matches");
		} else {
			System.out.println("does not match");
		}

		System.out.println(duration + " seconds");
	}
}
