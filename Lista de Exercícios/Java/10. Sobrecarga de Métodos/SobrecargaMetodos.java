class Calculadora {
    public int somar(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public int somar(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        return primeiroNumero + segundoNumero + terceiroNumero;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
    }
}