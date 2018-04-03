package ru.sbt.jschool.session4;

import java.util.Scanner;

/**
 * @author NIzhikov
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/problem1.txt"));

        new Problem1().countDNA(sc.nextLine());
    }

    private void countDNA(String str) {
        long aCnt = str.chars().mapToObj(c -> (char)c).filter(c -> c == 'A').count();
        long cCnt = str.chars().mapToObj(c -> (char)c).filter(c -> c == 'C').count();
        long gCnt = str.chars().mapToObj(c -> (char)c).filter(c -> c == 'G').count();
        long tCnt = str.chars().mapToObj(c -> (char)c).filter(c -> c == 'T').count();

        System.out.println(aCnt + " " + cCnt + " " + gCnt + " " + tCnt);
    }
}
