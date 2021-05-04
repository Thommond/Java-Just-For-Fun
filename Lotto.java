import java.util.*;

class Lotto {

  int[] randomValues;

  Lotto()
  {
    randomValues = randomVal();
  }

  public void win() {

    // Initializing
    Scanner userInput = new Scanner(System.in);
    int sum = 0;
    boolean win = false;

    // Calc sum
    for (int num : randomValues) {
      sum += num;
    }

    System.out.println(sum);

    // Getting user input
    for (int i = 5; i > 0; i-- ) {

      System.out.println("You have %s guesses left.".formatted(i));

      String userAnswer = userInput.nextLine();
      int userAnNum = Integer.parseInt(userAnswer);

      if ( userAnNum < 3 || userAnNum > 27) {
        System.out.println("That is not a valid number only guess, 3 - 27");
      } else {

        if (userAnNum == sum ) {
          win = true;
          System.out.println("You win!");
          break;
        }
      }
    }

    // If the did not guess correct.
    if (win == false) {
      System.out.println("You loose!");
    }


  }

  public int[] randomVal() {

    Random rd = new Random(); // creating Random object
      int[] arr = new int[3];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(9);
      }

    return arr;
  }

  public static void main(String[] args) {
    
    Lotto game = new Lotto();
    game.win();

  }

}
