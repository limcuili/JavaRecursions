// compile with 'javac Fibonacci.java'
// run with 'java Fibonacci (number)'

class Fibonacci {

    static int fibonacci (int n) {
        if (n <= 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main (String args[]) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fibonacci(n));
    }

}