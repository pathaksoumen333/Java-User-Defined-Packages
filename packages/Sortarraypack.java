package SortArr;
public class Sortarraypack {
     public int [] ABsort(int n, int arr[])
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public int [] DBsort(int n, int arr[])
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public int [] DSsort(int n, int arr[])
    {
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            temp=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[temp])
                {
                    temp=j;
                }
            }
            int largenum= arr[temp];
            arr[temp]=arr[i];
            arr[i]=largenum;
        }
        return arr;
    }
    public int [] ASsort(int n, int arr[])
    {
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            temp=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[temp])
                {
                    temp=j;
                }
            }
            int largenum= arr[temp];
            arr[temp]=arr[i];
            arr[i]=largenum;
        }
        return arr;
    }

}
