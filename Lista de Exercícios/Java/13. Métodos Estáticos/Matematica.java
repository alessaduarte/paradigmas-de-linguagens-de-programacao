public class Matematica {
    public static int calculaFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser positivo");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }

        int resultadoFatorial = 1;
        for (int i = 1; i <= numero; i++) {
            resultadoFatorial *= i;
        }
        return resultadoFatorial;
    }

    public static void main(String[] args) {
      
    }
}