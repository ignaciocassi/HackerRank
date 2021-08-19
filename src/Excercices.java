import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

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
}
