class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;
    private Motor potencia; 

    public Carro(String marca, String modelo, int ano, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; 
        this.potencia = new Motor(potencia);
    }

    public void detalhesCarro() {
        System.out.println("Detalhes do Carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Potência do Motor: " + potencia.getPotencia() + " cv");
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

        Carro carro1 = new Carro("Hyundai", "Creta", 2024, 100);
        Carro carro2 = new Carro("Volkswagen", "Up", 2021, 80);
        Carro carro3 = new Carro("Hyundai", "HB20", 2023, 120);

        Carro[] carros = {carro1, carro2, carro3};
        for (Carro carro : carros) {
            carro.detalhesCarro();
            carro.velocidadeAtual();
        }
    }
}
