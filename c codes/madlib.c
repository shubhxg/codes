#include<stdio.h>
#include<conio.h>
int main(){
	//mad lib game
	char color[10], pluranNoun[20], celeb[20];
	printf("Enter any color : ");
	scanf("%s", color);
	printf("Enter any Plural Noun : ");
	scanf("%s", pluranNoun);
	printf("Enter any favourite celebrity : ");
	scanf("%s", celeb);
	printf("\n\nRoses are %s",color);
	printf("\n%s is blue",pluranNoun);
	printf("\nI love %s",celeb);
	
	return 0;
}