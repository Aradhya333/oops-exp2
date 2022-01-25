//Sum of elements in an array
import java.util.*;
class sum
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=n.nextInt();
        int a[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++)
        {
            a[i]=n.nextInt();
            sum=sum+a[i];
        }
        
        System.out.println("Sum="+sum);
    }
}