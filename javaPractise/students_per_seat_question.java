import java.util.Scanner;
//A university has decided to open math courses and equip classrooms for 3 groups with new special desks. 
//The faculty agreed that for the sake of productivity, only two students may share one desk. 
//The enrollment has ended, and now the task is to count the number of desks to order the correct number from the shop. Of course, 
//the university is short of money, so you need to calculate the minimum number of desks. But don't forget that each group will sit in its own classroom!

class students_per_seat_question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        float result = (float)(a+b+c)/2;
        if(result%2==0){
            System.out.println(result);
        } else {
            System.out.println(Math.round(result));
        }
    }
}
