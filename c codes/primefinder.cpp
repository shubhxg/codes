#include<iostream>
#include<cmath>
using namespace std;
int main(){
        int number;
        cin>>number;
        bool flag;

        for(int i = 2;i<=sqrt(number);i++){
            if(number%2==0){
            cout<<"Non-Prime"<<endl;
            flag = 1;
            break;
            }
        }
        if (flag==0){
            cout<<"Prime"<<endl;
        }
    return 0;
}
