#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	 
	int I,S,A;	
	
	printf("\nDigite um numero: \t");
	scanf("%d",&I);
	
	S = (I+1);
	printf("\nSeu Sucessor e: %d\t",S);

	A = (I-1);
	printf("\nSeu Antecessor e: %d\t",A);
	

	return 0;
}
