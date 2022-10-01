// program to find number of digits of a number.
class BitMan {
    public static void main(String[] args) {

        // counting number of bits in a binary number.
        int digits = (int)Math.ceil(Math.log(4) + 1);
        System.out.println(digits);

        // counting number of digits of a decimal number.
        int dig = 144152;
        int digitsOfDecimalNumber = (int)Math.log10(dig)+1;
        System.out.println(digitsOfDecimalNumber);
    }
}
