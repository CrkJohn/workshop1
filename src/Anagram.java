import java.io.*;
import java.util.*;



public class Anagram {


    public static void main(String[] args)throws  Exception{
         BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
         String str1 = br.readLine().trim().toLowerCase();
         String str2  = br.readLine().trim().toLowerCase();
         int frec [] = new int[27];
         int frec2 [] = new int[27];
         for (int i = 0 ; i<str1.length();i++){
        	  frec[(int)str1.charAt(i)-97]++;
         }
         for (int i = 0 ; i<str2.length();i++){
             frec2[(int)str2.charAt(i)-97]++;
         }
         boolean anagram = true;
         for(int i = 0 ;i<26;i++){
             if (frec[i] != frec2[i]) {
                 anagram = false;
             }

         }
         System.out.println((anagram) ? "Anagrams" : "Not Anagrams");

    }



}
