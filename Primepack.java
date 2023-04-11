package Prime;
public class Primepack{
    public boolean prime(int num)
    {
        int c=0;
        boolean result;
        for (int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            result= true;
        }
        else{
            result = false;
        }
        return  result;
    }
}
