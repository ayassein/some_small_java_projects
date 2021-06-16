package mini;

public class Lab25 {
	int max( int a, int b)
	{ if (a>=b) return a;
	else return b;
	}
	int findmax( int a[] , int start, int end)
	{ if(end-start== 1) return max(a[start], a[end]);
	 if(start==end) return a[start];
	 int mid= (start+end)/2;
	 return max( findmax(a,start,mid), findmax(a,mid+1,end));
	}
	public static void main(String args[]){
		int a[]={1,3,7,5,10,2};
		System.out.print(max);
	}

}
//int[] age = {12, 4, 5, 2, 5};