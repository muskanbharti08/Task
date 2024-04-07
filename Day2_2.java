public class Day2_2 {
    public static void main(String[] args) {
        int [] Array = {3,2,5,67,2,1,2,3,8,9,12};

        InsetationSort(Array);
        Print(Array);
        System.out.println("\n");
        BubbleSort(Array);
        Print(Array);
    }

//    Insertation Sort
    public static void InsetationSort(int [] ar){
        int l = ar.length;
        for (int i = 0; i < l; i++) {
            int temp = ar[i];
            int j = i-1;
            while(j>=0  && temp<ar[j] ){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1]  = temp;
        }
    }



    public static void Print (int [] Print){
        for (int i = 0; i < Print.length; i++) {
            System.out.print(Print[i]+" ");
        }
    }


//    Bubble  Sort
    public static void BubbleSort (int ar []){
        int l = ar.length;
        for (int i = 0; i < (l-1); i++) {
            int swap =0;
            for (int j = 0; j < (l-1)-i; j++) {
              if(ar[j]>ar[j+1]){
                  int temp = ar[j+1];
                  ar[j+1] =  ar[j];
                  ar[j] = temp;
                }
            }
            if(swap ==0){
                break;
            }

        }
    }



}