public class Produto {

    String titulo;
    int peso;
    int preco;
    int quantidade;

    public Produto(String titulo, int peso, int preco, int quantidade) {
        this.titulo = titulo;
        this.peso = peso;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return titulo + ' ' + peso + " " + preco + " " + quantidade;
    }
}

