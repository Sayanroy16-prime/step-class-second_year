#include<iostream>
#include<string.h>
using namespace std;

void hello(string word){
    bool isPalindrome = true;
    int length = word.length();
    for(int i=0;i<length;i++){
        if(word[i] == word[length-1-i]){
            isPalindrome = true;
        }else{
            isPalindrome = false;

        }
    }
        if(isPalindrome==true){
            cout<<"The word is a palindrome"<<endl;
        }
        else{
            cout<<"The word is not a palindrome"<<endl;
        }

    }




int main(){
    string word;
    cout<<"Enter a word: ";
    cin>>word;

    hello(word);
    



    return 0;
}