public class Rec8 {
    public static int lastoccurence(int arr[] ,int key ,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastoccurence(arr,key,i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,5,9};
       System.out.println(lastoccurence(arr, 5, 0));
    }
}
