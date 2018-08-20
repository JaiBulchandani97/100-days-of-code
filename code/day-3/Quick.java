
import java.util.*;

public class Quick {
	static int count=0;
	static Scanner sc= new Scanner(System.in);
	static int num;

	static int[] arr;

	 public static void input() {
		 count++;
		 System.out.println("Enter the num of elements");
		 num=sc.nextInt(); count++;
		 arr=new int[ num];count++;
	    	System.out.print("Enter the data");count++;
			for(int i=0; i<arr.length; i++) { count++;
				arr[i]=sc.nextInt();
		}count++;
		
	 }
	 static int Partition(int a[], int p, int r) {count++;
		 int x,i,j,temp;count++;
		 x=a[r];count++;
		 i=p-1;count++;
		 for(j=p;j<=r-1;j++) {count++;
			 if(a[j]<=x)
			 {count++;
				 i=i+1;count++;
				 temp=a[j];count++;
				 a[j]=a[i];count++;
				 a[i]=temp;count++;
			 }
		 }
		 temp=a[r];count++;
		 a[r]=a[i+1];count++;
		 a[i+1]=temp;count++;
		 //System.out.println("value of q :"+(i+1));
		 
		 return i+1;
		 
	 }
	 static void Quicksort(int a[], int p, int r) {
		 int q;count++;
				 
		 if(p<r) {count++;
			 q=Partition(a,p,r);
		
			 Quicksort(a,p,q-1);count++;
		     Quicksort(a, q+1, r);count++;

	 }
	 }
	 public static void output(int[] ar, int n) {count++;
		  System.out.println("output values");count++;
			for(int i=0; i<ar.length; i++) { count++;
				System.out.println(ar[i]);
				}
	  }

	public static void main(String[] args) {
		int p=0;count++;
		
		
		input();count++;
		int r=num-1;count++;
		Quicksort(arr,p,r);count++;
		output(arr,num);count++;
		System.out.println("vaLUE OF COUNT:"+count);
	}

}
	 
