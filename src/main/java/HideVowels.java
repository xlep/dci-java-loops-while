import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HideVowels {

  public static void main (String[] args) {
    Pattern pattern = Pattern.compile("[AEIOUaeiouÄÖÜäöü]");
    String string = "I'm gonna make him an offer he can't refuse";

    System.out.println("Original String:\n" + string);

    StringBuilder resultString = new StringBuilder();
    int count = 0;

    while (count < string.length()) {
      String currentLetter = string.substring(count, count + 1);
      Matcher matcher = pattern.matcher(currentLetter);

      if (matcher.matches()) {
        resultString.append("*");
      } else {
        resultString.append(currentLetter);
      }
      count++;
    }

    System.out.println("Vowels hidden:\n" + resultString.toString());
  }

}
