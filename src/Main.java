import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.majorityElement(new int[]{1, 2, 1, 1, 1, 2, 2, 2, 1});
    }

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
