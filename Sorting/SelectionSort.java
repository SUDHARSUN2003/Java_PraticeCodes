package Sorting;
public class SelectionSort {
    public static void main(String[] args) {
        
    int a[] = {3,4,6,2,7,5,1};
    for(int i=0 ; i<a.length;i++)
    {
         int minIndex=i;
            for(int j =i ; j< a.length ; j++)
            {
                    if(a[minIndex]>a[j])
                    {
                       minIndex = j;
                    }  
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
    }
    for(int i : a)
          System.out.print(i+" ");
}
}
