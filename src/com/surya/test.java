package com.surya;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by skuchibh on 8/7/2017.
 */
public class test {
    public static void main(String[] args) {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        long[] arr = {1,3,3,6,6,6,7}; //
        long length=0;
        HashMap<Long, Integer> map = new HashMap<>();
        Set<Long> set = new HashSet<>();
        for (long x : arr) {
            length++;
            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else {
                map.replace(x, map.get(x) + 1);
            }
            set.add(x);
        }
        boolean flag = true;
        while (length!=0) {

            if (!flag) {
                out.println("NO");
                out.close();
                break;
            }
            if (set.contains(length)) {
                set.remove(length);
                length-= map.get(length);
                
            } else {
                flag=false;
            }

        }

        out.println("YES");
        out.close();
    }
}
