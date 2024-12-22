package Array;

public class singleNumber {

    // Function to find the number that appears only once using XOR
    static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {2,1,3,3,6,9,8,6,8,2,1}; 
        System.out.println("The single number is: " + singleNumber(nums));
    }
}
