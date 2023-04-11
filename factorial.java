package Factorialpack;
public class factorial {
    public int fac  (int n)
    {
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        return fac;
    }
}
