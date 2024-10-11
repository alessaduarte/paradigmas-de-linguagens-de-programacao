class Produto:
    def __init__(self, nomeProduto, valorProduto):
        self.nomeProduto = nomeProduto
        self.valorProduto = valorProduto

    def __add__(self, other):
        if isinstance(other, Produto):
            return Produto("O resultado da soma de valor dos produtos é: R$", self.valorProduto + other.valorProduto)
        return NotImplemented
    
    def __str__(self):
        return f"{self.nomeProduto}: R${self.valorProduto}"