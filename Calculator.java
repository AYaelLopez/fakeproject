import java.util.Scanner;

public class Calculator {

    public static int sum (int x, int y){
        int result = x +y;
        return result;
    }

    public static int subs (int x, int y){
        int result = x - y;
        return result;
    }

    public static float div (int x, int y){
        float result = (float)x / y;
        return result;
    }

    public static int mul (int x, int y){
        int result = x * y;
        return result;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Operations: -, +, *, /");
        System.out.print("Insert operation: ");

        String op = sc.nextLine();
        int x;
        int y;
        System.out.print("Fist number: ");
        x = sc.nextInt();
        System.out.print("Second number: ");
        y = sc.nextInt();

        switch (op) {
            case "-":
                System.out.println("Result: " + subs(x, y));
                break;
        
            case "+":
                System.out.println("Result: " + sum(x, y));
                break;  

            case "*":
                System.out.println("Result: " + mul(x, y));              
                break;

            case "/":
                System.out.println("Result: " + div(x, y));
                break;
            default:
                break;
        }
        
    }
}