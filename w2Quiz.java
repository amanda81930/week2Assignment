package week.two;

public class w2Quiz {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("Week 2: Quiz");
    System.out.println("Question 1");
    /*
     * Drag the correct answers into the following code that will set the value of letterGrade to
     * the appropriate letter depending on the value of numericGrade based on the scale below:
     * HINTS: We use a series of if / else conditional statements to solve this problem. Some of the
     * choices will not be used, and two are used more than once. 90 and above = A; 80-89 = B; 70-79
     * = C; 60-69 = D; 59 or lower = F;
     */
    // Initialize the two variables.
    int numericGradeQ = 98;
    char letterGradeQ = ' ';
    // Set the letterGrade variable, based on the numericGrade
    if (numericGradeQ >= 90) {
      letterGradeQ = 'A';
    } else if (numericGradeQ >= 80) {
      letterGradeQ = 'B';
    } else if (numericGradeQ >= 70) {
      letterGradeQ = 'C';
    } else if (numericGradeQ >= 60) {
      letterGradeQ = 'D';
    } else {
      letterGradeQ = 'F';
    }
    System.out.println("The letter Grade for a " + letterGradeQ + " .");

    System.out.println("Question 3");
    // Final output to console be: "Definitely going to sleep in!"
    int qday = 6;
    int qmonth = 4;
    boolean isSummer = qmonth >= 6 || qmonth <= 8;
    boolean isWeekday = qday < 6;
    if (isSummer && !isWeekday) {
      System.out.println("Definitely going to sleep in!");
    } else {
      System.out.println("Probably need to wake up at a decent time.");
    }

    System.out.println("Question 6");
    // Create a for loop that iterates 100 times, from 9 to 99, and prints ever ODD number
    for (int index = 0; index <= 99; index++) {
      if (!(index % 2 == 0)) {
        System.out.println(index);
      }
    }

    System.out.println("Question 7");
    // What does the following code print to console?
    double moneyInWallet = 4.50;
    double costOfMilk = 1.99;
    if (moneyInWallet >= costOfMilk * 2) {
      System.out.println("Let's buy two gallons.");
    } else if (moneyInWallet >= costOfMilk) {
      System.out.println("Let's buy one gallon.");
    } else {
      System.out.println("Way too expensive!");
    }

    System.out.println("Question 8");
    // What will the following code print?
    String name = "Tommy";
    int age = 52;
    if (name == "Tommy") {
      System.out.println("Hi, Tommy!");
    } else if (age == 52) {
      System.out.println("52 years old.");
    }
    System.out.println("Out of conditional");

    System.out.println("Question 9");
    // Create for loop to print 0 through 9 to console
    for (int index9 = 0; index9 <= 9; index9++) {
      System.out.println(index9);
    }

    System.out.println("Question 10");
    // What is the result?
    // for (int i10 = 0; i10 < 10; i10--) {
    // System.out.println(i10);
    // }
    System.out.println("code prints an infinite negative loop");
    // PRINTS AN INFINITE LOOP 0, -1, -2, -3...


  } // END OF MAIN

} // END OF CLASS
