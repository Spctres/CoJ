#include <iostream>
#include <cmath>
using namespace std;

int main() {
    // your code goes here
    long long n,ans;
    cin>>n;
    ans=n-n/3;
    if(n%3!=0)
        ans--;
   
    cout<<ans<<endl;
    return 0;
}