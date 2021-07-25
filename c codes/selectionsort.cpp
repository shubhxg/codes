#include <bits/stdc++.h>
using namespace std;

void selectionsort(int size, int list[])
{
    int min_element;
    //counter steps
    for(int i=0; i<size-1; i++){
        min_element = i;
        //finding minimum element
        for(int j=i+1; j<size; j++)
        if(list[j] < list[min_element])
            min_element = j;
        
        //swapping the minimum element with the step of counter
        int temp = list[i];
        list[i] = list[min_element];
        list[min_element] = temp;

    }
}
int main (){

    int size;
    cin>>size;
    int list[size];
    for (int i=0;i<size;i++){
        cin>>list[i];
    }
    selectionsort(size, list);
    for(int i=0; i<size; i++)
    cout<<" "<<list[i];



return 0;
}
