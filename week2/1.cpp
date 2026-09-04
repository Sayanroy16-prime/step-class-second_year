#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the number of seats available: "<<endl;
    cin>>n;

    int arr[n];
    cout<<"Enter the values:"<<endl;
    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    for(int i=0; i<n-1; i++){
        bool flag = true;
        for(int j=0; j<n-1-i; j++){
            if(arr[j] > arr[j+1]){
                swap(arr[j], arr[j+1]);
                flag = false;
            }
        }
        if (flag) break; 
    }
    bool flag=true;
    for(int i=0;i<n;i++){
        if(arr[i]==arr[i+1]){
            cout<<"Duplicate Seat Number Found: "<<arr[i]<<endl;
            flag=false;
            break;
        }
    }
    if(flag==true){
        cout<<"No Duplicate Seat Found."<<endl;
    }
    return 0;
}