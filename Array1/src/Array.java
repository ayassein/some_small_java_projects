
public class Array {
	int T[]={23,6,47,35,214};
	public double getAverage(){
		int sum=0;
		for(int i=0;i<5;i++)
			sum=sum+T[i];
		double avg=sum/5;
		return avg;
	}
	public static void main(String args[]){
		Array a=new Array();
		System.out.println("Avg= "+a.getAverage());
	}

}
