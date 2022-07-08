public class LettersCeilingTarget {
    public static void main(String[] args) {
        char letters[] = {'c', 'd', 'h', 's','t','x'};
        char target = 'x'; // will return 0 
        System.out.println(nextGreatestLetter(letters, target));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(target<letters[mid]) 
                e = mid-1;
            else 
                s = mid+1;
        }

        // returns the letter[index % array's length] which will be 0,1,2,3... n, n%n will be 0
        return letters[s % letters.length];
    }
}
