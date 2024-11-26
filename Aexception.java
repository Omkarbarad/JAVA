import java.util.Scanner;
class Aexception
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("This is Starting of program");
        int a=10,b=0,c;
        try
        {
            c=a/b;
        }
        catch(Exception e)
        {
            System.out.println("the exception is:"+e.getMessage());
        }
        int d[]=new int[5];
      
        for(int i=0;i<5;i++)
        {
            System.out.println("enter the divisor "+(i+1));
            d[i]=sc.nextInt();
            c=a%d[i];
            System.out.println("the remender is    "+c);
        }
        System.out.println("This is End of program");

    }
}