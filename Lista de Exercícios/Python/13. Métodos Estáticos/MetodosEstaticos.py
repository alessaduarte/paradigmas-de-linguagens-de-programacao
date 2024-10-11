class Matematica:
    @staticmethod
    def calculaFatorial(numero):
        if numero < 0:
            raise ValueError("O número deve ser positivo")
        if numero == 0 or numero == 1:
            return 1
        resultadoFatorial = 1
        for i in range(1, numero + 1):
            resultadoFatorial *= i
        return resultadoFatorial