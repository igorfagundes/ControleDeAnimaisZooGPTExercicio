//CLASSE PRINCIPAL(MAIN)
package herancapoo;
public class Principal {
	//instancia da classe mamifero
	static Mamifero mamifero = new Mamifero();
	//main
	public static void main(String[] args) {
	//classificacoes da heranca
		mamifero.setNome("gato");
		mamifero.setGenero("macho");
		mamifero.setIdade(2);
		//classificacoes da classe mamifero
		mamifero.setTipoDePelos("Branco e preto");
		mamifero.setQuantidadeDePelos(10);
		imprimir();
		
	}//main
	public static void imprimir() {
		System.out.println("=================");
		System.out.println("== CLASSIFICAO ==");
		System.out.println("=================");
		System.out.println("NOME: " + mamifero.getNome());
		System.out.println("GENERO: " + mamifero.getGenero());
		System.out.println("IDADE: " + mamifero.getIdade());
		System.out.println("=================");
		System.out.println("==================");
		System.out.println("== GERAIS ==");
		System.out.println("==================");
		System.out.println("TIPO DE PELOS: " + mamifero.getTipoDePelos());
		System.out.println("QUANTIDADE DE PELOS: " + mamifero.getQuantidadeDePelos() + " milhoes");
		System.out.println("=======================");
		System.out.println("== METODOS DA CLASSE ==");
		System.out.println("=======================");
		int cor = 1;//escolha 1, 2 ou 3
		mamifero.correr(1);//com scanner pode colocar a variavel cor
		System.out.println("==================");
		boolean aqua = true;
		mamifero.aquatico(true);//aqui pode se colocar a variavel aqua
		System.out.println("=======================");
		int amam = 1;//aqui pode se usar 0 ou 1
		mamifero.amamentar(amam);
	}
}//global

