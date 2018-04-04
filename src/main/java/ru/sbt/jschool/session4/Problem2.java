package ru.sbt.jschool.session4;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem2.class.getResourceAsStream("/problem2.txt"));

        new Problem2().repl(sc.nextLine());
    }

    private void repl(String str) {
        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='T'){
                sb.setCharAt(i,'U');
            }
        }
        System.out.println(sb.toString());
    }
}
