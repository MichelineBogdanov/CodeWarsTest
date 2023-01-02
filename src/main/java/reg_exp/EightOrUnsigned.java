package reg_exp;
/*
Implement String#eight_bit_number?, which should return true if given object is a number representable
by 8 bit unsigned integer (0-255), false otherwise.
It should only accept numbers in canonical representation, so no leading +, extra 0s, spaces etc.
*/

public class EightOrUnsigned {

    public static void main(String[] args) {
        System.out.println(eightBitNumber(""));
        System.out.println(eightBitNumber("0"));
        System.out.println(eightBitNumber("00"));
        System.out.println(eightBitNumber("55"));
        System.out.println(eightBitNumber("042"));
        System.out.println(eightBitNumber("123"));
        System.out.println(eightBitNumber("255"));
        System.out.println(eightBitNumber("256"));
        System.out.println(eightBitNumber("999"));
        System.out.println(eightBitNumber("-1"));
        System.out.println(eightBitNumber("a1"));
        System.out.println(eightBitNumber("1e"));
    }

    public static boolean eightBitNumber(String n) {
        return n.matches("\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5]");
    }

}
