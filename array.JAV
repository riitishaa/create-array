import java.util.*;
class Array
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
        a[i]=sc.nextInt();
        }
        System.out.println("the array elements are");
        for(int i=0;i<5;i++)
        System.out.println(a[i]);
        
    }
}
