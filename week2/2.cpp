#include<iostream>
#include<iterator>

using namespace std;

int main(){
    int n;
    cout<<"Enter the number of each section: "<<endl;
    cin>>n;
    int section1[n];
    int section2[n];
    int sum1=0;
    int sum2=0;
    int max=0;
    for(int i=0;i<n;i++){
        cin>>section1[i];
    }
    for(int i=0;i<n;i++){

        sum1=sum1+section1[i];
    }
    for(int j=0;j<n;j++){
        cin>>section2[j];
    }
    for(int j=0;j<n;j++){

        sum2=sum2+section2[j];
    }
    cout<<"Section A Total: "<<sum1<<endl;
    cout<<"Section B Total: "<<sum2<<endl;
    if(sum1==sum2){
        cout<<"Status: Balanced "<<endl;
    }
    else{
        cout<<"Status: Not Balanced ";
        int b=n+n;

        int mergged[b];
        for(int i=0;i<n;i++){
            mergged[i]=section1[i];
        }
        for(int i=0;i<n;i++){
            mergged[n+i]=section2[i];
        }

        for(int i=0;i<b;i++){
            

        }
    }
    
    
    
    
    
    return 0;
}