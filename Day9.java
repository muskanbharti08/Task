// Question 1 : Count how many times lowercase vowels and consonants occurred in a String entered by the user

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] ch = s.toCharArray();
        int countVow =0;
        int countCons=0;

        for (int i = 0; i < ch.length ; i++) {
           if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i] == 'u'){
               countVow++;
           }
           else {
               countCons++;
           }
        }
        System.out.println("The word  "+ s + "is conttainng  "+countVow+ "  vowels and "+countCons+ " consonants");
    }
}