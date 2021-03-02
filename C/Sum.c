#include <stdio.h>
int main() {
	int a, b, c, do_not_close_the_window;
	printf(" Введите первое слагаемое:");
	scanf("%d", &a);
	printf("Введите второе слагаемое:");
	scanf("%d", &b);
	c = a + b;
    printf("%d + %d = %d\n", a, b, c);
    scanf("%d", &do_not_close_the_window);
    return 0;
}