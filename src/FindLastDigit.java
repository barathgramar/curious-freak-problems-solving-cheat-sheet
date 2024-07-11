public class FindLastDigit {
    public static int getLastDigit(String a, String b) {
        // code here
        double power = Math.pow(Double.parseDouble(a), Double.parseDouble(b));
        long intValue = (long) power;
        String value =String.valueOf(intValue);
        String[] val = value.split("");
        return Integer.parseInt(val[val.length - 1]);
    }
}
