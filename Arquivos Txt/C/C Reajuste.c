#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
int V, R;
	printf("\nDigite um valor: \t");
	scanf("%d",V);
	
	R=(V*0.25)+V;
	printf("\n======================\t");
	printf("  \n R E A J U S T E \t   ");
	printf("\n======================\t");
	printf("\nReajuste igual a: %d\t",R);
	
	return 0;
}
