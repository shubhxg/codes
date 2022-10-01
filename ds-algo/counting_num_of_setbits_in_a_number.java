// program to find number of setbits in a number
class BitMan {
    public static void main(String[] args) {
        int n = 13; //1101
        int bitchecker=0;
        int count = 0;
        
        while(n!=0){
            bitchecker = n&1; // returns last bit of n
            n = n>>1; // right shifted bits once 
            if (bitchecker == 1) // if the last bit is 1 increase the counter by 1
            count++;
            bitchecker = 0; // make the bitchcker 0 again 
        }
        System.out.println(count); //3
    }
}
