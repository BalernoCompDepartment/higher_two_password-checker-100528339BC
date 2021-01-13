import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    boolean valid = false;
    String attempt;
    char firstChar;
    char lastChar;
    int asciiFirst;
    int asciiLast;

    while (!valid){
      System.out.println("enter password");
      attempt = scan.next();
      firstChar = attempt.charAt(0);
      lastChar = attempt.charAt(attempt.length() - 1);

      asciiFirst = (int)firstChar;
      asciiLast = (int)lastChar;

      if (asciiFirst >= 40 && asciiFirst <= 42 && asciiLast >= 65 && asciiLast <= 90 && attempt.length() >= 8){
        valid = true;
      }else { 
        System.out.println("Error password must be at least 8 characters, with a ()* to start adn a captial at the end");
      } 
    }
    System.out.println("Your password meets the strength requirements");
  }
}
