#include<iostream>
using namespace std;
//COMPLEXITY OF THIS CODE IS O(LOG2N).

int binarySearch(int arr[], int n, int key){
    int start = 0;
    int end = n;
    while(start<=end){
        int mid=(start+end)/2; //divides the array into half for binary search.

        if (arr[mid]==key){
            return mid; //returns the position of the key [0 is starting].
        }
        else if (arr[mid]>key){
            end = mid-1; //if key is small then the end is shifted to mid pos.
        }
        else { 
            start = mid+1; //if key is not small that means start should be shifted to
            // mid + 1 position.
        }
    }
    return -1;
}
int main(){

    int n;
    cout<<"enter the size of the list :  "<<endl;
    cin>>n;
    int array[n];
    cout<<"enter the elements of the array :  "<<endl;
    for(int i = 0;i<n;i++){
        cin>>array[i];
    }
    int key;
    cout<< "enter the key to find : ";
    cin>>key;
    cout<<"key is present at position : "<<binarySearch(array,n,key)<<endl;
    return 0;
}

