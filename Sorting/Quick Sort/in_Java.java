

// QuickSort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways. 

//Always pick the first element as a pivot.
//Always pick the last element as a pivot (implemented below)
//Pick a random element as a pivot.
//Pick median as the pivot.

// Java implementation of QuickSort
import java.io.*;

class Solution {

	static int Qwick(int[] arr,int low,int high){
        int pivot=arr[high];
        int pindex=low;
        for(int i=low;i<high;i++){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[pindex];
                arr[pindex]=temp;
                pindex++;
            }
        }
        int t=arr[high];
        arr[high]=arr[pindex];
        arr[pindex]=t;
        return pindex;
    } 

	static void quickSort(int[] arr, int low, int high)
	{
	if(low<high){
		  int index=Qwick(arr,low,high);
		  QwickSort(arr,low,index-1);
		  QwickSort(arr,index+1,high);
	      }
	}

	
    static void printAll(int[] arr,int low,int high){
        for(int i=low;i<high;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	// Driver Code
	public static void main(String[] args)
	{
		int arr[]={24,9,29,14,19,27};
		System.out.println("Before merge sort");
		int n=arr.length;
		//System.out.println(n);
		printAll(arr,0,n);
		System.out.println("After merge sort");
		QwickSort(arr,0,n-1);
		printAll(arr,0,n);
	}
}

