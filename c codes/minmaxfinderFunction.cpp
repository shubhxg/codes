#include<iostream>
#include<climits>
using namespace std;

int maxFinder(int N, int Data[]){
    int Max = INT_MIN;
    for(int i=0;i<N;i++){
        Max = max(Max,Data[i]); //Function to return max of 2 values.
    }
    return Max;
}

int minFinder(int N, int Data[]){
    int Min = INT_MAX;
    for (int i=0;i<N;i++){
        Min = min(Min,Data[i]); //Function to return min of 2 values
    }
    return Min;
}
int main(){
    int Max;
    int Min;
    int N;
    cout<<"Enter number of entries : ";
    cin>>N;
    int Data[N];
    for(int i=0;i<N;i++){
        cin>>Data[i];
    }
    
    Max = maxFinder(N,Data);
    Min = minFinder(N,Data);
    cout<<"Max and Min Entries are : "<<Max<<", "<<Min;
    return 0;
}
