package Carro_Ecologico;

import java.util.Scanner;

public class MainCar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Car car = new Car(2, 100);	
		
		int valor, opc = 0;
		
		do {
			System.out.println("=================================");
			System.out.println("[0] Sair\n"
					+ "[1] Embarcar\n"
					+ "[2] Desembarcar\n"
					+ "[3] Abastecer\n"
					+ "[4] Dirigir\n"
					+ "[5] Mostrar o status do carro\n"
					+ "[6] Criar um novo carro\n"
					+ "[7] Mostrar qtd de carros criados");
			System.out.println("=================================");
			System.out.println("Escolha uma opção: ");
			opc = scn.nextInt();
			
			switch(opc) {
				case 0:
					System.out.println("\nPrograma encerrado...");
					break;				
				case 1:
					car.in();
					break;				
				case 2:
					car.out();
					break;				
				case 3:
					System.out.println("Digite um valor: ");
					valor = scn.nextInt();
					car.fuel(valor);					
					break;				
				case 4:
					System.out.println("Digite a distância que deseja percorrer: ");
					valor = scn.nextInt();
					car.drive(valor);
					break;			
				case 5:
					System.out.println(car.toString());
					break;					
				case 6:
					car = new Car(2, 100);
					break;					
				case 7:
					System.out.println("\nQuantidade de Carros: " + Car.getContador());
					break;				
				default:
					System.out.println("\nOpção inválida!");
			}
 		}while(opc != 0);
		scn.close();
	}	
}