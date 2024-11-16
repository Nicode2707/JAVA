public class insertionsort {

  public static void selsectionsorting(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr =arr[i];
        int prev =i-1;
        //finding correct postion to insert
        while(prev>=0 &&  arr[prev] > curr ){
         arr[prev+1] = arr[prev];
          prev-- ;
        }
        //insertion
        arr[prev+1] = curr;
    }
  }

  public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

    public static void main(String[] args) {
    int arr[] = { 8,7,3,4,12};
     selsectionsorting(arr);   
     printarr(arr);
    }
}
