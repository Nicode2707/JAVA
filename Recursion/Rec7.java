public class Rec7 {

    public static int firstoccurence(int arr[] ,int key ,int i) {
        if(i == arr.length - 1 ){
            return -1;
        }
        if( arr [i]  == key ){
            return i;
        }
        return firstoccurence(arr,key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,4,9};
        System.out.println(firstoccurence(arr, 4, 0));
    }
}
