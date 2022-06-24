class ReverseString {
    public static void main(String args[]) {
      
        // string object "Shabbu"
        StringBuilder sb = new StringBuilder("Shabbu");

        for (int i=0; i<sb.length()/2; i++) {
          
            // taking indexes into variables
            int fronti= i;
            int backi= sb.length()-1-i;
            
            // taking characters at the indexes
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(sb.length()-1-i);

            // setting character at index 
            sb.setCharAt(fronti, backChar); 
            sb.setCharAt(backi, frontChar);
        }
        System.out.println(sb);
    }
}
