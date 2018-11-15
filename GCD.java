// compile with 'javac GCD.java'
// run with 'java GCD (number) (number)
// the program should return the greatest common divisor of your two arguments.

class GCD {

    static int gcd (int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main (String args[]) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(gcd(x,y));
    }

}
