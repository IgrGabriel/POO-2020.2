package lapiseira;

public class Lapiseira {
	private float calibre;
	Grafite grafite = null;
	
	public Lapiseira(float calibre){
		this.calibre = calibre;
	}
	
	public float getCalibre() {
		return calibre;
	}
	
	void inserir(float calibre, String dureza, int tamanho){
		if(getCalibre() != calibre) {
			System.out.println("fail: calibre não compatível");
		}else if(grafite != null){
			System.out.println("fail: já existe grafite");
		}else{
			grafite = new Grafite(calibre, dureza, tamanho);
		}		
	}
	
	void remover() {
		if(grafite != null) {
			grafite = null;
		}
	}
	
	void escrever(int pressao) {
		if(grafite == null) {
			System.out.println("fail: não existe grafite");
		} else{
			int aux = grafite.getTamanho();
			aux -= pressao * 2;
			grafite.setTamanho(aux);
			
			if(aux < 0) {
			    System.out.println("fail: folha  ficou pela metade");
			}
			if(grafite.getTamanho() <= 0) {
				grafite = null;
				System.out.println("fail: grafite acabou");
			}
		}
	}
	
	public String toString() {
		if(grafite == null) {
			return "calibre: " + this.getCalibre() + ", grafite: " + grafite;
		}else {
			return "calibre: " + this.getCalibre() + ", grafite: [" + grafite.getCalibre() + 
					":" + grafite.getDureza() + ":" + grafite.getTamanho() + "]";
		}
	}
}
