public class Calculator implements Calculate {
    public static void main(String[] args) {
        Calculate calculator = new Calculator();
        System.out.println(calculator.doCalculation(4,1));
    }
}
