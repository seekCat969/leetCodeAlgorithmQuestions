import java.util.*;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

/**
 * 26.删去有序数组的重复项 Simple
 */

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (nums[i] != n) {
                nums[++i] = n;
            }
        }
        return ++i;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5,6};
        int i = RemoveDuplicates.removeDuplicates(nums);
        System.out.println(i);
    }
}
