#include<iostream>
using namespace std;

int linearSearch(int array[], int size, int key){
    
    for(int i=0;i<size;i++){
        if(array[i]==key){
            return i;
        }
    }
    return -1;
}
int main(){

    int size;
    cout<<"enter the size of the array = ";
    cin>>size;

    int array[size];
    for (int i=0;i<size;i++){
        cin>>array[i];
    }

    int keyToSearch;
    cout<<"enter the key to search = ";
    cin>>keyToSearch;
    cout<<"Found at index = "<<linearSearch(array,size,keyToSearch)<<endl;
    return 0;
}
