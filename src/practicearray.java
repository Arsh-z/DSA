public class practicearray {

    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;

    }


    static int[] MultiplyBy10(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;

    }


    static boolean findTarget(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }


  static int MaxNo(int arr[]){
        int max=arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;

  }



    static void main() {
        int arr[] = {1,3,5,7,4};
        System.out.println(MaxNo(arr));






        /*boolean ans = findTarget(arr,70);
        System.out.println(ans);*/






        /*int arr[] = {1, 2, 3, 4};
        int ans[] = MultiplyBy10(arr);
        System.out.println("print array multipluy  by 10: ");
        for (int i : ans) {
            System.out.println(i);
        }*/

        /*int[] arr = {2, 3,7,1};
        System.out.println( getAverage(arr));

        */

    }

}


