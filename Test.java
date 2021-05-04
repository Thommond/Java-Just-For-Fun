import java.util.*;

class Test {

  String[] questions;
  String[] answers;
  int correct;
  int total;

  // Constructor
   Test(String[] questions, String[] answers, int total)
   {
       this.questions = questions;
       this.answers = answers;
       correct = 0;
       this.total = total;
   }


  public String simulateQuestion(String question) {
    return question;
  }

  public String checkAnswer(String answer, String userAnswer) {

    // Adds to correct then displays message or just displays message
    if (userAnswer.contains(answer)) {

      correct += 1;
      return generateMessage(answer, 1);

    } else {

      return generateMessage(answer, 0);

    }

  }

  public String generateMessage(String answer, int type) {

      Random rand = new Random();
      String message = "";
      // Generates random message based on input
      if (type == 0) {

        int number = rand.nextInt(4);

        switch(number) {

          case 0 :
            message = "Well maybe next time. Answer was %s ".formatted(answer);
            break;

          case 1 :
            message =  "Good Try. Answer was %s ".formatted(answer);
            break;

          case 2 :
            message = "Sorry, not quite. Answer was %s ".formatted(answer);
            break;

          case 3 :
            message = "At least you will learn. Answer was %s ".formatted(answer);
            break;
        }


    } else {

      int number = rand.nextInt(4);

      switch(number) {

        case 0 :
          message = "Excellent!";
          break;

        case 1 :
          message = "Good!";
          break;

        case 2 :
          message = "Keep up the good work!";
          break;

        case 3 :
          message = "Nice work!";
          break;

      }
    }

    return message;
  }

    public void inputAnswer() {

    float percent;
    int incorrect2;

    // Goes through each question calls all methods on each.
    for (int i = 0; i < questions.length; i++)  {

      Scanner userInput = new Scanner(System.in);
      System.out.println(this.simulateQuestion(questions[i]));
      String userAnswer = userInput.nextLine();
      System.out.println(checkAnswer(this.answers[i], userAnswer));

    }

    // Displays final values, correct, incorrect and percentage.
    System.out.println("Number of corret answers, %s".formatted(correct));
    incorrect2 = total - correct;
    System.out.println("Number of incorrect answers, %s".formatted(incorrect2));
    percent = (float)((correct*100) / total);
    System.out.println("Percentage of correct is %s percent".formatted(percent));


  }

  public static void main(String[] args) {


    String[] strQuestions = {
      "What does static mean? A. Task that does not depend on object.  B. Returns nothing. C. Is only visible to certian methods. D. Cannot be changed later.",
      "Java by convention uses what case? A. pascal_case B. None specified C. camelCase D. Number1Case",
      "A class that creates an object of another class, then calls the objects methods is a A. Fun class B. Private class C. Driver class D. Public class",
      "Which data type can provide 15 significant digits and is very precise. A. Float B. Double C.Int D. Long",
      "How many phases do java programs usually go through? A. 1 B. 4 C. 3 D. 5"
    };

    String[] strAnswers = {"A", "C", "C", "B", "D"};

    // Initializing object
    Test test = new Test(strQuestions, strAnswers, strQuestions.length);

    test.inputAnswer();

  }


}
