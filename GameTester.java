import java.util.*;

abstract class GameTester {

  protected String name;
  protected boolean workType;

  public GameTester() {
    this.name = name;
    this.workType = workType;
  }

  abstract public String salary();
}

class FullTimeGameTester extends GameTester {

  public FullTimeGameTester(String name, boolean workType) {
    this.name = name;
    this.workType = workType;
  }

  public String salary() {
    return "Your salary is $3000 dollars";
  }


}

class PartTimeGameTester extends GameTester {

  String hours;

  public PartTimeGameTester(String name, boolean workType, String hours) {
    this.name = name;
    this.workType = workType;
    this.hours = hours;
  }

  public String salary() {

    return "You are a %s making $20 per hour and working %s hours.".formatted(workType, hours);
  }

}

class DriverGame {


  public static void main(String[] args) {

    // Starting userInput
    Scanner userInput = new Scanner(System.in);

    System.out.println("We are going to create a game tester.");
    System.out.println("Please type in the gametesters name.");

    String userAnswer = userInput.nextLine();

    String name = userAnswer;

    System.out.println("Please enter a type of gametester A. For Part-time B. For Full-time");

    userAnswer = userInput.nextLine();

    boolean work = false;

    if (userAnswer.contains("A")) {
      work = true;
    } else if (userAnswer.contains("B")) {
      work = false;
    } else {
      System.out.println("Not a valid work type try again.");
    }

    if (work == false) {

      FullTimeGameTester ftgt = new FullTimeGameTester(name, work);
      System.out.println(ftgt.salary());
    }

    else {

      System.out.println("Please type in the hours for your part time game tester.");
      userAnswer = userInput.nextLine();
      PartTimeGameTester ptgt = new PartTimeGameTester(name, work, userAnswer);
      System.out.println(ptgt.salary());
    }


  }



}
