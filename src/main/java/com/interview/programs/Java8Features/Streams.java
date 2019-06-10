package com.interview.programs.Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
        String[] array = {"Geeks", "For", "Geeks"};

        Optional<String> combine = Arrays.stream(array).reduce((str1,str2)->str1+"-"+str2);

        if(combine.isPresent()){
            System.out.println(combine.get());
        }

        List<String> names = Arrays.asList("abc","Abc","zzzz");
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);


        Optional<Integer> sum = number.parallelStream().reduce((a,b)-> a+b);

        if(sum.isPresent()){
            System.out.println(sum);
        }

    }

    Comparator a = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    };

}
