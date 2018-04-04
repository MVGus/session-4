package ru.sbt.jschool.session4;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/problem1.txt"));

        new Problem1().countDNA(sc.nextLine());
    }

    private void countDNA(String str) {

        long aCnt = 0;
        long cCnt = 0;
        long gCnt = 0;
        long tCnt = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case 'A': aCnt++; break;
                case 'C': cCnt++; break;
                case 'G': gCnt++; break;
                case 'T': tCnt++; break;
            }
        }

        System.out.println(aCnt + " " + cCnt + " " + gCnt + " " + tCnt);
    }
}
