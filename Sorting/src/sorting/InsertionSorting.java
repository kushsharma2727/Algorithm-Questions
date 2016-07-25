package sorting;

public class InsertionSorting {

    public static int[] insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            int val=arr[j];
            while(j>0 && arr[j-1]>val){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=val;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {532,8,7,5,9,6,234,1};
        QuickSorting obj = new QuickSorting();
        obj.quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    
}
