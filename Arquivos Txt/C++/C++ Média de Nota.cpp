#include <iostream>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char** argv) {
	
	int N1= 8;
	int N2= 9;
	int N3= 7;
	int N4= 4;
	int N5= 5;
	int N6= 6;
	int M1,M2,MT;
	
	std::cout<<"\n====================================\t";
	std::cout<<"\nNota P1: \t"<<N1;
	std::cout<<"\nNota P2: \t"<<N2;
	std::cout<<"\nNota P3: \t"<<N3;
	
	M1 = N1+N2+N3/3;
	std::cout<<"\nMedia aritmetica: \t"<<M1," \n";
	
	std::cout<<"\n===================================\t";
	std::cout<<"\nNota P4: \t"<<N4;
	std::cout<<"\nNota P5: \t"<<N5;
	std::cout<<"\nNota P6: \t"<<N6;
	
	M2 = N4+N5+N6/3;
	std::cout<<"\nMedia aritmetica: \t"<<M2," \n";
	
	MT = M1+M2;
	std::cout<<"\n===================================\t";
	std::cout<<"\nMedia aritmetica total: \t"<<MT," \n";
	return 0;
}
