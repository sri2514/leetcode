#include<math.h>
#define MAX 5000000
int countPrimes(int n){
     if(n<=2)
    return 0;
    int prime[MAX];
    for (int i = 0; i < n; i++) {
        prime[i] = 1; 
    }
    prime[0]=prime[1]=0;
   
    for(int i=2;i<=sqrt(n);i++){
        if(prime[i]){
for(int j=i*i;j<n;j+=i)
    prime[j]=0;
}
    }
//}
//int countPrimes(int n) {
    int count=0;
    for(int i=2;i<n;i++){
        if(prime[i])
    count++;
}
return count;
}