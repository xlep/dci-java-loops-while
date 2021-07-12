public class Solution {

  public static void main (String[] args) {
    // print "Hello world!"
    System.out.println("## Task 'hello world'");
    int helloWorldCount = 0;

    while (helloWorldCount < 6) {
      System.out.println("Hello World!");
      helloWorldCount++;
    }

    // doubled number exceeds 100
    System.out.println("## Task 'multiply numbers'");
    int sum = 3;
    System.out.println("Starting number is " + sum);

    while (sum < 100) {
      sum = sum * 2;
      System.out.println("Current result is " + sum);
    }

    // count down from 30
    System.out.println("## Task 'countdown'");
    int count = 10;
    while (count >= 0) {
      System.out.println(count);
      count--;
    }
  }

}
