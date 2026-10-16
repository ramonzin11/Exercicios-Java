package POO.Classe_Objetos.dominio;
public class Produto{
    public String nome;
    public double preco;
    public int quantidade;

    public void exibirDetalhes(){
        System.out.println("ATRIBUTO DO PRODUTO");
        System.out.println("NOME: " + nome);
        System.out.println("PREÇO: " + "R$" + preco);
        System.out.println("QUANTIDADE: " + quantidade);
    }
    

    public double calcularTotal(){
       return preco * quantidade;
    }
}