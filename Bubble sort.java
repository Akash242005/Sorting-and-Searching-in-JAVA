import java.util.*;
public class chatGpt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int size = sc.nextInt();
        int[] ans = new int[size];
        for(int i=0;i<size;i++){
            ans[i] = sc.nextInt();
        }
        System.out.print("Bubble Sort : ");
        bubble_sort(ans);
        System.out.print(Arrays.toString(ans));
    }
    static void bubble_sort(int[] arr){
        int n = arr.length;
        boolean Sort = false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    Sort = true;
                }
            }
            if(!Sort){
                break;
            }
        }
    }
}
