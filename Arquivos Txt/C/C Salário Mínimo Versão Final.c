#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	char User [10];
	int Salario,Qtde;
	
	printf("\n===================================\t");
	printf("\nDigite seu nome: \t");
	scanf("%s",&User);
	
	printf("\nDigite quantos salarios vc possui:\t");
	scanf("%d",&Qtde);
	printf("\t");
	
	printf("\n==============================================================\t");
	printf("\n     S A L A R I O  M I N I M O    \t");
	printf("\n==============================================================\t");
	printf("\t");
	
	Salario = Qtde*788;
	printf("\nSeu nome e %s e seu Salario Minimo e de %d Reais \t",User,Salario);
	
		
	exit (0);
	return 0;
}
