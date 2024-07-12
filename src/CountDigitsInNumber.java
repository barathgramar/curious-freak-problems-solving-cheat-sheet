public class CountDigitsInNumber {
    static int countNumberThroughLoop(Long number) {
        String length = String.valueOf(number);
        return length.length();
    }

    public static void main(String args[]) {
        System.out.println(countNumberThroughLoop(213412123123L));
    }
}
