import java.util.Scanner;
class Mobile_1
{
   static String name;
   String brand;
   int price;
   Scanner a=new Scanner(System.in);
   void input()
   {
    System.out.println("Enter Name of the  mobile:-");
    name=a.nextLine();
    System.out.println("Enter Brand of the  mobile:-");
    brand=a.nextLine();
    System.out.println("Enter price of the  mobile:-");
    price=a.nextInt();
   }
   void display()
   {
    System.out.println("Name of the  mobile is:-"+name);
    System.out.println("Brand of the  mobile is:-"+brand);
    System.out.println("price of the  mobile is:-"+price);
   }
}
class Mobile
{
    public static void main(String[]args)
    {
        Mobile_1 m1=new Mobile_1();
        Mobile_1 m2=new Mobile_1();
        m1.input();
        m2.input();
        m1.display();
        m2smart.display();
    }
}
