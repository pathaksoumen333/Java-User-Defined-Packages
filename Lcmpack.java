package LCM;
public class Lcmpack{
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // function to calculate lcm of two numbers
    public static int lcm1(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // function to calculate lcm of n numbers
    public static int lcm(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = lcm1(result, arr[i]);
        }
        return result;
    }
}
