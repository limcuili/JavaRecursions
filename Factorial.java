class Factorial {
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main (String args[]) {
        int n = Integer.parseInt( args[0] );
        System.out.println(factorial(n));
    }
}