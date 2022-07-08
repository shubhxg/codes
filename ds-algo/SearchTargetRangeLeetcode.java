import java.util.Arrays;

public class SearchTargetRangeLeetcode {
    public static void main(String[] args) {
        int nums[] = {1,3};
        int target = 1;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] ansArr = new int[]{-1,-1};

        // array is empty
        if(nums.length == 0) return ansArr;

        // checking from starting index
        for (int i = 0; i <=nums.length-1; i++) {
            if(nums[i] == target) {
                ansArr[0] = i; 
                break;
            }
        }

        // checking from last index
        for (int i = nums.length-1; i >=0; --i) {
            if(nums[i] == target) {
                ansArr[1] = i;
                break; 
            }
        }
        
        return ansArr;
    }
}
