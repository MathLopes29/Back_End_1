/*3. Fazer um programa em "C" que são e armazena 10 valores 
 e imprime o maior e o menor valores lidos.*/

#include<stdio.h>
#include <locale.h> 

int main(){

   setlocale(LC_ALL, "portuguese");
   
   int maior, menor, numero, i, resul;

   maior = 0;
   menor = 0;
   numero = 0;

   printf("Insira o primeiro numero:\t");
   scanf("\n%i",&numero);

   maior=numero;
   menor=numero;

   for (i = 0; i < 10; i++){
       printf("Entre com o Valor % do Registro\t", i+1);
       scanf("\n%i",&numero);
       if(numero > maior) {
           maior = numero;
       }else
           if (numero < menor)
               menor = numero;
   }

   printf("\==============================\t");
   printf("\nO MENOR NUMERO É:\t%d", menor); 
   printf("\nO MAIOR NUMERO É:\t%d", maior);
   printf("\n=============================\t");

}
