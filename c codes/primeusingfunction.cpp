#include<iostream>
using namespace std;

bool isPrime(int num){
	for(int i=2;i<=sqrt(num);i++){
		if(num%i==0){
		return false;
		}
	}
	return true;
}
int main(){

	int firstNum,secondNum;
	cin>>firstNum>>secondNum;
	
	for(int i=firstNum;i<=secondNum;i++){
		if(isPrime(i)){
		cout<<i<<endl;
		}
	}
return 0;
}
