package ru.sbt.jschool.session4;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem6.class.getResourceAsStream("/problem6.txt"));

        new Problem6().repl(sc.nextLine(),sc.nextLine());
    }

    private void repl(String str1,String str2) {

        ArrayList<Integer> list = new ArrayList<>();
        int ind = 0;
        while(true){
            String s = str1.substring(ind);
            int a = s.indexOf(str2);
            if(a==-1) break;
            ind+=a+1;
            list.add(ind);
        }

        for (int a : list){
            System.out.print(a+" ");
        }
    }
}
