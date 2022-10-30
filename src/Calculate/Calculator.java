package Calculate;

public class Calculator {


    public void addition(int a, int b) {
        int result = a + b;
        System.out.println(result);

    }

    public void substraction(int a, int b) {
        int result = a - b;
        System.out.println(result);

    }
    public void multiplication(int a, int b){
        int result = a*b;
        System.out.println(result);

    }
    public void division( int a, int b){
        int result = a/b;
        System.out.println(result);

    }
    public void calculateResult(int a, int b, char c) {
        switch (c) {
            case '+':
                addition(a, b);
                break;
            case '-':
                substraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
        }
    }

}
