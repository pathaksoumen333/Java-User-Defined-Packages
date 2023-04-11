import LCM.Lcmpack;
import Factorialpack.factorial;
import Fibbonaci.Fibonaccipack;
import Prime.Primepack;
import java.util.Scanner;
public class Packimp {
    public static void main(String[] args) {
        Fibonaccipack ob = new Fibonaccipack();
        factorial f = new factorial();
        Primepack p = new Primepack();
        Lcmpack t = new Lcmpack();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number");
        int num= sc.nextInt();
        System.out.println("The Fibonacci Series");
        ob.fibo(num);
        int fac=f.fac(num);
        System.out.println("\n The FActorial ="+fac);
        boolean prime= p.prime(num);
        System.out.println("The number is Prime="+ prime);
        System.out.println("Enter the number of numbers to find LCM");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Lcm Of the Numbers are="+t.lcm(arr,n));

    }
}
