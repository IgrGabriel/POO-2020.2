package agenda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		String line;
		Contato ctt = new Contato();
		boolean exit = false;
		
		while(!exit) {
			System.out.print("$");
			line = scan.nextLine();
			String[] cmd = line.split(" ");
			
			switch(cmd[0]) {
				case "init":
					if(cmd.length == 2) {
						String name = cmd[1];
						ctt = new Contato(name);
					}else ctt = new Contato("");
					break;
				case "add":
					if(ctt.getName() == null) {
						System.out.println("fail: contato não iniciado");
					}else if(cmd.length == 3) {
						String label = cmd[1];
						String number = cmd[2];
						ctt.addFone(label, number);
					}else System.out.println("fail: dados incompletos");					
					break;
				case "rm":
					if(ctt.getName() == null) {
						System.out.println("fail: contato não iniciado");
					}else if(cmd.length == 2) {
						int index = Integer.valueOf(cmd[1]);
						ctt.rmFone(index);
					}else System.out.println("fail: dados incompletos");
					break;
				case "show":
					ctt.show();
					break;
				case "end":
					exit = true;
					break;
				case "help":
					System.out.println("Lista de comandos:\n-init _name(inicia o contato pelo nome)"
							+ "\n-add _label _number(adiciona uma label e um número ao contato)"
							+ "\n-rm _index(remove um telefone pelo índice)\n-show(mostra o contato e seu dados)"
							+ "\n-end(encerra o programa)");
					break;
				default:
					System.out.println("fail: comando incorreto!\nDigite help para ver a lista de comandos");
					break;
			}
		}
	}
}