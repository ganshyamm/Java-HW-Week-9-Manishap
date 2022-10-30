package Homework_week_8;

import java.util.Scanner;

public class P2_StudentMarkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Name :");
        String name = sc.next();
        System.out.println("Enter Student Roll Number :");
        int rollNum = sc.nextInt();

        System.out.println("Enter Marks of Subject Maths :");
        int mathMarks = sc.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invali input, Marks should between 0 to 100 :");
            System.out.println("Please enter correct marks :");
            mathMarks = sc.nextInt();

        }
        System.out.print("Enter Marks of Subject Science :");
        int scienceMarks = sc.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks :");
            scienceMarks = sc.nextInt();
        }
        System.out.print("Enter Marks of Subject English :");
        int englishMarks = sc.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.print(" Invalid input, Marks should between 0 to 100");
            System.out.print(" Please enter correct marks :");
            englishMarks = sc.nextInt();
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);

    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //caculating the result on subject marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
      while(result !=null)  {
          if (result.equalsIgnoreCase("pass")) {
              if (percentage >= 80) {
                  grade = "A+";
              } else if (percentage >= 60) {
                  grade = "A";
              } else if (percentage >= 50) {
                  grade = "B";
              } else if (percentage >= 35) {
                  grade = "C";
              }
          } else {
              grade = "-";
          }break;
      }

        return grade;
    }

    // print marksheet
    public static void printTheMarkSheet(String name, int rollNum, int mathmarks, int scienceMarks, int englishMarks,
                                         double total, double percentage, String result, String grade) {

        System.out.println("--------------------------------------");
        System.out.println("|                                    |");
        System.out.println("|            Mark Sheet              |");
        System.out.println("|_____________________________________|");
        System.out.println("|       Name    :" + name + "          |");
        System.out.println("|       RollNo  : " + rollNum + "      |");
        System.out.println("|-------------------------------------|");
        System.out.println("|       Subject : Marks               |");
        System.out.println("|-------------------------------------|");
        System.out.println("|       Maths    :" + mathmarks + "   |");
        System.out.println("|       Science  :" + scienceMarks + "|");
        System.out.println("|       English  :" + englishMarks + "|");
        System.out.println("|-------------------------------------|");
        System.out.println("|      Total     :" + total + "       |");
        System.out.println("|-------------------------------------|");
        System.out.println("|     percentage :" + percentage + "  |");
        System.out.println("|     Result     :" + result + "       |");
        System.out.println("|     Grade      :" + grade + "       |");
        System.out.println("|______________________________________");


    }
}



