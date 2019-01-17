import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
       
         String str1 = a.toLowerCase();
         String str2  = b.toLowerCase();
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
         return anagram;
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}