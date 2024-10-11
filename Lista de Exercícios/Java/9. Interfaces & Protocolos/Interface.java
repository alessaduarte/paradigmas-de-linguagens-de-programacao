interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("O relatório está em processo de impressão");
    }
}

class Contrato implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("O contrato está em processo de impressão");
    }
}