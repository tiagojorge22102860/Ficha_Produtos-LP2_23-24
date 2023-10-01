import java.util.ArrayList;
import java.util.HashMap;

public class Loja {
    String codigo;
    HashMap<String, Produto> produtos = new HashMap<>();

    public Loja(String codigo) {
        this.codigo = codigo;

    }


    boolean addproduto(String titulo, int peso, int preco, int quantidade) {

        if (produtos.containsKey(titulo)) {
            return false;
        }
        produtos.put(titulo, new Produto(titulo, peso, preco, quantidade));
        return true;
    }

    int getProdutos() {
        return produtos.size();

    }

    int getStock(String produto) {

        if (produtos.containsKey(produto)) {
            return produtos.get(produto).quantidade;
        }

        return 0;
    }

    boolean sellproduto(String titulo) {

        if (produtos.containsKey(titulo)) {
            if (produtos.get(titulo).quantidade >= 1) {
                produtos.get(titulo).quantidade--;
                return true;
            }


        }

        return false;
    }

    void addStock(String produto, int quant) {

        if (produtos.containsKey(produto)) {
            produtos.get(produto).quantidade += quant;
        }

    }

    int getAllProducts() {
        int quantidades = 0;
        for (Produto produto : produtos.values()) {


            quantidades += produto.quantidade * produto.preco;


        }

        return quantidades;
    }

    ArrayList<String> getTitulosProdutos() {

        ArrayList<String> lista = new ArrayList<>();

        for (String produto : produtos.keySet()) {
            lista.add(produtos.get(produto).titulo);
        }
        return lista;
    }

    ArrayList<String> getInfoProdutos() {
        ArrayList<String> list = new ArrayList<>();
        for (Produto produto : produtos.values()) {
            list.add(produto.toString());
        }

        return list;
    }

    HashMap getEsgotar() {
        HashMap<String, Integer> map = new HashMap<>();
        for (String produto : produtos.keySet()) {
            if (produtos.get(produto) != null) {
                if (produtos.get(produto).quantidade < 3) {
                    map.put(produtos.get(produto).titulo, produtos.get(produto).quantidade);
                }
            }
        }


        return map;
    }

}
