class ContaBancaria:
    def __init__(self, titular):
        self.titular = titular
        self.__saldo = 0

    def depositar(self, valor):
         if valor > 0:
              self.__saldo += valor
    
    def sacar(self, valor):
         if 0 < valor <= self.__saldo:
              self.__saldo -= valor