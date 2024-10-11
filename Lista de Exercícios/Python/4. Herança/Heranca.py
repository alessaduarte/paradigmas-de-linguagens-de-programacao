class Animal:
    def __init__(self, som):
        self.som = som

class Cachorro(Animal):
    def som(self):
        return "AuAu"

class Gato(Animal):
    def som(self):
        return "Miau"