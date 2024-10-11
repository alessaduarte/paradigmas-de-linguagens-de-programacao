class Produto {
    private String nomeProduto;
    private double valorProduto;

    public Produto(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public Produto somar(Produto outro) {
        if (outro != null) {
            double valorTotal = this.valorProduto + outro.valorProduto;
            return new Produto("O resultado da soma de valor dos produtos é: R$", valorTotal);
        }
        return null;
    }

    @Override
    public String toString() {
        return nomeProduto + ": R$" + valorProduto;
    }

    public static void main(String[] args) {

    }
}