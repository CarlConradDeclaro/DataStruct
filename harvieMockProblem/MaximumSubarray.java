package harvieMockProblem;

import java.util.ArrayList;

public class MaximumSubarray {
    	static void MaxSubArray(int[] arr) {

		int m = arr[0];
		ArrayList<Integer> list =  new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			int s =0;
			for(int j=i; j<arr.length; j++) {
				s+=arr[j];
				if(s > m) {
					list.clear();
					for(int k=i; k<=j; k++) {
						list.add(arr[k]);
					}
					m = s;
				}
			}
		}


		for(int res : list) {
			System.out.print(res + " ");
		}



	}
    public static void main(String[] args) {
        	int[] arr = {-2,4,8,9};

		MaxSubArray(arr);
    }
}
