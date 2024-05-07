public class Day11 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int a = SearchElement(array,5);
        System.out.println(a);
    }

    public static int SearchElement(int [] array, int target){
        int l = array.length;
        for (int i = 0; i < l; i++) {

            if(array[i]==target){
               return array[i];
            }
        }
        return -1;
    }
}
