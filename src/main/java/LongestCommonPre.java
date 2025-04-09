import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * 14.最长公共前缀 Simple
 * */
public class LongestCommonPre {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPre l = new LongestCommonPre();
        System.out.println(l.longestCommonPrefix(new String[]{"", "", "car"}));
    }
}
