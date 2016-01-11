public class GuessANumber {

    // Get a number from the user
    private static int getInput() {

    }
    
    public static void main(String[] args) {
	System.out.println("I have a number between 1 and 100.");
	System.out.println("Can you guess my number?");
	int tries = 0;
	int number = new java.util.Random().nextInt(99) + 1;
	int guess = 0;
	while (guess != number) {
	    tries++;
	    guess = getInput();
	    if (guess > number) {
		System.out.println("Too high. Try again.");
	    }
	    if (guess < number) {
		System.out.println("Too low. Try again.");
	    }
	}
	System.out.print("Excellent! You guessed the number! You guess it in");
	System.out.println(" " + tries + " tries.");
    }
}
