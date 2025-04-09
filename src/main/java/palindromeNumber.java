/**
 * 回文数*/
public class palindromeNumber {

    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        palindromeNumber pn = new palindromeNumber();
        System.out.println(pn.isPalindrome(141));
    }

}
