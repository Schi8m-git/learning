#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define SIZE 150
int main(){
	int size1,size2,i,j,k,bigNumber,randValueInt, leastIndex;
	double randValue;
	char randValueString[SIZE];
	i=0;
	j=0;
	k=0;
	//Генерация рандомной длины массива
	size1 = rand()%10;
	size2 = rand()%10;
	char matrix[size1+1][size2+1];

	while (i<=size1){
		//Генерация максимального значения рандомного длинного числа
		randValue = pow(10,size2);
		//Перевод рандомного длинного числа из double в int
		sprintf(randValueString, "%f", randValue);
		randValueInt = atoi(randValueString);
		//Генерация самого числа
		bigNumber = rand()%randValueInt;
		//Занесения числа в строки матрицы
		sprintf(matrix[i], "%d", bigNumber);
		i=i+1;
	}
	//Вывод матрицы на экран
	for(j=0;j<=size1;j++){
		printf("%s\n", matrix[j]);
	}
	//Расчет самой маленькйо стороны
	if (size1<size2){
		leastIndex = size1;
	} else{
		leastIndex = size2;
	}
	i=0;
	//Вывод элементов главной диагонали
	for(k=0; k<=leastIndex; k++){
		printf("%s%d%d%s%d%s\n","Элемент", k,i, " ", matrix[k][i], " ");
		i = i + 1;
	}
}