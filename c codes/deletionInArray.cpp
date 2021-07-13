#include<iostream>
using namespace std;

int main(){

	const int SIZEOFARRAY = 6;
	int array[SIZEOFARRAY];
	for(int i=0; i<SIZEOFARRAY; i++)
	cin>>array[i];

	int pos;
	cout<<"Enter the position for the deletion : ";
	cin>>pos;

//code for deletion in array
	for(int i=pos-1;i<SIZEOFARRAY-1;i++)
	array[i] = array[i+1];
//prints the array.
	for(int i=0; i<SIZEOFARRAY-1; i++)
	cout<<" "<<array[i];
return 0;
}
