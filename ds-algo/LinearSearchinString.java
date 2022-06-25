public class LinearSearchinString {
    public static void main(String[] args) {
        String str = "What is going on";
        char target = '1';
        System.out.println(search(str, target));
    }

    private static boolean search(String str, char target) {
        
        if(str.length() == 0) return false;

        for (int i = 0; i < str.length(); i++) {

            //comparing characters at a ith index
            if(target == str.charAt(i)) return true;
        }

        // character not found
        return false;
    }
}
