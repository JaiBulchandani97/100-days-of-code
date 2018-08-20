

import java.util.*;
public class Merg {
 static int count=0;
	static Scanner sc= new Scanner(System.in);
	static int num;

	static int arr[];

	  public static void input(int[] arr2, int n) {
		 count++;
		 System.out.println("Enter the no of elements");
		 count++;
		 num=sc.nextInt();
		 arr=new int[num];
	    	System.out.print("Enter the data");
			for(int i=0; i<arr.length; i++) { 
				arr[i]=sc.nextInt();
		}
	
	    }
	  public static void output(int[] ar, int n) {
		  System.out.println("output values");
			for(int i=0; i<arr.length; i++) { 
				System.out.println(arr[i]);
				}
	  }
	  static void Merge(int a[],int p,int q, int r) {
		  int[] L=new int[51];count++;
		  int[] R=new int[51];count++;
		 int n1,n2,i,j,k;
		 n1=q-p+1;
		 n2=r-q;
		 
		 for(i=0;i<n1;i++) {
			 L[i]=a[p+i];count++;
		 }
		 for(j=0;j<n2;j++) {
			 R[j]=a[q+j+1];count++;
		 }
		 L[n1]=9999;count++;
		 
		 R[n2]=9999;count++;
		 i=0;count++;
		 j=0;count++;
		 for(k=p; k<=r; k++) {count++;
			 if(L[i]<=R[j]) {count++;
				 a[k]=L[i];count++;
				 i++;count++;
				 
			 }
			 else {
				 a[k]=R[j];count++;
				 j++;count++;
			 }
		 }
		 }
	  static void Mergesort(int a[], int p, int r) {
		  int q; count++;
		  if(p<r)
		  {count++;
			  q=(p+r)/2;
			  Mergesort(a,p,q);count++;
			  
			  Mergesort(a,q+1,r); count++;
			  Merge(a,p,q,r);count++;
		  }
		  
		  
	  }
	public static void main(String[] args) {
		 		
		input(arr, num);
		Mergesort(arr,0, num-1);
		output(arr,num);
		System.out.println("Value of count:"+ count);

	}
	
}
