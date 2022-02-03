import java.util.Scanner;
class test{
    public static void main(String[] args) {
        //toreplace some text in string we can use <\name\> or <|name|>
        var introductionName = "Hello <|placeholder|>!";
        var choiceOfLang = "So you have chosen <|placeholder|> good choice!>";
        System.out.println("Enter your name : ");
        var in = new Scanner(System.in); 
        var name  = in.nextLine(); //reading name
        System.out.println(introductionName.replace("<|placeholder|>", name));
        System.out.println("What language you wanna choose?: ");
        var lang  = in.nextLine(); //reading name
        System.out.println(choiceOfLang.replace("<|placeholder|>", lang));
        in.close();

    }
}
