public class LambdaClass {

  public static void main(String[] args) {
      //greetingFunction = () -> System.out.println("Hello");
      //addFunction = (int a, int b) -> a + b;
      /*safeDivideFunction = (int a, int b) -> {
        if (b==0) {
          return 0
        } else {
          return a / b;
        }
      };*/
      //stringLengthCountFunction = (String s) -> s.length();
      DoubleFunction doubleFunction = (int a) -> a * 2;
      System.out.println(doubleFunction.doubleFunc(5));
  }
}
