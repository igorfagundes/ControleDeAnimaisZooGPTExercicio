//CLASSE MAMIFERO
package herancapoo;
public class Mamifero extends Animal {
	//atributos
	public String tipoDePelos;
	public int quantidadeDePelos;
	//getters e setters
	public String getTipoDePelos() {
		return this.tipoDePelos;
	}
	public void setTipoDePelos(String tipoDePelos) {
		this.tipoDePelos = tipoDePelos;
	}
	public int getQuantidadeDePelos() {
		return quantidadeDePelos;
	}
	public void setQuantidadeDePelos(int quantidadeDePelos) {
		this.quantidadeDePelos = quantidadeDePelos;
	}
	//metodos
	public static void correr(int correr) {
		switch(correr) {
		case 1:
			System.out.println("Seu animal esta andando!");
			break;
		case 2:
			System.out.println("seu animal se animou a correr!");
			break;
		case 3:
			System.out.println("O bixo da maluco na corrida");
			break;
			default:
				System.out.println("Quer nada co a vida, tá deitado");
		}
			
		
	}
	public static void aquatico(boolean aquatico) {
		if(aquatico == true) {
			System.out.println("Seu animal e aquatico!");
		}else {
			System.out.println("Seu animal é terrestre!");
		}
	}
	public static int amamentar(int amamentar) {
		if(amamentar == 1) {
			String amamenta = "Amamentando...";
			System.out.println(amamenta);
		}else {
			String amamenta = "nao esta amamentando";
			System.out.println(amamenta);
		}
		return amamentar;
	}
	
}

