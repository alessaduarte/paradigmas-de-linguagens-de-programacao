class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido. Verifique o valor ou o saldo.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$" + saldo);
    }

    public static void main(String[] args) {
        
    }
}
