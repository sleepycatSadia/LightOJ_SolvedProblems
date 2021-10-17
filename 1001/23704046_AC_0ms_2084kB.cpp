#include<bits/stdc++.h>
using namespace std;
int main(){
int T;
cin>>T;
for(int x=1;x<=T;x++){
 int s;
 cin>>s ;
   if(s%2==0){
    cout<<s/2<<" "<<s/2<<"\n";
}else{
int a=(s+1)/2;
cout<<a<<" "<<s-a<<"\n";
}

}
return 0;
 }
