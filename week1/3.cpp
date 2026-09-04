#include<iostream>
#include<string>
using namespace std;


int main(){
    string word;
    cout<<"Enter a word: ";
    getline(cin,word);
    int n=word.length();


    for(int i=0;i<n;i++){
        if(word[i]==word[i+1]){
            word.erase(i,1);
            n--;

        }
        if(word[i]==word[i-1]){
            word.erase(i,1);
            n--;

        }
        cout<<"First non repeating character: "<<word[i]<<endl;
        

    }
    

    

    
    



    return 0;
}