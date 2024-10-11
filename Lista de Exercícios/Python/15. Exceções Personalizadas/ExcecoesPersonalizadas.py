class SaldoInsuficienteException(Exception):
    def __init__(self, alerta):
        super().__init__(alerta)

class ContaBancaria:
    def __init__(self, saldo = 0):
        self.saldo = saldo

    def sacar(self, valor):
         if 0 < valor <= self.__saldo:
              raise SaldoInsuficienteException("Não foi possível realizar o saque devido ao saldo insuficiente")
