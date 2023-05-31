package in.ineuron;

import java.util.Arrays;

public class First {
	
	    public int[] twoSum(int[] nums, int target) {
	        int[] ans = new int[2];
	        int n = nums.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (nums[j] == target- nums[i]) {
	                    ans[0] = i;
	                    ans[1] = j;
	                    return ans;
	                }
	            }
	        }
	        return ans;
	    
	}
			
		
		public static void main(String[] args) {
			int arr[]= {2,7,11,15};
			
			
			int target=9;
			
			First M = new First();
			int[] K = M.twoSum(arr, target);
			System.out.println(Arrays.toString(K));

		}

	

}
