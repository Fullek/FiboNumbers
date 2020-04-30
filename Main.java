import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		InputAmount inputAmount = new InputAmount();
		Calculation calculation = new Calculation();

		System.out.println("How many Fibonacci numbers would you like to see?");

		try {
			calculation.calculationLoop(inputAmount.giveAmount());
		} catch (InputMismatchException e) {
			System.out.println("You have input wrong number!");
		}

	}
}
