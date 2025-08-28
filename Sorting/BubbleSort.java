package Sorting;
public class BubbleSort
{
    public static void main(String[] args) {
        int a[] = {3,4,6,2,7,5,1};
        for(int i=0 ; i<a.length;i++)
        {
            boolean swap = false;
            for(int j=0; j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;
                    swap = true;
                }
            }
            if(!swap)
              break;
        }

        for(int i : a)
          System.out.print(i+" ");
    }
}