public class CalculatorOp {
    private double firstNum;
    private double secondNum;
    private String rawS;

    public CalculatorOp() {
        firstNum = 0;
        secondNum = 0;
        total = 0;
        rawS = "";
    }
    private String determineOp(String s) {
        rawS = s;
        String[] sArr = s.split("\\d");
        String opp = "";
        int i = 0;
        for (String a: sArr) {
            sArr[i] = a.trim(); //trim removes whitespace before and after the character
            if (sArr[i] != "" || sArr[i] != " ") {
                opp = sArr[i];
            }
            i++;
        }
        if (opp.equals("+")) {
            opp = "add";
        }
        else if (opp.equals("-")) {
            opp = "minus";
        }
        else if (opp.equals("*")) {
            opp = "multiply";
        }
        else {
            opp = "divide";
        }
        return opp;
    }
    private void getNums() {
        String replaced = rawS.replaceAll("\\s", ""); //removes all the whitespaces in the String so we can extract the numbers
        String[] num = replaced.split("\\W"); // we then remove the operation
        firstNum = Double.parseDouble(num[0]);
        secondNum = Double.parseDouble(num[1]);
    }
    
    public double handleOperation(String raw) {
        String op = determineOp(raw);
        getNums();
        if (op.equals("add")) {
            return firstNum + secondNum;
        }
        if (op.equals("minus")) {
            return firstNum - secondNum;
        }
        if (op.equals("multiply")) {
            return firstNum * secondNum;
        }
        else  {
            return firstNum / secondNum;
        }
    }
    public void returnSummary() {
        
        System.out.println("First Number : " + firstNum);
        System.out.println("Second Number : " + secondNum);
    }
    
}