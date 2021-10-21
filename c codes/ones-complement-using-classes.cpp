#include <bits/stdc++.h>
#include <string>
using namespace std;

class binary
{
    string s;

public:
    void read(void);
    void check_bin(void);
    void onesComplement(void);
    void display(void);
};
void binary :: read(void)
{ 
    cout << "enter a binary digit" << endl;
    cin >> s;
}
void binary :: check_bin(void)
{
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) != '0' && s.at(i) != '1')
        {
            cout << "incorrect binary format" << endl;
            exit(0);
        }
    }
}
void binary :: onesComplement(void)
{
    for (int i = 0; i < s.length(); i++)
    {
        if(s.at(i) == '1') s.at(i) = '0';     
        else s.at(i) = '1';
    }

}
void binary :: display(void)
{
    cout<<"After complement = ";
    for (int i = 0; i < s.length(); i++)
    {
        cout<<s.at(i);
    }

}

int main(){
    binary b;
    b.read();
    b.onesComplement(); 
    b.display();
}
