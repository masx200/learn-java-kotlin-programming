package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //输入：3 9 20 null null 15 7 !
        //输出：[[3],[9,20],[15,7]]
        Scanner cin = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        while (cin.hasNextLine()) {
            ArrayList<Integer> row = new ArrayList<>();
            String line = cin.nextLine();
            if (!line.isEmpty()) {
                String[] arrLine = line.split(" ");
                for (String s : arrLine) {
                    try {
                        row.add(Integer.parseInt(s));

                    } catch (Exception e) {

                        row.add(null);
                    }

                }
//                arr.add(row);
                new Solution().myFunc(row);
            }
        }

//        new Solution().myFunc(arr);
    }
}