package ru.sbt.jschool.session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem7.class.getResourceAsStream("/problem7.txt"));

        new Problem7().repl(sc.nextLine());
    }

    private void repl(String str1) {
        mapCreate();
        double d = 0;
        for (int i = 0; i < str1.length(); i++) {
           d+= map.get(""+str1.charAt(i));
        }
        System.out.printf("%.3f",d);
    }

    Map<String,Double> map = new HashMap<>();

    public void mapCreate(){
        map.put("A",71.03711);
        map.put("C",103.00919);
        map.put("D",115.02694);
        map.put("E",129.04259);
        map.put("F",147.06841);
        map.put("G",57.02146);
        map.put("H",137.05891);
        map.put("I",113.08406);
        map.put("K",128.09496);
        map.put("L",113.08406);
        map.put("M",131.04049);
        map.put("N",114.04293);
        map.put("P",97.05276);
        map.put("Q",128.05858);
        map.put("R",156.10111);
        map.put("S",87.03203);
        map.put("T",101.04768);
        map.put("V",99.06841);
        map.put("W",186.07931);
        map.put("Y",163.06333);
    }
}
/*
A   71.03711
C   103.00919
D   115.02694
E   129.04259
F   147.06841
G   57.02146
H   137.05891
I   113.08406
K   128.09496
L   113.08406
M   131.04049
N   114.04293
P   97.05276
Q   128.05858
R   156.10111
S   87.03203
T   101.04768
V   99.06841
W   186.07931
Y   163.06333
 */