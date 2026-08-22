#include <iostream>
#include <string>
using namespace std; 
bool isPalindromeRecursive(string word, int start, int end) {
    if (start >= end) {
        return true;
    }
    if (word[start] != word[end]) {
        return false;
    }
   return isPalindromeRecursive(word, start + 1, end - 1);
}
int main() {
    string word;
    cout << "Enter a word: ";
    cin >> word;
    if (isPalindromeRecursive(word, 0, word.length() - 1)) {
        cout << "The word is a palindrome" << endl;
    }  
     else {
        cout << "The word is not a palindrome" << endl;
    }
    return 0;
}
