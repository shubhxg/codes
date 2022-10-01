#include<iostream>

    int main() {
        int n = 15;
        int b = n&1; // turns last bit to 1 if its 1 and 0 if its 0
        if(b==0)
        std::cout<<"even";
        else std::cout<<"odd";
    }
