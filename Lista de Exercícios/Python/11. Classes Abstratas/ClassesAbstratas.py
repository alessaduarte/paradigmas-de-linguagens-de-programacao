from abc import ABC, abstractmethod

class Funcionario(ABC):
    @abstractmethod
    def calcularSalario(self):
        self.calcularSalario

class FuncionarioHorista(Funcionario):
    def __init__(self, valorHora, horasTrabalhadas):
        self.valorHora = valorHora
        self.horasTrabalhadas = horasTrabalhadas

    def calcularSalario(self):
        return self.valorHora * self.horasTrabalhadas

class FuncionarioAssalariado(Funcionario):
    def __init__(self, salario):
        self.salario = salario

    def calcularSalario(self):
        return self.salario
