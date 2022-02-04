import java.util.*;  
class test {
    //type of website telling code
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        String inputWebsite = in.next();
        if(inputWebsite.endsWith(".org"))
            System.out.println("Organisational Website");
        else if(inputWebsite.endsWith(".in"))
            System.out.println("Indian website");
        else if(inputWebsite.endsWith(".com"))
            System.out.println("Commercial website");
        else if(inputWebsite.endsWith("."))
            System.out.println("Commercial website");
        else 
            System.out.println("unknown website :(");
        in.close();
    }
}
