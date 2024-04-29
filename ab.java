import java.util.Scanner;

public  class ab
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // array lena ho to
//        int n = sc.nextInt();
//        int [] array = new int[n];
//        for (int i = 0; i <n ; i++) {
//            array[i] = sc.nextInt();
//        }


        //100 200 500
        int wgt = sc.nextInt();
        int btkhra =0 ;

        int wtLeft = wgt;
        while (wtLeft!=0){

            if(wtLeft>500){
                wtLeft-=500;
                btkhra++;
            } else if (wtLeft >=200 && wtLeft<500) {
              wtLeft-=200;
              btkhra++;
            }
            else if (wtLeft >=100 && wtLeft<200) {
                wtLeft-=100;
                btkhra++;
            }



        }

        System.out.println(btkhra);

    }
}