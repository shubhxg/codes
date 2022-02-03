#include<iostream>
#include<cmath>
using namespace std;

int main(){
	int orignumber;
    int sum =0;
    int n = orignumber;
	cin>>orignumber;
    while(orignumber>0){
        int lastdigit = orignumber%10;
        sum+= pow(lastdigit,3);
        orignumber = orignumber/10;
    }
	
    if(sum==orignumber)
	cout<<"Yes it is an Armstrong Number"<<endl;
    else
    cout<<"it is not an Armstrong Number"<<endl;
    return 0;
}
