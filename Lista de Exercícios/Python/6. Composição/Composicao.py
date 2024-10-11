class Motor:
    def __init__(self, potencia):
        self.potencia = potencia

class Carro:
    def __init__(self, marca, modelo, ano, velocidade, potencia):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0
        self.potencia = Motor(potencia)

    def detalhesCarro(self):
        print("Detalhes do Carro:")
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Ano: {self.ano}")
        print(f"Potência do Motor: {self.potencia}")

    def acelerar(self, aumentarVelocidade):
        self.velocidade += aumentarVelocidade

    def frear(self, diminuirVelocidade):
        self.velocidade -= diminuirVelocidade
    
    def velocidadeAtual(self):
        print(f"A velocidade atual é: {self.velocidade}")

carro1 = Carro("Hyundai", "Creta", 2024, 140, 100)
carro2 = Carro("Volkswagen", "Up", 2021, 100, 80)
carro3 = Carro("Hyundai", "HB20", 2023, 120, 120)

for carro in [carro1, carro2, carro3]:
    carro.detalhesCarro()
    carro.velocidadeAtual