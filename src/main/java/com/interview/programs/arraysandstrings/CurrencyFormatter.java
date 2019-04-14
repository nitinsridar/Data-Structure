package com.interview.programs.arraysandstrings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*Sample Input
12324.134

Sample Output
US: $12,324.13
India: ₹ 12,324.13
China: ￥12,324.13
France: 12 324,13 €*/


public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

         String us=null, india=null, china=null, france = null;


        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

        us = usFormat.format(payment);
        india = inFormat.format(payment);
        china = chFormat.format(payment);
        france = frFormat.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}