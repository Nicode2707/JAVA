public class search {

     public static int linearsearch(int number[],int key){
        for(int i =0; i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
     }
    

    public static void main(String[] args) {
         int number[]  = { 12,54,68,10,17,64,98,37,54,} ;
        int key =17;

        int index = linearsearch(number, key);

        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index :" + index);
        }

    }
}
