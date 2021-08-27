#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

void permute(string select, string remain){
    if(remain == ""){
        cout << select << endl;
        return;
    }
    for(int i=0;remain[i];++i){
        string wk(remain);
        permute(select + remain[i], wk.erase(i, 1));
    }
}

int main(){
    string anagrama;
    cout << "input character set >";
    cin >> anagrama;
    sort(anagrama.begin(), anagrama.end());
    permute("", anagrama);
}