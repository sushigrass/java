////////////////////////////////////////////////////////////////////////////////
//String Matching

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            a.add(scan.next());
        }
        int q = scan.nextInt();
        String[] queries = new String[q];
        for(int i = 0; i < q; i++){
            queries[i] = scan.next();
        }
        for(int i = 0; i < q; i++) {
            int count = 0;
            for(String str : a) {
                if(str.equals(queries[i]))
                    count++;
            }
            System.out.println(count);
        }
    }
}
////////////////////////////////////////////////////////////////////////////////
//Left rotation of int array

public class Solution {

    static int[] leftRotation(int[] a, int d) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            b[(i + a.length - d)% a.length] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
    }
}
////////////////////////////////////////////////////////////////////////////////
//Hourglass

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A[][]  = new int[6][6];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                A[i][j] = in.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int sum = A[i][j] + A[i][j + 1] + A[i][j + 2] + A[i + 1][j + 1] + A[i + 2][j] + A[i + 2][j + 1] + A[i + 2 ][j + 2];
                if (maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
////////////////////////////////////////////////////////////////////////////////
//Count positives, negatives, zeroes in array

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ints = new int[in.nextInt()];
        double positives = 0;
        double negatives = 0;
        double zeros = 0;
        for (int i = 0; i < ints.length; i++){
            ints[i] = in.nextInt();
            if (ints[i] > 0){
                positives++;
            } else if (ints[i] < 0){
                negatives++;
            } else {
                zeros++;
            }
        }
        System.out.println(positives / ints.length);
        System.out.println(negatives / ints.length);
        System.out.println(zeros / ints.length);
    }
}
////////////////////////////////////////////////////////////////////////////////
//Remove double letters in string

public class Solution {

    static String super_reduced_string(String s){
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i)==s.charAt(i - 1)){
                s = s.substring(0, i - 1) + s.substring(i + 1);
                i = 0;
            }
        }
        if (s.length() == 0){
            return "Empty String";
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
////////////////////////////////////////////////////////////////////////////////
//Min sum and max sum of 4 out of 5 digits (sort then check)
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        long minSum = arr[0];
        long maxSum = arr[4];
        for (int i = 1; i < arr.length - 1; i++){
            minSum += arr[i];
            maxSum += arr[i];
        }
        System.out.println(minSum+" "+maxSum);

    }
}
////////////////////////////////////////////////////////////////////////////////
//staircase

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
             for(int k=n;k>i;k--)
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++)
             {
                 System.out.print("#");
             }
            System.out.println();
        }
    }
}

////////////////////////////////////////////////////////////////////////////////
//CamelCase
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for (int i = 0; i < s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
////////////////////////////////////////////////////////////////////////////////
//SOS find strings within string
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        for (int i = 0; i < S.length(); i += 3){
            if (S.charAt(i)!='S'){
                count++;
            }
            if (S.charAt(i+1)!='O'){
                count++;
            }
            if (S.charAt(i+2)!='S'){
                count++;
            }
        }
        System.out.println(count);
    }
}
//ALETRNATIVE:
public static int countChanges(String message) {
    String sos = "SOS";
    int count = 0;
    for (int i = 0; i < message.length(); i++) {
        if (message.charAt(i) != sos.charAt(i % 3)) count++;
    }
    return count;
}
////////////////////////////////////////////////////////////////////////////////
//encryption decrpyton encrpty decrypt ASCII chars ascii
public class Solution {

    public static void main(String[] args) {
        int num=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int k = sc.nextInt();
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<n;i++){
			num=0;
			ch = str.charAt(i);
			if((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90){
				num = (int)str.charAt(i) + k % 26;
				if(num>90){
					num=64+num-90;
        }
				sb.setCharAt(i, (char)num);
			}
			if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122){
				num = (int)str.charAt(i) + k %26;
				if(num>122){
					 num=96+num-122;
        }
				sb.setCharAt(i, (char)num);
			}
		}
		System.out.println(sb);
        sc.close();
    }
}
////////////////////////////////////////////////////////////////////////////////
//Palindrome
class Palindrome{
  public static void main(String args[]){
    String inputString;
    Scanner in = new Scanner(System.in);

    System.out.println("Input a string");
    inputString = in.nextLine();

    int length  = inputString.length();
    int i, begin, end, middle;

    begin  = 0;
    end    = length - 1;
    middle = (begin + end)/2;

    for (i = begin; i <= middle; i++) {
      if (inputString.charAt(begin) == inputString.charAt(end)) {
        begin++;
        end--;
      }
      else {
        break;
      }
    }
    if (i == middle + 1) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Not a palindrome");
    }
  }
}
////////////////////////////////////////////////////////////////////////////////
//palindrome alternative
class Palindrome
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);

      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();

      int length = original.length();

      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);

      if (original.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
   }
}
////////////////////////////////////////////////////////////////////////////////
//shorter palindrome with stringbuilder

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String sb = new StringBuilder(A).reverse().toString();
        String ans = (sb.equals(A)) ? "Yes" : "No";
        System.out.println(ans);
    }
}
////////////////////////////////////////////////////////////////////////////////
//palindrome  with for loop

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String ans = "";
        for (int i = 0; i < A.length(); i++){
            if (A.charAt(i)!=A.charAt(A.length()-(i+1))){
                ans = "No";
                break;
            }
            if (A.length()%2==1){
                if (i == A.length()-(i+1)){
                    break;
                }
            } else {
                if (A.length()/2==i+1){
                    break;
                }
            }
        }
        if (!ans.equals("No")){
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
////////////////////////////////////////////////////////////////////////////////
//find max in array, return all equal to max

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        Arrays.sort(ar);
        int count = 0;
        for (int i = 0; i < ar.length; i++){
            if (ar[i]==ar[ar.length-1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
////////////////////////////////////////////////////////////////////////////////
//time conversion Time Conversion

public class Solution {

    static String timeConversion(String s) {
        String s2 = "";
        if (s.contains("AM")){
            if (Integer.valueOf(s.substring(0,2)) == 12){
                s2 += "00" + s.substring(2, 8);
            } else {
            s2 += s.substring(0, 8);
            }
        } else {
            if (Integer.valueOf(s.substring(0,2))==12){
                s2 += s.substring(0, 8);
            } else {
            s2 += Integer.toString(Integer.valueOf(s.substring(0,2))+12) + s.substring(2, 8);
            }
        }
        return s2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
////////////////////////////////////////////////////////////////////////////////
//Round up grades within 2 marks of multiple of 5

public class Solution {

    static int[] solve(int[] grades){
        for (int i = 0; i < grades.length; i++){
            if (grades[i] >= 38 && grades[i] % 5 >= 3){
                grades[i] = grades[i] + (5 - (grades[i] % 5));
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
////////////////////////////////////////////////////////////////////////////////
//cat mouse closeness

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int result = Math.abs(x-z) - Math.abs(y-z);
            if (result > 0){
                System.out.println("Cat B");
            } else if (result < 0){
                System.out.println("Cat A");
            } else {
                System.out.println("Mouse C");
            }
        }
    }
}
////////////////////////////////////////////////////////////////////////////////
//apples oranges x axis distance (tree, house left wall, house right wall, tree)
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int aCount = 0;
        int oCount = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if (apple[apple_i] + a >= s && apple[apple_i] + a <= t){
                aCount++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if (b + orange[orange_i] <= t && b + orange[orange_i] >= s){
                oCount++;
            }
        }
        System.out.println(aCount);
        System.out.println(oCount);
    }
}
////////////////////////////////////////////////////////////////////////////////
//kangaroo catching up (linear equation matrix stuff)

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2 && ((x2-x1)%(v1-v2)==0)){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
////////////////////////////////////////////////////////////////////////////////
//math series of sums
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++){
                a += (Math.pow(2,j)*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
        in.close();


    }
}
////////////////////////////////////////////////////////////////////////////////
//lexicographical order

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        String lexi = (A.compareTo(B) < 0 || A.compareTo(B) == 0) ? "No" : "Yes";
        System.out.println(lexi);
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

    }
}
////////////////////////////////////////////////////////////////////////////////
//number data types and max and mins

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                }
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
////////////////////////////////////////////////////////////////////////////////
//static initializer block

public class Solution {

static Scanner input = new Scanner(System.in);
static boolean flag = true;
static int B = input.nextInt();
static int H = input.nextInt();

static{
    try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){
        System.out.println(e);
    }

}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}
}
////////////////////////////////////////////////////////////////////////////////
//end of file

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        while (input.hasNext()){
            System.out.println(count+" "+input.nextLine());
            count++;
        }
    }
}
////////////////////////////////////////////////////////////////////////////////
//time and date java 8
import java.time.LocalDate;
public class Solution {
    public static String getDay(String day, String month, String year) {
        LocalDate dt = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return dt.getDayOfWeek().name();

    }
////////////////////////////////////////////////////////////////////////////////
//smallest and largest lexicographical substring

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        SortedSet<String> orderedSet = new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++){
            orderedSet.add(s.substring(i,i+k));
        }
        return orderedSet.first() + "\n" + orderedSet.last();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
////////////////////////////////////////////////////////////////////////////////
//check if anagram
static boolean isAnagram(String a, String b) {
    if (a.length()!=b.length()){
        return false;
    }
    a = a.toLowerCase();
    b = b.toLowerCase();
    Map<Character, Integer> map = new HashMap<>();
    for (int k = 0; k < b.length(); k++){

        char letter = b.charAt(k);

        if(!map.containsKey(letter)){
            map.put(letter, 1);
        } else {
            Integer frequency = map.get(letter);
            map.put(letter, ++frequency );
        }
    }
    for (int k = 0; k < a.length(); k++){
        char letter = a.charAt(k);

        if(!map.containsKey(letter)){
            return false;
        }
        Integer frequency = map.get(letter);
        if(frequency == 0){
            return false;
        } else {
            map.put(letter, --frequency);
        }
    }
    return true;
}
////////////////////////////////////////////////////////////////////////////////
//try catch two classes
public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MyCalculator {
    static long power (int a, int b) throws Exception {
        if (a == 0 && b == 0){
            throw new Exception("n and p should not be zero.");
        } else if (a < 0 || b < 0){
            throw new Exception("n or p should not be negative.");
        } else {
            return (long)Math.pow(a,b);
        }
    }

}
////////////////////////////////////////////////////////////////////////////////
//biginteger bigInteger big integer
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         BigInteger bi1 = new BigInteger(sc.next());
         BigInteger bi2 = new BigInteger(sc.next());
         System.out.println(bi1.add(bi2));
         System.out.println(bi1.multiply(bi2));
    }
}
////////////////////////////////////////////////////////////////////////////////
//prime number using BigInteger.isProbablePrime(100)
System.out.println(in.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
////////////////////////////////////////////////////////////////////////////////
//prime using iteration for odds
boolean is`(int n) {
    //check if n is a multiple of 2
    if (n%2==0) return false;
    //if not, then just check the odds
    for(int i=3;i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
}
////////////////////////////////////////////////////////////////////////////////
//print list of primes up to n
void checkPrime(int... numbers) {
    for (int number : numbers) {
        if (isPrime(number)){
            System.out.print(number +" ");
        }
    }
    System.out.println();
}
boolean isPrime(int n) {
//check if n is a multiple of 2
if (n<2) return false;
if (n==2) return true;
if (n%2==0) return false;
//if not, then just check the odds
for(int i=3;i<=n;i+=2) {
    if(n%i==0)
        return false;
}
return true;
}
////////////////////////////////////////////////////////////////////////////////
//instanceof keyword
for(int i = 0; i < mylist.size(); i++){
   Object element=mylist.get(i);
   if(element instanceof Student)
      a++;
   if(element instanceof Rockstar)
      b++;
   if(element instanceof Hacker)
      c++;
}
////////////////////////////////////////////////////////////////////////////////
//static inner classes
static class Inner{
  private class Private{
    private String powerof2(int num){
      return ((num&num-1)==0)?"power of 2":"not a power of 2";
    }
  }
}
o = new Inner().new Private();
System.out.println(num + " is " + ((Solution.Inner.Private)o).powerof2(num));
////////////////////////////////////////////////////////////////////////////////
//Hashset of size() t
HashSet<String> pairs = new HashSet<String>(t);
    for(int i = 0; i < t; i++)
    {
        pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
        System.out.println(pairs.size());
    }
////////////////////////////////////////////////////////////////////////////////
//bubblesort bubble sort
static void bubbleSort(int[] arr) {
     int n = arr.length;
     int temp = 0;
      for(int i=0; i < n; i++){
              for(int j=1; j < (n-i); j++){
                       if(arr[j-1] > arr[j]){
                              //swap elements
                              temp = arr[j-1];
                              arr[j-1] = arr[j];
                              arr[j] = temp;
                      }

              }
      }

 }
////////////////////////////////////////////////////////////////////////////////
//insertionsort insertion sort
public static void insertionSort(int array[]) {
    int n = array.length;
    for (int j = 1; j < n; j++) {
        int key = array[j];
        int i = j-1;
        while ( (i > -1) && ( array [i] > key ) ) {
            array [i+1] = array [i];
            i--;
        }
        array[i+1] = key;
    }
}
////////////////////////////////////////////////////////////////////////////////
//merge sort mergesort
private void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
    if (low < high) {
        // Get the index of the element which is in the middle
        int middle = low + (high - low) / 2;
        // Sort the left side of the array
        mergesort(low, middle);
        // Sort the right side of the array
        mergesort(middle + 1, high);
        // Combine them both
        merge(low, middle, high);
    }
}
private void merge(int low, int middle, int high) {

    // Copy both parts into the helper array
    for (int i = low; i <= high; i++) {
        helper[i] = numbers[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;
    // Copy the smallest values from either the left or the right side back
    // to the original array
    while (i <= middle && j <= high) {
        if (helper[i] <= helper[j]) {
            numbers[k] = helper[i];
            i++;
        } else {
            numbers[k] = helper[j];
            j++;
        }
        k++;
    }
    // Copy the rest of the left side of the array into the target array
    while (i <= middle) {
        numbers[k] = helper[i];
        k++;
        i++;
    }
    // Since we are sorting in-place any leftover elements from the right side
    // are already at the right position.

}
////////////////////////////////////////////////////////////////////////////////
//quicksort quick sort
public static void quickSort(int[] arr, int low, int high) {
  if (arr == null || arr.length == 0)
    return;

  if (low >= high)
    return;

  // pick the pivot
  int middle = low + (high - low) / 2;
  int pivot = arr[middle];

  // make left < pivot and right > pivot
  int i = low, j = high;
  while (i <= j) {
    while (arr[i] < pivot) {
      i++;
    }

    while (arr[j] > pivot) {
      j--;
    }

    if (i <= j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  // recursively sort two sub parts
  if (low < j)
    quickSort(arr, low, j);

  if (high > i)
    quickSort(arr, i, high);
}
////////////////////////////////////////////////////////////////////////////////
//factorial recursive recursion
static int factorial(int n) {
  if (n == 1) {
    return 1;
  }
  return n * factorial(n - 1);
}
////////////////////////////////////////////////////////////////////////////////
class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
////////////////////////////////////////////////////////////////////////////////
//Multitiered multi-tiered multi tiered comparator java 8
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());

      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();

         Student st = new Student(id, fname, cgpa);
         studentList.add(st);

         testCases--;
      }

       Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().
              thenComparing(Student :: getFname).thenComparing(Student :: getId));

         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
////////////////////////////////////////////////////////////////////////////////
//Boring Multitiered multi-tiered multi tiered Comparator

class Student implements Comparable{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int compareTo(Object o){
        Student s=(Student)o;
        if(cgpa==s.cgpa){
            if(fname.equals(s.fname)){
                return id-s.id;
            }else{
                return fname.compareTo(s.fname);
            }
        }else{
            if(s.cgpa-cgpa>0)
                return 1;
            else
                return -1;
        }
    }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());

      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();

         Student st = new Student(id, fname, cgpa);
         studentList.add(st);

         testCases--;
      }
      Collections.sort(studentList);
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
