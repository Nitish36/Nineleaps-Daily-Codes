/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search 
target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
*/

public class Main
{
    public static void binary_search(int arr[],int target)
    {
        int low,high,mid;
        low = 0;
        high = arr.length-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid] == target)
            {System.out.println(target+" exists and it is at index "+mid); break;}
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
    }
	public static void main(String[] args) {
	    int arr[]={-1,0,3,5,9,12};
	    int target=9;
	    binary_search(arr,target);
	}
}
