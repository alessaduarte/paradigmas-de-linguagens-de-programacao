class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def detalhesCarro(self):
        print("Detalhes do Carro:")
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Ano: {self.ano}")

carro1 = Carro("Hyundai", "Creta", 2024)
carro2 = Carro("Volkswagen", "Up", 2021)
carro3 = Carro("Hyundai", "HB20", 2023)

for carro in [carro1, carro2, carro3]:
    carro.detalhesCarro()