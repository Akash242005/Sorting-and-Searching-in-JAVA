import java.util.*;
public class Main {
    public static void MergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            MergeSort(arr, left, mid);
            MergeSort(arr, mid+1, right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;i++){
            L[i] = arr[left+i];
        }
        for(int i=0;i<n2;i++){
            R[i] = arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The array before sorting is : ");
        System.out.print(Arrays.toString(arr));
        MergeSort(arr, 0, n-1);
        System.out.println();
        System.out.print("The sorted array is : ");
        System.out.print(Arrays.toString(arr));
    }
}
