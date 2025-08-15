public class twoSum {
// Aaarray -- Data -- Structure -Day 1
// This Java program finds two indices of numbers in an array that add up to a given target.
// It uses a brute force approach to check all pairs of numbers in the array.           
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(nums, target);
        System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
    }

    static int[] findTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result; // Return an empty array if no solution is found             
    }
}
