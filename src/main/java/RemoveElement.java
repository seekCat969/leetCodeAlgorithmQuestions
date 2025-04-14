import java.util.ArrayList;
import java.util.List;

/**
 * 27. 移除元素 Simple
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != val){
                list.add(num);
            }
        }
        int i = 0;
        for (Integer e : list) {
            nums[i] = e;
            i++;
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int i = RemoveElement.removeElement(nums, val);
        for (int i1 = 0; i1 < i; i1++) {
            System.out.println(nums[i1]);
        }
    }
}
