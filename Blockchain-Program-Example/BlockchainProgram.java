import java.util.Arrays;

public class BlockChainProgram {
    public static void main(String[] args) {

        // demonstrate what is hash function
        String statement = "Hello world!";
        int hashvalue = statement.hashCode();
        System.out.println("Statement = " + statement + ", and hash value is = " + hashvalue);

        // lets hash an array
        String[] list1 = { "hello", "world" };
        String[] list2 = { "hello", "world" };
        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);

        System.out.println("hash1 = " + hash1 + " hash2 = " + hash2);

        // demonstrate a series of blocks in chain

    }

}
