public class Day1 {
    public static void main(String[] args) {
        int array [] = {12,1,3,4,5,3,5,9,7,4};

        int max = FindMaximumElement(array);
        System.out.println("The maximum element of an array is "+max);

        int min = FindMinimumElement(array);
        System.out.println("The minimum element of an array is "+min);


        ReverseArray(array);
        print(array);



        System.out.println("\n");
        System.out.println("The odd element of an array ");
        removeEven(array);


        System.out.println("\n \n The even element of an array ");
        removeOdd(array);

    }
    //Find Maximum Element from an array
    public static int  FindMaximumElement(int [] ar){
        int max = ar[0];
        int l = ar.length;
        for (int i = 0; i < l; i++) {
            if(ar[i]>max){
                max =ar[i];
            }

        }
        return max;

    }





    // Find Minimum Element from an array
    public static int FindMinimumElement(int [] ar){
        int minimum = ar[0];
        int l = ar.length;
        for (int i = 0; i < l; i++) {
            if(ar[i]<minimum){
                minimum = ar[i];
            }

        }
        return minimum;
    }



//    Reverse an array
    public static void ReverseArray(int [] ar){
        int l = ar.length;
        int start = 0;
        int end = l-1;

        while (start<end){
            int temp =ar[start];
            ar[start] = ar[end];
           ar[end] = temp;
            start++;
            end--;

        }
    }



//   RemoveEven element from an array
    public static void removeEven(int [] ar){
        int l = ar.length;

        for (int i = 0; i < l; i++) {
            if(ar[i]%2!=0)
            {
                System.out.print(ar[i]+"  ");
            }
        }
    }


// Remove oddElement from an array
public static void removeOdd(int [] ar){
        int l = ar.length;
    for (int i = 0; i < l; i++) {{
        if(ar[i]%2==0){
            System.out.print(ar[i]+" ");
        }
    }

    }
}


//    For Print
    public static void print(int [] p){
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i]+" ");

        }
    }





}
