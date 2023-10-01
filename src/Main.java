import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static HashMap<String, Loja> lojas = new HashMap<>();

    static boolean adicionarProduto(String codigo, String titulo, int peso, int preco, int quantidade) {

        if (lojas.containsKey(codigo)) {
            return lojas.get(codigo).addproduto(titulo, peso, preco, quantidade);
        }

        Loja lojaN = new Loja(codigo);
        lojas.put(codigo, lojaN);
        return lojaN.addproduto(titulo, peso, preco, quantidade);


    }

    static ArrayList<String> obterTitulosProdutos(String codigo) {

        if (lojas.containsKey(codigo)) {
            return lojas.get(codigo).getTitulosProdutos();
        }

        return null;
    }

    static ArrayList obterInformacaoProdutos(String codigo) {

        if (lojas.containsKey(codigo)) {
            return lojas.get(codigo).getInfoProdutos();
        }

        return new ArrayList<>();
    }

    static int obterNrProdutos(String id) {

        if (lojas.containsKey(id)) {
            return lojas.get(id).getProdutos();
        }

        return 0;
    }

    static int obterStock(String codigo, String produto) {


        if (lojas.containsKey(codigo)) {
            return lojas.get(codigo).getStock(produto);
        }

        return 0;
    }

    static Boolean venderProduto(String codigo, String produto) {

        if (lojas.containsKey(codigo)) {
            return lojas.get(codigo).sellproduto(produto);
        }

        return false;
    }

    static void adicionarStock(String codigo, String produto, int quantidade) {

        if (lojas.containsKey(codigo)) {
            lojas.get(codigo).addStock(produto, quantidade);
        }


    }

    static int obterValorTotalProdutos(String codigo) {

        if (lojas.containsKey(codigo)) {
            return lojas.get(codigo).getAllProducts();
        }

        return 0;
    }

    static HashMap obterProdutosPrestesEsgotar(String codigo) {

        if (lojas.containsKey(codigo)) {
            return lojas.get(codigo).getEsgotar();
        }

        return new HashMap<>();
    }

    static int obterStockTotal(String produto) {
        int somaStock = 0;
        for (Loja loja : lojas.values()) {
            somaStock += loja.getStock(produto);
        }

        return somaStock;
    }

    static void reiniciarCadeia() {
        lojas = new HashMap<>();
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}