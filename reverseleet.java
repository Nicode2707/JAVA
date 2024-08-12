class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed;
        
    }

public static void main(String[] args){
     int x = 12345;
     Solution solution = new Solution();
        int reversedNumber = solution.reverse(x);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}

