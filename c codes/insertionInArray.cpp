#include<iostream>
using namespace std;

int main(){

	const int SIZEOFARRAY = 6;
	int array[SIZEOFARRAY];
	for(int i=0; i<SIZEOFARRAY; i++)
	cin>>array[i];

	int pos;
	cout<<"Enter the position of the element : ";
	cin>>pos;
	int element;
	cout<<"Enter the element to add : ";
	cin>>element;
  
//code for insertion in array
	for(int i=SIZEOFARRAY-1; i>=pos-1; i--)
	array[i+1] = array[i];
	array[pos-1] = element;
  
//prints the array with added element.
	for(int i=0; i<SIZEOFARRAY+1; i++)
	cout<<" "<<array[i];
return 0;
}
