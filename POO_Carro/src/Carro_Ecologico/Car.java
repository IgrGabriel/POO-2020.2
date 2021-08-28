package Carro_Ecologico;

public class Car {
	//Atributos
	private int gasMax, passMax;
	private int km, gas, pass;
	private static int contador;
	
	//Método construtor
	public Car(int passMax, int gasMax) {	
		this.passMax = passMax;
		this.gasMax = gasMax;
		setContador(getContador()+1);//Variável contadora vai atribuir + 1 sempre que um objeto for instanciado
	}
	
	public Car() {	
		super();
	}

	//Getters e Setters
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Car.contador = contador;
	}
	
	public int getGasMax() {
		return gasMax;
	}
	
	public int getPassMax() {
		return passMax;
	}
	
	public int getKm() {
		return km;
	}

	public int getGas() {
		return gas;
	}

	public int getPass() {
		return pass;
	}
	private void setPass(int pass) {
		this.pass = pass;
	}
	
	//Ações/Comportamentos
	public boolean in() {//embarcar
		if(getPass() >= getPassMax()) {
			System.out.println("\nFail: limite de pessoas atingido");
			return false;
		}else {
			setPass(getPass()+1);
			return true;
		}		
	}
	
	public boolean out() {//desembarcar
		if(getPass() < 1) {
			System.out.println("\nFail: não há ninguém no carro");
			return false;
		}else {
			setPass(getPass()-1);
			return true;
		}		
	}
	
	public void fuel(int value) {//abastecer
		if(getGasMax() < value) {
			this.gas = this.gasMax;
		}else {
			
			this.gas = value;
		}
	}
	
	public boolean drive(int distance) {//dirigir 
		if(getPass() == 0) {//Condição para caso não tenha ninguém no carro
			System.out.println("\nFail: não há ninguém no carro");
			return false;
		}else if(getGas() == 0) {
			System.out.println("\nFail: tanque vazio");
			return false;	
		}else if(getGas() < distance){
			System.out.println("\nFail: tanque vazio após andar " + getGas() +"km");
			this.km += this.gas;
			this.gas = 0;
			return true;	
		}else {
			this.km += distance;
			this.gas -= distance;
			return true;	
		}	
			
	}
	
	public String toString() {
		return "\nPassageiros: " + this.getPass() + " de " + this.getPassMax() + 
				"\nGasolina: " + this.getGas() + " de " + this.getGasMax() + 
				"\nDistância percorrida: " + this.getKm() + " km";
	}
}