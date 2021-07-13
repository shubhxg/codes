#include<iostream>
#include<climits>
using namespace std;
int main(){
    int num;
    int maxNo=INT_MIN,minNo=INT_MAX;
    cout<<"how many entries for array = ";
    cin>>num;
    int array[num];
    for(int i=0;i<num;i++){
        cin>>array[i];
    }
    for(int i=0;i<num;i++){
        maxNo = max(maxNo,array[i]);
        minNo = min(minNo,array[i]);
        }
    cout<<"Max = "<<maxNo<<" Min = "<<minNo<<endl;
    return 0;
}
