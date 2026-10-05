//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sequenceLimit = 10;
        if (args.length == 1) {
            sequenceLimit = Integer.parseInt(args[0]);
        }
        System.out.println("The "+sequenceLimit+"th fibbonaci number is: " + fib(sequenceLimit));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}