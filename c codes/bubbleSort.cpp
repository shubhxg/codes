#include <iostream>
using namespace std;
//function to implement bubble sort
void bubbleSort(int arr[], int n){
	int i, j;
	for (i = 0; i < n-1; i++){
	    for (j = 0; j < n-i-1; j++)
		    if (arr[j] > arr[j+1]){
				//swapping done here
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
    }
}

//function to print the array
void printArray(int arr[], int size){
	int i;
	for (i = 0; i < size; i++)
		cout << arr[i] << " ";
	cout<<endl;
}

int main(){
    int n;
    cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
		cin>>arr[i];
	bubbleSort(arr, n);
	cout<<"Sorted array: \n";
	printArray(arr, n);
	return 0; 
}
