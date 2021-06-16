package lab2;

public class Triangle {
	public static void main (String args []){
		for (int i=0;i<5;i++)
        {
            for (int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int m=1;m<=i+1;m++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
	}

}
