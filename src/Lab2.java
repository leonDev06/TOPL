import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    // DFA of strings with input of 0 or 1, and must be ending with '01'

    public static List<String> testCases = new ArrayList<>(){
        {
            // TEST CASES
            // True
            add("0000111010101010111001");
            add("01010101010110001101");
            add("001110001010101");
            // False
            add("001110000101010");
            add("00011010101101111000");
            add("010101010000100");
            // Invalid
            add("02022");
            add("1010101003301");
            add("helloworld");
        }
    };

    public static void test(){
        for(String testCase : testCases){

            if(isValidDfa(testCase)){
                System.out.println("String Accepted");
            }else{
                System.out.println("String not Accepted");
            }

        }
    }

    public static boolean isValidDfa(String s){

        String VALID_INPUTS = "01";
        String state = "q0";

        for(int i = 0; i < s.length(); i++){
            // Check if the current input is valid: "Must be 0 or 1"
            if(!VALID_INPUTS.contains(String.valueOf(s.charAt(i)))){
                System.out.print("Invalid Input: ");
                return false;
            }

            // Perform check
            switch (state) {
                case "q0", "q2" -> state = (s.charAt(i) == '0') ? "q1" : "q0";
                case "q1" -> state = (s.charAt(i) == '1') ? "q2" : "q1";
                default -> {
                }
            }
        }
        return state.equals("q2");
    }

}
