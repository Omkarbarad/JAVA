import java.util.Scanner;
class Subemployee
{
	public String em_id;
	public String em_name;
	public String address;
	public int salary;
	Scanner sc=new Scanner(System.in);
	void setdata()
	{
		System.out.println("enter the employee id");
		em_id=sc.nextLine();
		System.out.println("enter the employee name");
		em_name=sc.nextLine();
		System.out.println("enter the employee address");
		address=sc.nextLine();
		System.out.println("enter the employee salary");
		salary=sc.nextInt();
	}
	void getdata()
	{
		System.out.println("employee id is:-"+ em_id);
		System.out.println("employee name is:-"+ em_name);
		System.out.println("employee address is:-"+ address);
		System.out.println("employee id salary is:-"+ salary);
	}
}
class Employee
{
	
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		String em_id;
		System.out.println("enter the number of employee");
		n=sc.nextInt();
		Subemployee[] m=new Subemployee[n];
		System.out.println("enter employee info:_");
		for(int i=0;i<n;i++)
		{
			 m[i]=new Subemployee();
		}
		for(int i=0;i<n;i++)
		{
			m[i].setdata();
		}
		Scanner b=new Scanner(System.in);
		System.out.println("enter employee-id which you want find");
		em_id=b.nextLine();
		
		for(int i=0;i<n;i++)
		{
			if(em_id.equals(m[i].em_id))
			{
				m[i].getdata();
			}
		}
		
		
	}
}