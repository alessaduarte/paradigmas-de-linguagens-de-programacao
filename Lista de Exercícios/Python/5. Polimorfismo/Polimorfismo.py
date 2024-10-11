class Animal:
    def __init__(self, som):
        self.som = som
    
    def somEmitido(self):
        print(f"Som: {self.som}")

class Cachorro(Animal):
    def som(self):
        return "AuAu"

class Gato(Animal):
    def som(self):
        return "Miau"
    
def somEmitido(self):
        print(f"Som: {self.som}")

for animal in [Cachorro(), Gato()]:
    somEmitido(animal)
