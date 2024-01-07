import java.util.Scanner;

public class findTriplet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter inpur array length");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("Please enter array values");
        }
        int arr [] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,12,13,14,15,16,17,18};
        // int n = arr.length;
        
        for(int i = n - 1; i >= 2; i--){
            int target = ( arr[i] * arr[i]);
            int sum = 0;
            int start = 0, end = i - 1;

            while( start < end){
                sum = arr[start]*arr[start] + arr[end]*arr[end];
                if(sum > target ){
                    end--;
                }
                else if( sum < target){
                    start++;
                }
                else{
                    System.out.println(arr[i]+ " " +arr[end]+ " " +arr[start]);

                    

                    while(start < end && arr[start] == arr[start+1]){
                        start++;
                    }
                    while(start < end && arr[end] == arr[end-1]){
                        end--;
                    }
                    start++;
                    end--;
                }
            }
            
        }

    }
    
}
