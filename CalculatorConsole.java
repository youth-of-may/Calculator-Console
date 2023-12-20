import java.util.Scanner;
public class CalculatorConsole {
   /*
   The calculator should be able to read in inputs. For instance, 1+1 or 1 + 1 and perform operations base on that
   */

  public static void main(String[] args) {
    String calculateAgain = "Y";
    Scanner in = new Scanner (System.in);
    String rawString  = "";
    CalculatorOp calculate = new CalculatorOp();
    while (calculateAgain.equals("Y")) 
    {
    System.out.print("Equation: ");
    rawString = in.nextLine();
    System.out.println("Answer is: " + calculate.handleOperation(rawString));
    calculate.returnSummary();
    System.out.print("Do you want to calculate again? Y/N    ");
    calculateAgain = in.nextLine().toUpperCase();
    }
  }

}