import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================Special Calculator===============");
        System.out.println("press N for Normal mode");
        System.out.println("press O for Opposite mode");

        char mode = sc.nextLine().charAt(0);

      Calculator.setMode(mode);
      char SelectedMode = Calculator.getMode();

        switch(SelectedMode)
        {
            case 'O': case 'o':

                CalculatorOppositeMode operation = new CalculatorOppositeMode();
                System.out.println("Subtraction of given two numbers is : " + operation.add(90,40));
                System.out.println("Subtraction of given three numbers is : " + operation.add(100,60,30));
                System.out.println("Addition of given two numbers is : " + operation.sub(90,40));
                System.out.println("Addition of given three numbers is : " + operation.sub(100,60,30));
                break;

            case 'N': case 'n':

            CalculatorNormalMode op = new CalculatorNormalMode();
            System.out.println("Addition of given two numbers is : " + op.add(150,90));
            System.out.println("Addition of given three numbers is : " + op.add(150,90,30));
            System.out.println("Subtraction of given two numbers is : " + op.sub(90,40));
            System.out.println("Subtraction of given three numbers is : " + op.sub(100,60,30));
            break;

            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
