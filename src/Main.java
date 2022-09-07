import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // For convenience of viewing code, I'm going to run my codes statically with no regards for memory leaks.
        // In actual program, I would avoid using static which will cause memory leaks if used incorrectly. will also properly encapsulate
        // But, for you to read the algorithm easier for now.

        // Run test cases
        for(String testCase : Lab1.palTestCases){
            System.out.println(Lab1.isPalindrome(testCase));
        }

    }
}