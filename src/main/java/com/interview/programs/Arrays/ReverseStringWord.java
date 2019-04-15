package com.interview.programs.Arrays;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseStringWord {
    public static void main(String[] args) {

        String str = "My name is don";

        String str1 = Pattern.compile(" +").splitAsStream(str)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(str1);

    }
}
