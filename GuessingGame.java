import java.util.Scanner;
import java.util.Random;


public class GuessingGame{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(10) + 1;
		
		int guess = 0;
		while (guess != randomNumber){
			System.out.print("Enter your guess (1-10): ");
			guess = scanner.nextInt();
			
			if (guess < randomNumber) {
				System.out.println("Too low, try again.");
			} else if (guess > randomNumber){
				System.out.println("Too high, try again.");
			} else {
				System.out.println("Congratulations! You guessed the number.");
			}
		}
		
	}
}