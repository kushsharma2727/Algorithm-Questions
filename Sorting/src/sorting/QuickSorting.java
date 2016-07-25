package sorting;

public class QuickSorting {
    public static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
    
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int pIndex = start;
        int i = start;
        while(i<end){
            if(arr[i]<=pivot){
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i]  = temp;
                pIndex++;
            }
            i++;
        }
        int temp = arr[pIndex];
        arr[pIndex] = arr[end];
        arr[end] = temp;
    
        return pIndex;
    }
    
    
}
