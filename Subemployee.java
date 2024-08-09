import java.util.Scanner;
public class Subemployee {
    String em_id;
    String em_name;
    String address;
    int salary;
    int y_salary;

    // Constructor must match this signature
    Subemployee(String em_id, String em_name, String address, int salary) {
        this.em_id = em_id;
        this.em_name = em_name;
        this.address = address;
        this.salary = salary;
        this.y_salary = salary * 12;
        this.y_salary += this.y_salary * 0.1;  // Correctly apply the 10% increment
    }

    void getdata() {
        System.out.println("Employee ID: " + em_id);
        System.out.println("Employee Name: " + em_name);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Yearly Salary: " + y_salary);
    }
}

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of employees:");
        n = sc.nextInt();
        sc.nextLine();  // Consume the newline left-over

        String[] em_id = new String[n];
        String[] em_name = new String[n];
        String[] address = new String[n];
        int[] salary = new int[n];

        Subemployee[] employees = new Subemployee[n];
        System.out.println("Enter employee info:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the employee ID:");
            em_id[i] = sc.nextLine();
            System.out.println("Enter the employee name:");
            em_name[i] = sc.nextLine();
            System.out.println("Enter the employee address:");
            address[i] = sc.nextLine();
            System.out.println("Enter the employee salary:");
            salary[i] = sc.nextInt();
            sc.nextLine();  // Consume the newline left-over
            employees[i] = new Subemployee(em_id[i], em_name[i], address[i], salary[i]);
        }

        System.out.println("Employee Details:");
        for (int i = 0; i < n; i++) {
            employees[i].getdata();
        }

        System.out.println("Enter the employee ID you want to find:");
        String searchId = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (searchId.equals(employees[i].em_id)) {
                employees[i].getdata();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        sc.close();  // Close the scanner
    }
}

