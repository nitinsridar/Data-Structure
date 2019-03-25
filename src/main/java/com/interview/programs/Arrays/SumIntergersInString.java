package com.interview.programs.Arrays;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SumIntergersInString {

    public static void main(String[] args) {

        String line = "the 5is 108 seCONd4 a";
//        long sum = Arrays
//                .stream(line.split(" ")) // Convert to an array
//                .filter((input) -> input.matches("\\d+"))  // Only select the numbers
//                .mapToLong(Long::parseLong)  // Convert to Integers
//                .sum(); // Sum


        long sum1 = Pattern.compile("\\D+").splitAsStream(line)
                .filter(s -> !s.isEmpty())
                .mapToLong(Long::parseLong).sum();


        System.out.println(sum1);



    }


}
