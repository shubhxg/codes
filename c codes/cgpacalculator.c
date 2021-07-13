#include<stdio.h>
int main(){
	//code for the percentage and cgpa
	char name[20];
	float eng,math,hin,cgpa,percentage;
	printf("Please enter your Name : ");
	gets(name);
	printf("Enter marks of the available subjects\n");
	printf("English : ");
	scanf("%f",&eng);
	printf("Hindi : ");
	scanf("%f",&hin);
	printf("Maths : ");
	scanf("%f",&math);
	//logic
		percentage = ((eng + math + hin)/300) * 100;
		cgpa = percentage / 9.5;
		printf("\n%s your percentage : %.2f and your cgpa : %.2f",name,percentage,cgpa);
		//if logic
		if (cgpa <= 7 && cgpa >= 4){
			printf("\n%s needs to work hard",name);
		}
		else if (cgpa <=3){
			printf("\n%s have failed the examinations",name);
		}
		else
		{
			printf("\nCongratulations %s");
		}
		
	return 0;
}
