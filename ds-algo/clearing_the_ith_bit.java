// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n = 20; //10100
        int i = 2;
        int mask = ~(1<<i); //11011
        System.out.println(n&mask); //cleared the 2nd bit
        // 10100
        // 11011 
    }
}
