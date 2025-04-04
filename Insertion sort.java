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
        System.out.print("Insertion Sort : ");
        insertion_sort(ans);
        System.out.print(Arrays.toString(ans));
    } 
    static void insertion_sort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
