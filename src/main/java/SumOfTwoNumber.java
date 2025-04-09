import java.util.*;

/**1.两数之和*/
public class SumOfTwoNumber {

    private static final Scanner SC = new Scanner(System.in);

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            }else {map.get(nums[i]).add(i);}

            if (map.containsKey(target - nums[i])) {
                for (Integer integer : map.get(target - nums[i])) {
                    if (integer != i){return new int[]{integer,i};}
                }
            }
        }

        return new int[2];
    }

    public static void main(String[] args) {
        SumOfTwoNumber stn = new SumOfTwoNumber();

        String s = SC.nextLine();
        String[] s1 = s.split(" ");
        String[] split = s1[2].substring(s1[2].indexOf('[') + 1, s1[2].indexOf(']')).split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }

        System.out.println(Arrays.toString(stn.twoSum(nums, Integer.parseInt(s1[s1.length - 1]))));
    }
}
