class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def informacoesEmpregado(self):
        print("Informações do Empregado:")
        print(f"Nome: {self.nome}")
        print(f"Cargo: {self.cargo}")
        print(f"Salário: R${self.salario}")

class Empresa:
    def __init__(self, nomeEmpresa):
        self.nomeEmpresa = nomeEmpresa
        self.empregados = []

    def cadastrarEmpregado(self):
        self.empregados.append(Empregado)