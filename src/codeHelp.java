public class codeHelp {


    static int[] sortArray(int  arr[]){

        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i<=j){
            if (arr[i]==1&&arr[j]==0){
                //swap
                arr[i]=0;
                arr[j]=1;

            }
            if (arr[i]==0){
                i++;
            }
            if (arr[j]==1){
                j--;
            }
        }
        return arr;


    }

    static int[] pointer(int arr[]){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(arr[mid]==0){
                //swap or put value into low value
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            }

            else if(arr[mid]==1){
                //increment krdo mid ko
                mid++;
            }


            else {//means mid ==2 hai
                //swap krdo mid ko high me

                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }

        }
        return arr;
    }





        public static void main(String[] args) {
            int arr[] = {0, 0, 1, 1, 0, 2, 2, 1, 0, 2, 2, 1, 1};
            int[] result = pointer(arr);

            for (int i : result) {
                System.out.print(i + " ");
            }

        }



            /*
        int arr[] = {0,0,1,1,0,1,1,0};
        int[] result =  sortArray(arr);

        for (int i : result){
            System.out.println(i + " ");
        }
*/


}
