import java.util.Scanner;

class Submatrix {
    public int a[][] = new int[2][2];
    public int b[][] = new int[2][2];
    public int c[][] = new int[2][2];
    public int d[][] = new int[2][2];
    public int e[][] = new int[2][2];
    Scanner sc = new Scanner(System.in);

    public void getMatrix() {
        System.out.println("Enter the elements of 1st matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("1st matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the elements of 2nd matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("2nd matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addMatrix() {
        System.out.println("Addition of matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void subtractMatrix() {
        System.out.println("Subtraction of matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                d[i][j] = a[i][j] - b[i][j];
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplyMatrix() {
		
        System.out.println("Multiplication of matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
				for(int k=0;k<2;k++)
				{
                e[i][j] =e[i][j]+ a[i][k] * b[k][j];
				}
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Matrix {
    public static void main(String[] args) {
        Submatrix m = new Submatrix();

        m.getMatrix();
        m.addMatrix();
        m.subtractMatrix();
        m.multiplyMatrix();
    }
}
