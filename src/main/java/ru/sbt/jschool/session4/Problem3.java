package ru.sbt.jschool.session4;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem3.class.getResourceAsStream("/problem3.txt"));

        new Problem3().repl(sc.nextLine());
    }

    private void repl(String str) {
        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            switch (sb.charAt(i)){
                case 'G': sb.setCharAt(i,'C'); break;
                case 'T': sb.setCharAt(i,'A'); break;
                case 'C' : sb.setCharAt(i,'G'); break;
                case 'A' : sb.setCharAt(i,'T'); break;
            }
        }
        System.out.println(sb.toString());
    }
}

 //"GTCA" is "TGAC").
