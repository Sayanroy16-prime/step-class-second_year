#include <iostream>
#include<random>
using namespace std;

class Game {
private:
    string a;
    string b;
    int pScore;
    int qScore;

public:
    Game() : pScore(0), qScore(0) {}


    void player1() {
        cout << "Player 1's turn:" << endl;
        cout << " Rock or paper or scissor: " << endl;
        getline(cin, a);
    }

    void player2() {
        random_device rd;
        mt19937 gen(rd());
        uniform_int_distribution<> dis(1, 3);
        // int randomChoice = dis(gen);
        cout << "Computers turn" << endl;
        cout << " Rock or paper or scissor: " << endl;
        int randomChoice = dis(gen);
        if (randomChoice == 1) {
            b = "rock";
        } else if (randomChoice == 2) {
            b = "paper";
        } else {
            b = "scissors";
        }
        cout<<"Computer chose: " << b << endl;
    }

    void roundResult() {
        if (a == b) {
            cout << "It's a tie" << endl;
            return;
        }

        if ((a == "rock" && b == "scissors") || (a == "paper" && b == "rock") || (a == "scissors" && b == "paper")) {
            pScore++;
            cout << "Player 1 wins" << endl;
        } else if ((b == "rock" && a == "scissors") || (b == "paper" && a == "rock") || (b == "scissors" && a == "paper")) {
            qScore++;
            cout << "Computer wins" << endl;
        // } else {
        //     cout << "Invalid input" << endl;
        }
    }

    void finalResult() {
        if (pScore > qScore) {
            cout << "Player 1 wins the game" << endl;
        } else if (pScore < qScore) {
            cout << "Computer wins the game:" << endl;
        } else {
            cout << "The game is a tie" << endl;
        }
    }
    void percentage(int pScore,int qScore ){
    if(pScore>qScore){
        float percentage = (float)pScore/(pScore+qScore)*100;
        cout<<"Player 1 wins with a percentage of: "<<percentage<<"%"<<endl;
    }else if(pScore<qScore){
        float percentage = (float)qScore/(pScore+qScore)*100;
        cout<<"Computer wins with a percentage of: "<<percentage<<"%"<<endl;

    }
}
};

int main() {
    int n;
    Game game;

    cout << "Enter the number of rounds you want to play: ";
    cin >> n;
    cin.ignore(); 

    for (int i = 0; i < n; i++) {
        game.player1();
        game.player2();
        game.roundResult();
    }

    game.finalResult();
    return 0;
}
