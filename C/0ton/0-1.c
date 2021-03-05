#include <stdio.h>
int main() {
	int a,i,k;
	printf("Введите число\n");
	scanf("%d", &a);
	if (a > 0){
		k = 1;
	}
	else{
		k = -1;
	}
	i = 0;
	printf("%d\n", i);
	while (i != a) {
		i = i + k;
		printf("%d\n", i);
	}
}