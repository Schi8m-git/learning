#include <stdio.h> 
#include <stdlib.h> 
#define SIZE 300
int main(){
	int i, quantity,previous,current,sum;

	scanf("%d\n",&quantity);
	i=1;
	previous=0;
	current=1;
	sum=0;
	
	char resultString[SIZE];
	char currentString[SIZE];
	char av[SIZE];
	sprintf(resultString, "%d", current);


	while (i<quantity){
		sum = current;
		current = current + previous;
		previous = sum;
		i = i + 1;
		sprintf(resultString, "%s%d", resultString, current);

	}
	
	printf("%s\n", resultString);
}
