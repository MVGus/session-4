package ru.sbt.jschool.session4;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem4.class.getResourceAsStream("/problem4.txt"));

        new Problem4().repl(sc.nextLine(),sc.nextLine());
    }

    private void repl(String str1,String str2) {

        int count = 0;
        int len = str1.length() <= str2.length() ? str1.length() : str2.length();

        for (int i = 0; i < len; i++) {
            if(str1.charAt(i)!=str2.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
