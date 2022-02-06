import java.util.Scanner;

public class methods {
    public void isEven(int a){
        boolean isEven = false;
        if (a%2 ==0) { 
            isEven = true;
        }
        System.out.println(isEven);
    }
    
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);
        int num = objInput.nextInt();
        methods obj = new methods(); //methods type object created to invoke
        //evenOdd method
       obj.isEven(num);
       objInput.close();
    }
}
