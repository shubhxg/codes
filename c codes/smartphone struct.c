#include<stdio.h>
#include<string.h>
	struct smartPhone{
		char name[20];
		int batteryBackup,frontCamPx,secondaryCamPx;
		char processor[20];
		double price;
	};
	int main(){
		struct smartPhone model1;
			strcpy(model1.name,"a1");
			strcpy(model1.processor,"Snapdragon435");
			model1.batteryBackup = 3500;
			model1.frontCamPx  = 5;
			model1.secondaryCamPx = 13;
			model1.price = 7999;
		struct smartPhone model2;
			strcpy(model2.name,"a2");
			strcpy(model2.processor,"Snapdragon550");
			model2.batteryBackup = 3790;
			model2.secondaryCamPx  = 16;
			model2.frontCamPx = 8;
			model2.price = 9999;
		struct smartPhone model3;
			strcpy(model3.name,"aT");
			strcpy(model3.processor,"Snapdragon665");
			model3.batteryBackup = 4000;
			model3.secondaryCamPx  = 25;
			model3.frontCamPx = 13;
			model3.price = 12999;
		printf("\n");
		printf("The model %s Specifications\n",model1.name);
		printf("BATTERY BACKUP: %d\nPROCESSOR: %s\nFRONT CAMERA: %d\nSECONDARY CAMERA: %d\nPRICE: Rs.%.2f",model1.batteryBackup,model1.processor,model1.frontCamPx,model1.secondaryCamPx,model1.price);
		printf("\n\nThe model %s Specifications\n",model2.name);
		printf("BATTERY BACKUP: %d\nPROCESSOR: %s\nFRONT CAMERA: %d\nSECONDARY CAMERA: %d\nPRICE: Rs.%.2f",model2.batteryBackup,model2.processor,model2.frontCamPx,model2.secondaryCamPx,model2.price);
		printf("\n\nThe model %s Specifications\n",model3.name);
		printf("BATTERY BACKUP: %d\nPROCESSOR: %s\nFRONT CAMERA: %d\nSECONDARY CAMERA: %d\nPRICE: Rs.%.2f",model3.batteryBackup,model3.processor,model3.frontCamPx,model3.secondaryCamPx,model3.price);

		
		
return 0;
}