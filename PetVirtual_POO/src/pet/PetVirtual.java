package pet;

public class PetVirtual {
	//Atributos
	private int energyMax, hungryMax, cleanMax;
	private int energy, hungry, clean;
	private int diamonds, age;
	private boolean alive;
	
	//M�todo construtor
	public PetVirtual(int energyMax, int hungryMax, int cleanMax) {
		this.energyMax = energyMax;
		this.hungryMax = hungryMax;
		this.cleanMax = cleanMax;
		
		energy = energyMax;
		clean = cleanMax;
		alive = true;
	}
	
	//M�todos Getters e Setters
	public int getEnergyMax() {
		return energyMax;
	}
	public void setEnergyMax(int energyMax) {
		this.energyMax = energyMax;
	}	
	public int getHungryMax() {
		return hungryMax;
	}
	public void setHungryMax(int hungryMax) {
		this.hungryMax = hungryMax;
	}	
	public int getCleanMax() {
		return cleanMax;
	}
	public void setCleanMax(int cleanMax) {
		this.cleanMax = cleanMax;
	}	
	public int getHungry() {
		return hungry;
	}
	public void setHungry(int hungry) {
		this.hungry = hungry;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getClean() {
		return clean;
	}
	public void setClean(int clean) {
		this.clean = clean;
	}
	public int getDiamonds() {
		return diamonds;
	}
	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	//A��es/Comportamentos
	public void play() {
		if(alive) {//Verifica se o pet est� vivo
			System.out.println("Seu pet est� brincando!\n");
			setDiamonds(getDiamonds()+1);
			setHungry(getHungry()+1);
			setEnergy(getEnergy()-1);
			setClean(getClean()-1);
			

			if(getEnergy() == 0) {//Verifica se o pet ainda tem energia
				this.alive = false;
				System.out.println("Seu pet morreu sem energia!\n");
			}
			
			if(getClean() == 0) {//Verifica se o pet est� muito sujo
				this.alive = false;
				System.out.println("Seu pet morreu sujo!\n");
			}
			
			if(getHungry() > getHungryMax()) {//Limita a fome Max do pet
				this.hungry = this.hungryMax;			
			}
			
			if(alive) {//Se caso o pet termine a a��o vivo, ele ganha uma unidade em age
				setAge(getAge()+1);
			}
			
		}else {//Imprime a mensagen abaixo se alive = false
			System.out.println("Seu pet est� morto!\n");
		}
	}	
	
	public void shower() {
		if(alive) {//Verifica se o pet est� vivo
			System.out.println("Seu pet est� tomando banho!\n");
			setClean(getClean()+1);
			setHungry(getHungry()+1);
			setEnergy(getEnergy()-1);	
			
			if(getClean() > getCleanMax()) {//Limita no Max de limpeza
				this.hungry = this.hungryMax;	
			}
			
			if(getHungry() > getHungryMax()) {//Limita a fome Max do pet
				this.hungry = this.hungryMax;	
			}
			
			if(getEnergy() == 0) {//Verifica se o pet ainda tem energia
				this.alive = false;
				System.out.println("Seu pet morreu sem energia!\n");
			}
			
			if(alive) {//Se caso o pet termine a a��o vivo, ele ganha uma unidade em age
				setAge(getAge()+1);
			}
			
		}else {//Imprime a mensagen abaixo se alive = false
			System.out.println("Seu pet est� morto!\n");
		}		
	}
	
	public void eat() {
		if(alive) {
			System.out.println("Seu pet est� comendo!\n");
			setEnergy(getEnergy()+1);
			setHungry(getHungry()-1);
			setClean(getClean()-1);
			
			if(getEnergy() > getEnergyMax()) {//Condi��o para energia n�o passar da energia m�xima permitida
				this.energy = this.energyMax;
			}
			
			if(getHungry() < 0) {//Condi��o para fome n�o ficar com valor negativo
				this.hungry = 0;
			}
			
			if(getClean() == 0) {//Se clean = 0 o pet morre
				this.alive = false;
				System.out.println("Seu pet morreu sujo!\n");
			}
			
			if(alive) {//Se caso o pet termine a a��o vivo, ele ganha uma unidade em age
				setAge(getAge()+1);
			}
			
		}else {//Imprime a mensagen abaixo se alive = false
			System.out.println("Seu pet est� morto!\n");
		}
		
	}
	
	public void sleep() {
		
		if(alive) {
			System.out.println("Seu pet est� dormindo!\n");
			setEnergy(getEnergy()+1);
			setAge(getAge()+1);
			
			if(getEnergy() > getEnergyMax()) {//Limita a energia max permitida
				this.energy = this.energyMax;
			}
			
		}else {
			System.out.println("Seu pet est� morto!\n");
		}
		
	}
	
	public void show() {
		System.out.println("Diamantes: " + this.getDiamonds());
		System.out.println("Energia: " + this.getEnergy());
		System.out.println("Fome: " + this.getHungry());
		System.out.println("Limpeza: " + this.getClean());
		System.out.println("Idade: " + this.getAge() + "\n");		
	}	
	
}