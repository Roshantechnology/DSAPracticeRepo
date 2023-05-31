package in.ineuron;

public class third {

	static int findIndex(int arr[],int n,int target) {
		for(int i=0;i<n;i++) {
			if(arr[i]==target)
				return i;
			
			else if(arr[i]>target)
				return i;
			
		}
		return n;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,6};
		int n = arr.length;
		int target=5;
		System.out.println(findIndex(arr, n,target));

	}

}
