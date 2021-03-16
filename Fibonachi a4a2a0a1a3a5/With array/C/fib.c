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
		if ((i/2)*2 == i){
			sprintf(resultString, "%s%d", resultString, current);
 		} else{
 			sprintf(currentString, "%d", current);
			sprintf(av, "%s%s", currentString, resultString);
			sprintf(resultString, "%s", av);
			sprintf(av, "%s", "");
		}

	}
	
	printf("%s\n", resultString);
}
