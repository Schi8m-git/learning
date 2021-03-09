#include <stdio.h>
int main(){
	int i, number;
	long double result;
	scanf("%d", &number);
		result=1;
		i=1;
	while(i!=number){
		i=i+1;
		result=result*i;
	}
	printf("%LF\n", result);

}