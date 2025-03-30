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
        System.out.print("Selection Sort : ");
        selection_sort(ans);
        System.out.print(Arrays.toString(ans));
    }
    static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
