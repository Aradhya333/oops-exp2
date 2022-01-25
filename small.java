//Smallest element in an array

import java.util.*;
class small
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size: ");
        int x=obj.nextInt();
        System.out.println("Enter elements: ");
        int a[]=new int[x];
        for(int i=0;i<x;i++)
         {
             a[i]=obj.nextInt();
         }
        int min=a[0];
        for(int i=1;i<x;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Smallest element of the array: "+min);
    }
}