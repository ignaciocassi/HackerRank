import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runHourglassSum();
        //runPlusMinus();
        //runStaircase();
        //runMiniMaxSum();
        //runBirthdayCakeCandles();
        //runRepeatedString();
        //runIsWordPalindrome();
        //runBigIntegers();
        //runBigDecimal();
        //runTimeConversion();
        runTimeConversionv2();
    }

    public static void runTimeConversionv2() {
        //"12:00:00AM"-> "00:00:00"
        //"01:00:00AM"-> "01:00:00"
        //"12:00:00PM"-> "12:00:00"
        //"01:00:00PM"-> "13:00:00"
        //System.out.println(Excercices.timeConversionv2("12:00:00AM"));
        //System.out.println(Excercices.timeConversionv2("01:00:00AM"));
        //System.out.println(Excercices.timeConversionv2("12:00:00PM"));
        //System.out.println(Excercices.timeConversionv2("02:00:00PM"));
    }

    private static void runTimeConversion() {
        String s = "12:45:54PM";
        System.out.println(Excercices.timeConversion(s));
    }

    private static void runStaircase() {
        Excercices.staircase(4);
    }

    public static void runHourglassSum() {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i=0; i<=5; i++) {
            arr.add(new ArrayList<Integer>());
        }
        for (int i=0; i<=5; i++) {
            for (int j=0; j<=5; j++) {
                arr.get(i).add(1);
            }
        }
        System.out.println(arr);
        System.out.println(Excercices.hourglassSum(arr));
    }

    public static void runPlusMinus() {
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        Excercices.plusMinus(arr);
    }

    public static void runMiniMaxSum() {
        int[] arr = {1,3,5,7,9};
        MiniMax result = Excercices.getMiniMaxSum(arr);
        System.out.println("The minimum Sum is: "+result.getMini()+"\nThe maximum sum is: "+result.getMax()+".");
    }

    public static void runBirthdayCakeCandles() {
        List<Integer> candles = new ArrayList<>();
        candles=Arrays.asList(1,2,5,4,5);
        System.out.println(Excercices.birthdayCakeCandles(candles));
    }

    public static void runRepeatedString() {
        System.out.println(Excercices.repeatedString("aba", 10));
    }

    public static void runIsWordPalindrome() {
        String word = "abcba";
        System.out.println(Excercices.isWordPalindrome(word));
    }

    public static void runBigIntegers() {
        BigInteger a = new BigInteger("1234");
        BigInteger b = new BigInteger("20");
        Excercices.bigIntegers(a,b);
    }

    public static void runBigDecimal() {
        int n = 9;
        String[] s = {"-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
        Excercices.bigDecimal(s,n);
        showArray(s);
    }

    private static void showArray(String[] s) {
        for (String data: s) System.out.println(data);
    }

}
