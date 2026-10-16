package POO.Classe_Objetos.teste;
import POO.Classe_Objetos.dominio.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto proTest = new Produto();
        Produto proTeste02 = new Produto();

        proTest.nome = "lapis";
        proTest.preco  = 5.50;
        proTest.quantidade = 50;

        proTest.exibirDetalhes();
        System.out.println("TOTAL: R$" + proTest.calcularTotal());

        System.out.println("==========================================");

        proTeste02.nome = "caderno";
        proTeste02.preco = 10.50;
        proTeste02.quantidade = 60;

        proTeste02.exibirDetalhes();
        System.out.println("TOTAL: R$" + proTeste02.calcularTotal());        
    
    }
}
