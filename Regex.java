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
