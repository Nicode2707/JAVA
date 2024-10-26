class Solution {
    public static int count(Node head, int key) {
        // code here
        int count = 0;
        Node temp = head ;
        int i =0;
        while(temp != null){
            if(temp.data == key){
                count++;
            }
            temp = temp.next;
            i++;
        }
        return count;
    }
}
