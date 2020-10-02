#include<stdio.h>
int main(){
	float hardNess, carbonContent, tensileStr;
	const float H = 5 , CC = 7, TS = 56;
        printf("hardness (5-10), carbon content (7-10), tensile str (56 - 65)\n");
        printf("1. please enter the hardness of your steel sample : ");
        scanf("%f", &hardNess);
        printf("2. please enter the carbon content of your steel sample : ");
        scanf("%f", &carbonContent);
        printf("3. please enter the tensile strength : ");
        scanf("%f", &tensileStr);
            if (hardNess < H)
            {   
                if (carbonContent<CC && tensileStr<TS)   
                printf("steel quality is under grade 5");
                else if (carbonContent>CC && tensileStr>TS)
                printf("steel quality is under grade 8");
                else if (carbonContent > CC && tensileStr < TS)
                printf("steel quality is under grade 6");
                else if (carbonContent < CC && tensileStr > TS)
                printf("steel quality is under grade 6");
            }
            else if (hardNess > H)
            {   
                if (carbonContent < CC && tensileStr > TS)
                printf("steel quality is under grade 7");
                else if (carbonContent>CC && tensileStr<TS)
                printf("steel quality is under grade 9");
                else if (carbonContent > CC && tensileStr > TS)
                printf("steel quality is under grade 10");
                else if (carbonContent < CC && tensileStr < TS)
                printf("steel quality is under grade 6");
            }
            else 
            printf("please reenter the values \n");


return 0;
}