package Array;

public class CommonElements {
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4};
        int b[] = {3,4,5,6};
        int i=0 , j=0;

        while (i<a.length && j<b.length) {
            
            if(a[i]==b[j])
              System.out.print(a[i]+" ");

            else if(a[i]<b[j])
                i++;

            else
               j++;
              
        }
    }
}
