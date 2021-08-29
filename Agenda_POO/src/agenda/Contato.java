package agenda;

import java.util.ArrayList;

public class Contato {
	private String name;
	private ArrayList<Fone> fones = new ArrayList<Fone>();
	Fone fn;

	public Contato(String name) {
		this.name = name;
	}
	
	public Contato() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addFone(String label, String number) {
		fn = new Fone(label, number);
		if(fn.validade(number) == true) {
			fones.add(new Fone(label, number));
		}else System.out.println("fail: telefone inválido");		
	}
	public void rmFone(int index) {
		fones.remove(index);
	}
	public void show() {
		int i=0;
		System.out.print("- "+getName());		
		for (Fone fn : fones) {	
	        System.out.print(" ["+i+":"+fn.toString()+"]");
	        i++;
	    }
		System.out.print("\n");
	}
}
