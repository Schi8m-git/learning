#include <stdio.h>
int main(){
	float x1,x2,x,d,dx,max,dy1,dy2,delt;
	scanf("%f\n",&x1);
	scanf("%f\n",&x2);
	d=x2-x1;
	dx=d/100;
	x=x1;
	max=(6*x1+6)*dx;
	while (x<x2){
		dy1=(6*x+6)*dx;
		x=x+dx;
		dy2=(6*x+6)*dx;
		delt=dy2-dy1;
		if (delt>max){
			max=delt;
		}
	}
	printf("%f\n", max);
		
}
