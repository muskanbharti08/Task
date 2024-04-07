
//Palidrome

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean b = ChechPalindrome(s);
        System.out.println(b+" is not a palindrome");

    }


    public static boolean ChechPalindrome(String s ){
        char [] charArray = s.toCharArray();
        int l = charArray.length;
        int start =0;
        int end = l-1;

        while (start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }


}
