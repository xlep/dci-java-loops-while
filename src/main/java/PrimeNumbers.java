public class PrimeNumbers {
  public static void main (String[] args) {
    int currentNumber = 2;
    StringBuilder primeNumbers = new StringBuilder();

    while (currentNumber <= 100) {
      // any number between 2 and 100 needs to be checked
      int previousNumber = 2;

      boolean isPrime = true;
      while (previousNumber < currentNumber) {
        // if there is no remainder, we add it to our list of prime numbers
        if (currentNumber % previousNumber == 0) {
          isPrime = false;
        }
        previousNumber++;
      }

      if (isPrime) {
        primeNumbers.append(", " + currentNumber);
      }
      currentNumber++;
    }

    System.out.println("Prime numbers from 1 to 100: " + primeNumbers);
  }
}
