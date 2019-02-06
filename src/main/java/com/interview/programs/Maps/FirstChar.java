package com.interview.programs.Maps;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String s:strings) {
            if (!map.containsKey(s.substring(0,1))) {
               String d = s.substring(0,1);// first time we've seen this string
                map.put(s.substring(0,1), s);

            }
            else
            {
                String existing = map.get(s.substring(0,1));
                map.put(s.substring(0,1), existing+s);
            }

        }
        return map;
    }

    public static void main(String[] args) {

        FirstChar fc = new FirstChar();
        String[] s = {"Salt", "Soda", "tea", "toast"};
        fc.firstChar(s);

    }






}
