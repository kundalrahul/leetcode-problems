package leetcode.problems;

//Question URL: - https://leetcode.com/problems/two-sum/

public class TwoSum {

	public static void main(String[] args) {

		int arr[] = { 3, 7, 11, 15, 4, 5 };
		int target = 9;
		int resultArray[] = new int[arr.length];
		resultArray = twoSum(arr, target);
		for (int i = 0; i < resultArray.length; i++)
			System.out.println(resultArray[i]);

	}

	private static int[] twoSum(int[] arr, int target) {
		int resultArray[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (i > target)
				i++;
			else if (i == target) {
				resultArray[0] = i;
				return resultArray;
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					if ((i + j) == target) {
						resultArray[0] = i;
						resultArray[1] = j;
					} else {

					}
				}
			}
		}
		return resultArray;

	}

}
