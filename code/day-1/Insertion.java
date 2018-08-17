import java.util.*;
public class Insertion {
	
	static int count=0;
  static Scanner sc=new Scanner(System.in);
	static int num;
	  static int arr[];
	// INPUT FUNCTION
    static void input(){
		count++;
    	System.out.println("Enter the number of elements in array");count++;
        num=sc.nextInt();
        arr= new int[num];
		System.out.println("enter the elements of array");count++;
		for(int i=0;i<num;i++){count++;
			arr[i]=sc.nextInt();count++;
		}

		
		
	}
    //OUTPUT FUNCTION
    static void output(){count++;
    	System.out.println("Sorted Values:\n");count++;
    	for(int i=0;i<num;i++){count++;
    		System.out.println(arr[i]);count++;
    	}
    }
  // SORTING FUNCTION
    static void sort(int arr[])
    {count++;
        int n = arr.length;
        count++;
        for (int i=1; i<n; ++i)
        {count++;
            int key = arr[i];
            int j = i-1;
 
            count++;
            while (j>=0 && arr[j] > key)
            {count++;
                arr[j+1] = arr[j];
                j = j-1;
            }
            count++;
            arr[j+1] = key;
        }count++;
    }
	public static void main(String[] args) {
		count++;
	    input();
	    sort(arr);
	    output();
	    System.out.println("value of count:"+count);

	}
	
}
