#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	char User [10];
	int Salario;
	
	printf("\nDigite seu nome: \t");
	scanf("%s",&User);
	
	printf("\nDigite seu salario: \t");
	scanf("%d",&Salario);
	
	printf("\nSeu nome e %s e seu Salario Minimo e de %d Reais \t",User,Salario);
	
	exit (0);
	return 0;
}
