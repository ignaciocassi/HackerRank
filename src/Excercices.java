import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.*;
import java.util.List;
import java.util.Locale;

public class Excercices {
    public static void JavaCurrencyFormatter() {

        Scanner sc = new Scanner(System.in);
        Double payment = sc.nextDouble();
        sc.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String usFormatted = us.format(payment);
        String inFormatted = in.format(payment);
        String chFormatted = ch.format(payment);
        String frFormatted = fr.format(payment);

        System.out.println("US: "+usFormatted);
        System.out.println("India: "+inFormatted);
        System.out.println("China: " + chFormatted);
        System.out.println("France: " + frFormatted);
    }

    public static void JavaStringTokens() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if (s.length()<=400000 && s.length()>0) {
            String[] arrOfStr = s.split("[!,?._'@\\s]+");
            int amount = arrOfStr.length;
            System.out.println(amount);
            for (String Str : arrOfStr) {
                System.out.println(Str);
            }
        } else {
            System.out.println(s.length());
        }
    }

    public static void JavaRegex() {
        class pattern {
            String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
            String pattern = zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255;
        }
    }

    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int currentHeight = 0;
        boolean inValley = false;
        for (int stepNumber=0; stepNumber<steps; stepNumber++) {
            Character stepDirection = path.charAt(stepNumber);
            if (stepDirection.charValue()=='D' && currentHeight==0) {
                currentHeight--;
                inValley = true;
            } else if (stepDirection.charValue()=='D') currentHeight--;
            if (stepDirection.charValue()=='U' && currentHeight==-1) {
                currentHeight++;
                inValley = false;
                valleys++;
            } else if (stepDirection.charValue()=='U') currentHeight++;
        }
        return valleys;
    }

    public static int countingValleysv2(int steps, String path) {
        int valleys = 0;
        int currentHeight = 0;
        char[] paths = path.toCharArray();
        for (char direction : paths) {
            if (direction=='D') currentHeight--;
            if (direction=='U') currentHeight++;
            if (currentHeight==0 && direction=='U') valleys++;
        }
        return valleys;
    }

    public static Integer jumpingOnClouds(List<Integer> c) {
        Integer totalJumps = 0;
        Integer jump = 0;
        while (jump!=c.size()-1) {
            if (jump+2 <= c.size()-1) {
                if (c.get(jump+2)==0) {
                    jump = jump+2;
                } else {
                    jump = jump+1;
                }
                totalJumps++;
            } else {
                jump = jump+1;
                totalJumps++;
            }
        }
        return totalJumps;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>();
        scores.add(0);
        scores.add(0);
        for (int i=0; i<=a.size()-1; i++) {
            if (a.get(i)>b.get(i)) {
                scores.set(0,scores.get(0)+1);
            } else if (a.get(i)<b.get(i)) {
                scores.set(1,scores.get(1)+1);
            }
        }
        return scores;
    }

    public static List<Integer> reverseArray(List<Integer> array) {
        List <Integer> reversedArray = new ArrayList<>();
        for (int i = array.size()-1; i>=0; i--) {
            reversedArray.add(array.get(i));
        }
        return reversedArray;
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int largestHourglass = Integer.MIN_VALUE;
        for (int i=0; i<=3; i++) {
            for (int j=0; j<=3; j++) {
                int f = i;
                int c = j;
                int currentHourglass = 0;
                while (c<=j+2) {
                    currentHourglass = currentHourglass + arr.get(f).get(c);
                    c++;
                }
                c=c-2;
                f++;
                currentHourglass = currentHourglass + arr.get(f).get(c);
                c--;
                f++;
                while (c<=j+2) {
                    currentHourglass = currentHourglass + arr.get(f).get(c);
                    c++;
                }
                if (currentHourglass>largestHourglass) {
                    largestHourglass=currentHourglass;
                }
            }
        }
        return largestHourglass;
    }

    public static void plusMinus(List<Integer> arr) {
        float totalPositives=0, totalNegatives=0, totalZeros=0;
        float total = arr.size();

        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            if (item.intValue()>0) totalPositives++;
            if (item.intValue()<0) totalNegatives++;
            if (item.intValue()==0) totalZeros++;
        }

        System.out.println(String.format("%.6f", totalNegatives/total)+"\n"+String.format("%.6f",totalPositives/total)+"\n"+String.format("%.6f", totalZeros/total));
    }

    public static void staircase(int n) {
        char[] steps = new char[n];
        for (int step=n-1; step>=0; step--) {
            steps[step]=' ';
        }
        for (int step=n-1; step>=0; step--) {
            steps[step]='#';
            System.out.println(steps);
        }
    }

    public static MiniMax getMiniMaxSum(int[] arr) {
        System.out.println("The source array of numbers is: "+Arrays.toString(arr));
        MiniMax result = new MiniMax();
        for (int jump=arr.length-1; jump>=0; jump--) {
            int sum=0;
            for (int i=0; i<=arr.length-1; i++) {
                if (i!=jump) sum=sum+arr[i];
            }
            if (sum<result.getMini()) {
                result.setMini(sum);
            }
            if (sum>result.getMax()) {
                result.setMax(sum);
            }
        }
        return result;
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallestAmount = 0;
        int tallest = Collections.max(candles);
        for (Integer candle: candles) if (candle.equals(tallest)) tallestAmount++;
        return tallestAmount;
    }

    public static long repeatedString(String s, long n) {
        Long sLength = Long.valueOf(s.length());
        char[] chars = s.toCharArray();
        Long totalAs = 0L;
        Long sTotalA = 0L;
        for (char charact: chars) {
            if (charact=='a') sTotalA++;
        }
        Long timesEnters = n/sLength;
        Long rest = n%sLength;
        long aEnResto;
        if (rest!=0) {
            aEnResto = calcularAEnResto(rest, chars);
        } else {
            aEnResto=0;
        }
        totalAs = (sTotalA*timesEnters)+aEnResto;
        return totalAs;
    }

    private static long calcularAEnResto(long r, char[] chars) {
        long restAs = 0;
        for (int i=0; i<r; i++) {
            if (chars[i]=='a') restAs++;
        }
        return restAs;
    }


	
    /** 
     * @param word: The String to be tested if is a palindrome.
     * @return Boolean: True if word is palindrome, False if word is not palindrome, null if word is invalid length (0-50).
     */
    public static Boolean isWordPalindrome(String word) {
        Boolean isPalindrome = true;
        if (word.length()>0 && word.length()<=50) {
            char[] characters = word.toCharArray();
            int half = characters.length/2;
            int last = characters.length-1;
            for (int first=0; first<half; first++) {
                if (characters[first]!=characters[last]) {
                    isPalindrome = false;
                    break;
                }
                last--;
            }
        } else {
            System.out.println("Word length must be between 0-50.");
            isPalindrome = null;
        }
		return isPalindrome;
	}

	public static void bigIntegers(BigInteger a, BigInteger b) {
        BigInteger multiplication = a.multiply(b);
        BigInteger addition = a.add(b);
        System.out.println(addition);
        System.out.println(multiplication);
	}

    public static void bigDecimal(String[] s, int n) {
        for(int i=1; i<n ; i++){
            for(int j=i; j>=1; j--){

                if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1]))>0){   
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                    
                }else{
                    break;
                }
            }  
        }
    }

    public static String timeConversionv2(String s) {
        //"12:00:00AM"-> "00:00:00"
        //"01:00:00AM"-> "01:00:00"
        //"12:00:00PM"-> "12:00:00"
        //"01:00:00PM"-> "13:00:00"
        String hourStr = s.substring(0,2);
        String restStr = s.substring(2);
        String period = s.substring(8);
        String output = "";
        int hour = Integer.valueOf(hourStr);
        if (hourStr.equals("12") && period.equals("AM")) {
            //Substract 12 from hourStr
            //Remove period from output
            //Format hrs from "0" to "00"
            hour -= 12;
            hourStr = "0"+Integer.toString(hour);
            output = hourStr+restStr.replace("AM", "");
        } else if (!hourStr.equals("12") && period.equals("AM")) {
            //Remove "AM"
            output = s.replace("AM","");
        } else if (hourStr.equals("12") && period.equals("PM")) {
            //Remove "PM"
            output = s.replace("PM","");
        } else if (!hourStr.equals("12") && period.equals("PM")) {
            //Add 12 to hour
            //Remove "PM"
            hour += 12;
            hourStr = Integer.toString(hour);
            output = hourStr + restStr.replace("PM", "");
        } else {
            System.out.println("Invalid time");
        }
        return output;
    }
















    public static String timeConversion(String s) {
        String output = "";
        if (isAfternoon(s)) {
            output = PMto24format(s);
        } else {
            output = AMto24format(s);
        }
        return output;
    }
    
    public static boolean isAfternoon(String s) {
        boolean isAfternoon = false;
        String data = s.substring(8);
        if (data.equals("AM")) isAfternoon = false;
        if (data.equals("PM")) isAfternoon = true;
        return isAfternoon;
    }
    
    public static String PMto24format(String s) {
        String hourString = s.substring(0,2);
        String restString = s.substring(2);
        restString = restString.replace("PM","");
        int hour = Integer.valueOf(hourString);
        if (hour!=12) hour = hour+12;
        return Integer.toString(hour)+restString;
    }
    
    public static String AMto24format(String s) {
        String hourString = s.substring(0,2);
        String restString = s.substring(2);
        restString = restString.replace("AM","");
        int hour = Integer.valueOf(hourString);
        if (hour>=12) hour = hour - 12;
        hourString = Integer.toString(hour);
        if (Integer.valueOf(hourString)<12) hourString = "0"+hourString;
        return hourString+restString;
    }

}

