package agenda;

public class Fone {
	private String label;
	private String number;
	
	public Fone(String label, String number) {
		this.label = label;
		this.number = number;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public boolean validade(String number) {
		boolean valido = true;
		
		if(number.length() > 9 || number.length() < 2){
		      valido = false;
		   //}else if(!number.substring(0).matches("[0-9]*")){
			}else if(number.substring(0).matches("[a-zA-Z]*")){
			  valido = false;
			}
		return valido;
	}
	
	public String toString() {
		String dados = getLabel()+":"+getNumber();
		return dados;
	}
}
