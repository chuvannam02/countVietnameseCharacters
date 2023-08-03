import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.HashMap;
//import java.util.Map;

public class Algorithm {
//	public static int countVietnameseCharacters1(String input) {
//
//        HashMap<Character, Integer> rules = new HashMap<>();
//        rules.put('a', 1);
//        rules.put('w', 1); 
//        rules.put('s', 1);
//        rules.put('f', 1);
//        rules.put('r', 1);
//        rules.put('x', 1);
//        rules.put('j', 1); 
//        rules.put('e', 1);
//        rules.put('o', 1);
//        rules.put('w', 1);
//        rules.put('w', 1);
//        rules.put('u', 1);
//
//        int count = 0;
//        int length = input.length();
//
//        for (int i = 0; i < length; i++) {
//            char c = input.charAt(i);
//
//            if (rules.containsKey(c)) {
//                count++;
//                i++; 
//            }
//        }
//
//        return count;
//    }

	public static int countVietnameseCharacters(String input) {
		String patternString = "(aw|aa|dd|ee|oo|ow|w|\\[|\\])";
        Pattern pattern = Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
        	count++;
        }
        return count;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(countVietnameseCharacters(input));
        sc.close();
    }
}
