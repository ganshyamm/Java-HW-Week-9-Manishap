package Calculate;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter which operation you want to do:");
        char c = sc.next().charAt(0);

        Calculator obj = new Calculator();
        obj.calculateResult(a, b, c);

        System.out.println("Would you like to do more calculation please enter 'Y 'or 'N':");
        char d = sc.next().charAt(0);
        while (d == 'y' || d == 'Y') {
            System.out.println("Enter the first number :");
            a = sc.nextInt();
            System.out.println("Enter Second number :");
            b = sc.nextInt();
            System.out.println("Enter which operation you want to do:");
            c = sc.next().charAt(0);
            Calculator obj1 = new Calculator();
            obj1.calculateResult(a, b, c);
            break;
        }
        sc.close();

    }}