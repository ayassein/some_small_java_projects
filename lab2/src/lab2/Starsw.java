package lab2;

public class Starsw {
	public static void main (String args[]){
		int i=0;
		while(i<=5)
		{
		for(int j=0;j<5-i;j++)
			System.out.print(' ');
		for(int j = 5-i; j <= 5; j++)
			System.out.print('*');
		System.out.println();
		i++;
	}
	}

}
