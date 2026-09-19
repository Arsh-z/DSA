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



    static int pivot(int arr[]){
        int n = arr.length;

        int leftsum[] = new int[n];
        int rightsum[] = new int[n];

        //adding into left side
        leftsum[0] = arr[0];
        for(int i = 1; i<n; i++){
            leftsum[i] = leftsum[i-1]+arr[i];

        }

        //adding into right side
        rightsum[n - 1] = arr[n - 1];
        for(int i = n-2; i>+0;i--){
            rightsum[i]= rightsum[i+1] + arr[i];

        }

        for(int i = 0; i<n ; i++){
            if(leftsum[i] == rightsum[i]){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};

        System.out.println(pivot(arr));
        int result = pivot(arr);
        System.out.println("Pivot Index: " + result);


    }





           /* int arr[] = {0, 0, 1, 1, 0, 2, 2, 1, 0, 2, 2, 1, 1};
            int[] result = pointer(arr);

            for (int i : result) {
                System.out.print(i + " ");
            }*/





            /*
        int arr[] = {0,0,1,1,0,1,1,0};
        int[] result =  sortArray(arr);

        for (int i : result){
            System.out.println(i + " ");
        }
*/


}



