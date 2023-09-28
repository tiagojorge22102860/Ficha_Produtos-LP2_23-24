import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static HashMap<String, Loja> lojas = new HashMap<>();

    static boolean adicionarProduto(String codigo, String titulo, int peso, int preco, int quantidade) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(codigo)) {
                return lojas.get(codigo).addproduto(titulo, peso, preco, quantidade);
            }
        }
        return false;

    }

    static ArrayList<String> obterTitulosProdutos(String codigo) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(codigo)) {
                return lojas.get(codigo).getTitulosProdutos();
            }
        }
        return new ArrayList<>();
    }

    static ArrayList obterInformacaoProdutos(String codigo) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(codigo)) {
                return lojas.get(codigo).getInfoProdutos();
            }
        }
        return new ArrayList<>();
    }

    static int obterNrProdutos(String id) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(id)) {
                return lojas.get(id).getProdutos();
            }
        }
        return 0;
    }

    static int obterStock(String codigo, String produto) {

        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(codigo)) {
                return lojas.get(i).getStock(produto);
            }
        }
        return 0;
    }

    static Boolean venderProduto(String codigo, String produto) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(codigo)) {
                return lojas.get(i).sellproduto(produto);
            }
        }
        return false;
    }

    static void adicionarStock(String codigo, String produto, int quantidade) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(codigo)) {
                lojas.get(i).addStock(produto, quantidade);
            }
        }

    }

    static int obterValorTotalProdutos(String codigo) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(codigo)) {
                return lojas.get(codigo).getAllProducts();
            }
        }
        return 0;
    }

    static HashMap obterProdutosPrestesEsgotar(String codigo) {
        for (int i = 0; i < lojas.size(); i++) {
            if (lojas.get(i).codigo.equals(codigo)) {
                lojas.get(codigo).getEsgotar();
            }
        }
        return new HashMap<>();
    }

    static int obterStockTotal(String produto) {
        int somaStock = 0;
        for (int i = 0; i < lojas.size(); i++) {
            somaStock += lojas.get(i).getStock(produto);
        }
        return somaStock;
    }

    static void reiniciarCadeia() {

    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}