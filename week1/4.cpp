#include <iostream>
#include <string>

using namespace std;

int main() {
    string sentence;
    cout << "Enter a sentence: ";
    getline(cin, sentence);

    cout << "Finding the longest and shortest word in the sentence" << endl;
    int length = sentence.length();
    
    string longestWord = "";
    string shortestWord = "";
    string currentWord = "";
    
    
    bool firstWord = true; 

    for (int i = 0; i < length; i++) {
        if (sentence[i] != ' ') {
            currentWord += sentence[i];
        } else {
           
            if (!currentWord.empty()) {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                if (firstWord || currentWord.length() < shortestWord.length()) {
                    shortestWord = currentWord;
                    firstWord = false;
                }
                currentWord = ""; 
            }
        }
    }

    if (!currentWord.empty()) {
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }
        if (firstWord || currentWord.length() < shortestWord.length()) {
            shortestWord = currentWord;
        }
    }

    cout << "Longest word: " << longestWord << " (Length: " << longestWord.length() << ")" << endl;
    cout << "Shortest word: " << shortestWord << " (Length: " << shortestWord.length() << ")" << endl;
    
    return 0;
}
