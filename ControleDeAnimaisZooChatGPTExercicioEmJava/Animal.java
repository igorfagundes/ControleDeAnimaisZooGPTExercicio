//CLASSE PROGENITORA(MAE)
package herancapoo;
public class Animal {
	//atributos
	public String nome;
	public int idade;
	public String genero;
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	//metodos
	public static void comer(boolean comer) {
		if(comer) {
			System.out.println("seu animal esta alimentado!");
		}else {
			System.out.println("seu animal esta com fome!");
		}
	}
	public static void dormir(boolean dormir) {
		if(dormir) {
			System.out.println("seu animal esta cochilando!");
		}else {
			System.out.println("seu animal esta desperto!");
		}
	}
	public static void respirar(boolean respirar) {
		if(respirar) {
			System.out.println("seu animal parece estar respirando!");
		}else {
			System.out.println("seu animal parece nao respirar, algo esta errado!");
		}
	}
	
	
}


