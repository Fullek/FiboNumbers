public class Calculation {

    private long fibo1 = 1;
    private long fibo2 = 1;

    void showFirstNumbers() {
        System.out.print(fibo1 + " " + fibo2 + " ");
    }

    void calculationLoop(int amount) {
        showFirstNumbers();
        for (int i = 0; i < amount-2; i++) {
            long temp = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = temp;
            System.out.print(fibo2 + " ");
        }
    }

}
