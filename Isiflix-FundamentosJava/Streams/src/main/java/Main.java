import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Produto(1, "iPhone XR", 2000.0, 1));
        produtos.add(new Produto(2, "Apple Watch", 2000.0, 2));
        produtos.add(new Produto(3, "MacBook Air", 4000.0, 3));
        produtos.add(new Produto(4, "iPad", 3500.0, 4));

        produtos.stream().filter(p -> p.getPreco() <= 100)
                .forEach(p -> System.out.println(p));

        int estoque;

        estoque = produtos.stream().map(p -> p.getQuantidade()).reduce(0, (q1, q2) -> q1 + q2);
        System.out.println("Estoque = " + estoque);

        double patrimonio;
        patrimonio = produtos.stream().map(p -> p.getQuantidade()* p.getPreco())
                .reduce(0.0, (p1, p2) -> p1 + p2);
        System.out.println("Patrimônio = " + patrimonio);
    }


}