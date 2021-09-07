import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runHourglassSum();
        //runPlusMinus();
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
}
