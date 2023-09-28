import java.util.ArrayList;
import java.util.HashMap;

public class Loja {
    String codigo;
    HashMap<String, Produto> produtos = new HashMap<>();

    public Loja(String codigo, HashMap<String, Produto> produtos) {
        this.codigo = codigo;
        this.produtos = produtos;
    }

    boolean addproduto(String titulo, int peso, int preco, int quantidade) {
        for (int i = 0; i < produtos.size(); i++) {
            if (titulo.equals(produtos.get(i).titulo)) {
                return false;
            }
        }
        produtos.put(titulo, new Produto(titulo, peso, preco, quantidade));
        return true;
    }

    int getProdutos() {
        int tamanho = produtos.size();
        return tamanho;

    }

    int getStock(String produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).titulo.equals(produto)) {
                return produtos.get(i).quantidade;
            }
        }
        return 0;
    }

    boolean sellproduto(String titulo) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).titulo.equals(titulo)) {
                produtos.get(i).quantidade--;
                return true;
            }
        }
        return false;
    }

    void addStock(String produto, int quant) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).titulo.equals(produto)) {
                produtos.get(i).quantidade += quant;
            }
        }
    }

    int getAllProducts() {
        int quantidades = 0;
        for (int i = 0; i < produtos.size(); i++) {
            quantidades += produtos.get(i).quantidade;
        }
        return quantidades;
    }

    ArrayList<String> getTitulosProdutos() {
        ArrayList<String> lista = new ArrayList<String>();

        for (int i = 0; i < produtos.size(); i++) {
            lista.add(produtos.get(i).titulo);
        }
        return lista;
    }

    ArrayList<Produto> getInfoProdutos() {
        ArrayList<Produto> list = new ArrayList<>();
        for (int i = 0; i < produtos.size(); i++) {
            list.add(produtos.get(i));
        }
        return list;
    }

    HashMap getEsgotar() {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).quantidade <= 3) {
                map.put(produtos.get(i).titulo, produtos.get(i).quantidade);
            }
        }
        return map;
    }

}
