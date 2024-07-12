public class selectionsort {

    public static void selsectionsorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos =i;
            for(int j=i; j <arr.length; j++){
                if(arr[minpos] < arr[j]){
                    minpos =j;
                }
            }
            //swap
            int temp =arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,8,9,4,2};
        selsectionsorting(arr);
        printarr(arr);
    }
    
}
