import java.util.ArrayList;
import java.util.List;

public class Lab1 {
    // This is leetcode #125
    // https://leetcode.com/problems/valid-palindrome/
    // Difference is that, in leetcode testcases, the string may contain spaces, symbols,
    // and numbers which is to be ignored.
    // Here was my answer to the leetcode in C# : https://pastebin.com/679vtqZ5
    // To translate in Java:

    // Here are the test cases
    public static List<String> palTestCases = new ArrayList<>(){
        {
            // Reminder: My algo ignores all non-alphanumeric characters.
            // Add test cases as desired.
            add("Don't nod.");
            add("Not a palindrome");
            add("Anne, I vote more cars race Rome to Vienna.");
            add("Oh, who was it I saw? Oh, who?");
            add("Another phrase that is not a palindrome");
            add("A man, a plan, a canal: Panama.");
            add("Are we not drawn onward, we few, drawn onward to new era?");

            // T F T T F T T
        }
    };

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        s = s.toUpperCase();

        while(left <= right){
            // Skip any invalid characters. Only compare letters
            if(!Character.isLetterOrDigit(s.charAt(left)) && !Character.isLetterOrDigit(s.charAt(right))){
                left++;
                right--;
                continue;
            }else if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }

            // Compare two characters from left and from right, drawing closer to middle
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        // Passed through all the letters. Phrase is a palindrome
        return true;
    }
}
