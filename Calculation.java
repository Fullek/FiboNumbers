import java.util.InputMismatchException;

public class Calculation {

    InputAmount inputAmount = new InputAmount();

    private long fibo1 = 1;
    private long fibo2 = 1;

    private void showFirstNumbers() {
        System.out.print(fibo1 + " " + fibo2 + " ");
    }

    private void calculationLoop(int amount) {
        showFirstNumbers();
        for (int i = 0; i < amount - 2; i++) {
            long temp = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = temp;
            System.out.print(fibo2 + " ");
        }
    }

    protected void demo() {
        try {
            calculationLoop(inputAmount.giveAmount());
        } catch (InputMismatchException e) {
            System.out.println("You have input wrong number!");
        }
    }

}
