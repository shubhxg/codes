import java.util.Scanner;

public class decimal_to_octal {
    public static void decimalToOctal(int decimalvalue){
        int remainder;
        remainder = decimalvalue%8;
        System.out.println(decimalvalue/8 + "" + remainder);
    }
  //driver code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimalValue = input.nextInt();
        decimalToOctal(decimalValue);
        input.close();
    }
}
