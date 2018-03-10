class UsernameValidator {
    /*
     * Write regular expression here.
     */
    Pattern.compile(pattern); //in try catch to see if it works
    public static final String regularExpression = "[a-zA-Z]\\w{7,29}"; //First char alphabetic, then 7-29 alphanumeric chars
    public static final String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public static final String pattern = "(" + zeroTo255 + "\\.){3}" + zeroTo255; //IP addresses



}

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
/////////////////////////////////////////////////////////////////
//Password must contain 1 of .... each

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
        int count = 0;

		Pattern patternDigit = Pattern.compile("(\\d)");
		Pattern patternUpper = Pattern.compile("([A-Z])");
		Pattern patternLower = Pattern.compile("([a-z])");
		Pattern patternSpecial = Pattern.compile("(\\W)");

		Matcher matcherDigit = patternDigit.matcher(password);
		Matcher matcherUpper = patternUpper.matcher(password);
		Matcher matcherLower = patternLower.matcher(password);
		Matcher matcherSpecial = patternSpecial.matcher(password);

		if (!matcherDigit.find()) {
			count++;
		}
		if (!matcherUpper.find()) {
			count++;
		}
		if (!matcherLower.find()) {
			count++;
		}
		if (!matcherSpecial.find()) {
			count++;
		}
		if ((count+password.length())<6) {
			count = count + 6-(count+password.length());
		}
		return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
