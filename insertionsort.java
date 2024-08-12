public class insertionsort{
public static void insertsort(int arr[]) {
    for(int i=1;i<arr.length;i++){
        int curr =arr[i];
        int prev = i-1;
        //finding out the correct pos to insert
        while (prev>=0 && arr[prev] > arr[curr]) {
            arr[prev+1] = arr[prev];
            prev--; 
        }
        //insertion
        arr[prev + 1] = curr;
    } 
}
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
     System.out.println();
     }
     public static void main(String[] args) {
             int arr[] = {5,4,1,2,3,};
             insertsort(arr);
             printarr(arr);
        }
}