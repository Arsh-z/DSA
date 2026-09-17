public class array {

    static void reverseArray(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;


        while (i<=j){
            //swap
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        for( int k: arr){
            System.out.println(k);
        }


    }


    static void shiftBY1(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];

        for (int i =n-1; i>0 ; i--){
            arr[i]= arr[i-1];

        }
        arr[0]= temp;


        for(int k : arr){
            System.out.println(k + " ");
        }
        System.out.println();
    }






    /*static void shifyByK(int [] arr, int k) {

        int n = arr.length;


        for (int i = n-1; i>=k;i--){
            arr[i]=arr[i-k];

        }



    }
*/



    static void printAlternate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            if (i==j){
                System.out.println(arr[i]);
                return;
            }
            else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }

    }


    static void main() {
        int arr[] = {1,2,3,4,5};
        printAlternate(arr);





        /*shifyByK(arr,2);*/




        //shiftBY1(arr);







        //reverseArray(arr);

    }
}
