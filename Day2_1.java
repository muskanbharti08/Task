
//Find the missing number from given array

public class Day2_1 {
    public static void main(String[] args) {
        int Array [] = {1,3,4,5,6,2,8};
       int number =  FindMissingNumber(Array);
        System.out.println(number + "  is the missing number of an array");

    }

    public static int  FindMissingNumber(int [] array){
        int n = array.length+1;
        int totalSum = n*(n+1)/2;
        for (int i = 0; i < n-1; i++) {
            totalSum-=array[i];

        }
        return totalSum;
    }

}
