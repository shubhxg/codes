#include <stdio.h>
int main(){
    const int SECRETNUMBER = 9;
    int guess;
    int guessLimit = 3;
    int guessCount = 0;
    int Outofguesses = 0;   
    while(guess != SECRETNUMBER && Outofguesses == 0){
        if (guessCount < guessLimit){
            printf("Guess the secret number (1-10) to win: ");
            scanf(" %d", &guess);
            guessCount++;
        } else {
            Outofguesses = 1;
        }
    } 
    if (Outofguesses == 1){
        printf("YOU LOST!");
    } else {
        printf("YOU WIN! LUCKY NUMBER WAS 9");
    }
    return 0;
}