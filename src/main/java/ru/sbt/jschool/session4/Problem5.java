package ru.sbt.jschool.session4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(Problem5.class.getResourceAsStream("/problem5.txt"));


        new Problem5().repl(sc.nextLine());
    }

    Map<String,String> map = new HashMap<>();

    private void repl(String str) {
        String newStr = "";
        putMap();
        for (int i = 0; i < str.length(); i=i+3) {
            String s =map.get(""+str.charAt(i)+str.charAt(i+1)+str.charAt(i+2));
            if(s.equals("Stop")) break;
            newStr+=s;
        }
        System.out.println(newStr);

    }

    private void putMap(){
        map.put("UUU","F");map.put("CUU","L");map.put("AUU","I");map.put("GUU","V");
        map.put("UUC","F");map.put("CUC","L");map.put("AUC","I");map.put("GUC","V");
        map.put("UUA","L");map.put("CUA","L");map.put("AUA","I");map.put("GUA","V");
        map.put("UUG","L");map.put("CUG","L");map.put("AUG","M");map.put("GUG","V");
        map.put("UCU","S");map.put("CCU","P");map.put("ACU","T");map.put("GCU","A");
        map.put("UCC","S");map.put("CCC","P");map.put("ACC","T");map.put("GCC","A");
        map.put("UCA","S");map.put("CCA","P");map.put("ACA","T");map.put("GCA","A");
        map.put("UCG","S");map.put("CCG","P");map.put("ACG","T");map.put("GCG","A");
        map.put("UAU","Y");map.put("CAU","H");map.put("AAU","N");map.put("GAU","D");
        map.put("UAC","Y");map.put("CAC","H");map.put("AAC","N");map.put("GAC","D");
        map.put("UAA","Stop");map.put("CAA","Q");map.put("AAA","K");map.put("GAA","E");
        map.put("UAG","Stop");map.put("CAG","Q");map.put("AAG","K");map.put("GAG","E");
        map.put("UGU","C");map.put("CGU","R");map.put("AGU","S");map.put("GGU","G");
        map.put("UGC","C");map.put("CGC","R");map.put("AGC","S");map.put("GGC","G");
        map.put("UGA","Stop");map.put("CGA","R");map.put("AGA","R");map.put("GGA","G");
        map.put("UGG","W");map.put("CGG","R");map.put("AGG","R");map.put("GGG","G");
    }


}
/*
UUU F      CUU L      AUU I      GUU V
UUC F      CUC L      AUC I      GUC V
UUA L      CUA L      AUA I      GUA V
UUG L      CUG L      AUG M      GUG V
UCU S      CCU P      ACU T      GCU A
UCC S      CCC P      ACC T      GCC A
UCA S      CCA P      ACA T      GCA A
UCG S      CCG P      ACG T      GCG A
UAU Y      CAU H      AAU N      GAU D
UAC Y      CAC H      AAC N      GAC D
UAA Stop   CAA Q      AAA K      GAA E
UAG Stop   CAG Q      AAG K      GAG E
UGU C      CGU R      AGU S      GGU G
UGC C      CGC R      AGC S      GGC G
UGA Stop   CGA R      AGA R      GGA G
UGG W      CGG R      AGG R      GGG G
*/