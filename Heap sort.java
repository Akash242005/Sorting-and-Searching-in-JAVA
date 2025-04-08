public class HeapSort{

    public void heapsort(int[] arr){
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr, n, i);
        }
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public void heapify(int[] arr,int n,int i){
        int largest = i;
        int left = i*2+1;
        int right = i*2+2;
        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }
    static void printArray(int[] arr){
        for(int u:arr){
            System.out.print(u+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {32,54,1,8,6,90};
        System.out.print("Before sorting : ");
        printArray(arr);
        HeapSort sorter = new HeapSort();
        sorter.heapsort(arr);
        System.out.print("After Sorting : ");
        printArray(arr);
    }
}
