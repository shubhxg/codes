#include<bits/stdc++.h>
using namespace std;

int Stack[10], top;

void push(int element){
    ++top;
    Stack[top] = element;
}

bool isEmpty()
{
    if (top>0) 
    return false;
    else 
    return true;
}

void pop(){
    Stack[top] = 0;
    --top;
}

int topOfStack(){
    return Stack[top];
}

int main(){

    top = 0;
    push(1);
    cout<<topOfStack();
    push(2);
    cout<<topOfStack();
    push(3);
    cout<<topOfStack();
    if(isEmpty>0)
        printf("\nStack is not empty");

return 0;
}
