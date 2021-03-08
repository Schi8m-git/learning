#include <stdio.h>
int main(){
	int i, n, k, S;
	scanf("%d", &n);
	
		k=1;
		S=1;
		i=1;
	
	while(i!=n){
		i=i+k;
		S=S*i;
	}
	printf("%d\n", S);

}