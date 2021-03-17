#include <stdio.h>
#include <stdlib.h>
#define SIZE 100
int main(){
	int arrayLength, i, resultNumber;
	i = 0;
	char arrayOfRand[SIZE];
	printf("%s\n", "Кол-во случайных чисел:");
	scanf("%d", &arrayLength);
	while (i<arrayLength){
		resultNumber = i * rand()%100;;
		sprintf(arrayOfRand, "%s%s%d", arrayOfRand, " ", resultNumber);
		i = i + 1;
	}
	printf("%s\n", arrayOfRand);
}