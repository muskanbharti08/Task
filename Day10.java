public class Day10 {
    public static void main(String[] args) {
        //Given an integer array nums, return true if any value appears at least twice in the
        //array, and return false if every element is distinct
        int [] array = {1,2,3,5,4,1,3};
         boolean a = question(array);
        System.out.println(a);

    }

    public static boolean question(int [] ar){
        int l = ar.length-1;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; i < l; i++) {
                if(ar[i]==ar[j]){
                    return true;
                }

            }

        }


        return false;
    }
}
