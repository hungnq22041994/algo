package hung.troc.recursive;

/**
 * @author hung.nguyenquang
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    private static int fibo(int i) {
        if (i == 1)
            return 0;
        else if (i == 2)
            return 1;
        else return fibo(i - 1) + fibo(i - 2);
    }
}
