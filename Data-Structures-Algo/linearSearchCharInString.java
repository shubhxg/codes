public class LinearSearchCharInString {

    public static void main(String[] args) {
        // driver
        String str = "Java is amazing!";
        char target = 'v';
        System.out.println(searchInString(str, target));
    }

    static int searchInString(String str, char target) {

        // if string is null characters
        if (str.length() == 0) return -1;

        // if found at i
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) return i;
        }

        //if not found
        return -1;   
    }
}
