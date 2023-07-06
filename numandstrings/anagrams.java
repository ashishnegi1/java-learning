package numandstrings;

import java.util.ArrayList;
import java.util.Collections;

public class anagrams {
    private static boolean isAnagram(String a, String b) {

        ArrayList<Character> arra = new ArrayList<Character>();
        ArrayList<Character> arrb = new ArrayList<Character>();

        String newa = a.toLowerCase();
        String newb = b.toLowerCase();

        for(int i=0; i<a.length(); i++){
            if(Character.isLetter(a.charAt(i))){
                arra.add(newa.charAt(i));
            }
        }

        for(int i=0; i<b.length(); i++){
            if(Character.isLetter(b.charAt(i))){
                arrb.add(newb.charAt(i));
            }
        }

        if(arra.size() != arrb.size()) return false;

        Collections.sort(arra);
        Collections.sort(arrb);

        if( arra.equals(arrb) ) return true;

        return false;
    }

    public static void main(String[] args) {
        String a = "Parliament";
        String b = "partial men";
        if(isAnagram(a, b)){
            System.out.println(a + " and " + b + " are anagrams.");
        } else {
            System.out.println(a + " and " + b + " are not anagrams.");
        }

        return;
    }
}
