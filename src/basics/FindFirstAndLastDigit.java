package basics;

//12-July-2024
public class FindFirstAndLastDigit {
    static char getLastDigit(String a, String b) {
        double power = Math.pow(Double.parseDouble(a), Double.parseDouble(b));//power the given string numbers
        String intValue = String.valueOf((long) power);// convert the double value to long then convert to string
        return intValue.charAt(intValue.length() - 1);//find last digit of the value You can call the last digit by string operation function here.
    }

    static long firstDigitWithLoop(long n) {
        while (n > 10)//get un till only one digit
            n /= 10;//divided by 10
        return n;//rerun the remaining one digit
    }

    static long firstDigitWithoutLoop(long n) {
        long digits = (long) Math.log10(n);//get digits of the number length -1
        n = (long) (n / Math.pow(10, digits));//get the first digit
        return n;
    }

    static long firstDigitByStringOperation(long n) {
        String value = Long.toString(n);//convert the number to string
        return value.charAt(0) - '0';//get first index of the number
    }

    static long lastDigit(long n) {
        n = n % 10;//number divided by 10 basic method
        return n;//return remaining
    }

    static long lastDigitByStringOperation(long n) {
        String value = Long.toString(n);//convert long to string
        return value.charAt(value.length() - 1) - '0';//return last index of the string
    }

    public static void main(String args[]) {
        System.out.println(getLastDigit("735", "2"));
        System.out.println(firstDigitWithLoop(97324124122433232L));
        System.out.println(firstDigitByStringOperation(97324124122433232L));
        System.out.println(firstDigitWithoutLoop(97324124122433232L));
        System.out.println(lastDigit(412418757586559752L));
        System.out.println(lastDigitByStringOperation(412418757586559752L));
    }
}
