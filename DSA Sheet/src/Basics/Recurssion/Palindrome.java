package Basics.Recurssion;

/* 

    Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

    Examples
    Example 1:
    Input: Str =  “ABCDCBA”
    Output: Palindrome
    Explanation: String when reversed is the same as string.

    Example 2:
    Input: Str = “TAKE U FORWARD”
    Output: Not Palindrome
    Explanation: String when reversed is not the same as string.


*/
public class Palindrome {
    public static void main(String[] args) {
        String str = "ABCDCBAw";

        System.out.println(checkPalindrome(str, 0));
    }

    private static boolean checkPalindrome(String str, int pointer) {

        if (pointer >= str.length() / 2)
            return true;

        if (str.charAt(pointer) != (str.charAt(str.length() - pointer - 1)))
            return false;

        return checkPalindrome(str, pointer + 1);
    }
}
