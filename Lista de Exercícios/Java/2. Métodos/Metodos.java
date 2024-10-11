class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; 
    }

    public void detalhesCarro() {
        System.out.println("Detalhes do Carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void acelerar(int aumentarVelocidade) {
        velocidade += aumentarVelocidade;
    }

    public void frear(int diminuirVelocidade) {
        velocidade -= diminuirVelocidade;
        if (velocidade < 0) {
            velocidade = 0; 
        }
    }

    public void velocidadeAtual() {
        System.out.println("A velocidade atual é: " + velocidade + " km/h");
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro("Hyundai", "Creta", 2024);
        Carro carro2 = new Carro("Volkswagen", "Up", 2021);
        Carro carro3 = new Carro("Hyundai", "HB20", 2023);

        Carro[] carros = {carro1, carro2, carro3};
        for (Carro carro : carros) {
            carro.detalhesCarro();
            carro.velocidadeAtual();
        }
    }
}
