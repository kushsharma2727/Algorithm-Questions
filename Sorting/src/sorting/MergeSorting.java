package sorting;

public class MergeSorting {
    
    public static void mergeSort(int[] arr){
        int n=arr.length;
        if(n<2)
            return;
        int[] left = new int[n/2];
        int[] right = new int[n-left.length];
        for(int i=0;i<left.length;i++)
            left[i] = arr[i];
        int x=0;
        for(int j=left.length;j<n;j++){
            right[x] = arr[j];
            x++;
        }
        
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    
    public static void merge(int[] arr, int[] left, int[] right){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        while(i<left.length){
            arr[k]=left[i];
            k++;
            i++;
        }
        
        while(j<right.length){
            arr[k]=right[j];
            k++;
            j++;
        }
    }
}
