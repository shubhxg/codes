import java.util.Scanner;
//asked in jetbrain academy course.
//A university has decided to open math courses and equip classrooms for 3 groups with new special desks. 
//The faculty agreed that for the sake of productivity, only two students may share one desk. 
//The enrollment has ended, and now the task is to count the number of desks to order the correct number from the shop. Of course, 
//the university is short of money, so you need to calculate the minimum number of desks. But don't forget that each group will sit in its own classroom!

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstGroup = scanner.nextInt();
        int secondGroup= scanner.nextInt();
        int thirdGroup = scanner.nextInt();
        int result = 
            (firstGroup % 2) + (firstGroup / 2) //% is used to get the remainder of 2 and then rest is only students which can sit on a desk.
         +  (secondGroup % 2) + (secondGroup / 2)
         +  (thirdGroup % 2) + (thirdGroup / 2);
        System.out.println(result);
        
    }
}
