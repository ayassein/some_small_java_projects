package mid;

public class Quz {
	public static void main (String args[]){
		int z,c;
		z=0;
		for(int i=0;i<10;i++){
			c=0;
			while(c<5){
				z=z+i+c;
				c=c+3;
				i=i+2;
			}
			System.out.println(z);
		}
		System.out.println(z);
	}

}
