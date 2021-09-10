import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runHourglassSum();
        //runPlusMinus();
        //runStaircase();
        //runMiniMaxSum();
        runBirthdayCakeCandles();
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

}
