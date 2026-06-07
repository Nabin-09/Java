#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif
    int  q;
    cin >>  q;

    while (q--) {
        int n ;
        cin >> n ;
        for(int i = 1 ; i <= n ; i++){
            cout<< i <<" ";
        }
        cout<<endl;
    }
}
