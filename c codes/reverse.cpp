#include<iostream>
using namespace std;

int main(){
	int number;
	int reverse=0;
	int lastdigit;
	
	cin>>number<<endl;
	while(number>0){
	lastdigit = number%10;
	reverse= reverse*10 + lastdigit;
	number/=10;
	}
	cout<<reverse<<endl;

}
