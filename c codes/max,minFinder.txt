#include<iostream>
using namespace std;

int maxFinder(int N, int Data[]){
    int Max = Data[0];
    for (int i=0;i<N;i++){
        if(Max<Data[i]){
            Max = Data[i];
        }
    }
    return Max;
}

int minFinder(int N, int Data[]){
    int Min = Data[0];
    for (int i=0;i<N;i++){
        if(Min>Data[i]){
            Min = Data[i];
        }
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
    for(int K=0;K<N;K++){
        cin>>Data[K];
    } 

    Max = maxFinder(N,Data);
    Min = minFinder(N,Data);
    cout<<"Max and Min Entries are : "<<Max<<", "<<Min;
    return 0;
}
