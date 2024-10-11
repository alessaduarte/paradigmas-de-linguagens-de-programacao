from typing import Protocol

class Imprimivel(Protocol):
    def imprimir(self) -> None:
        pass

class Relatorio:
    def imprimir(self):
        print(f"O relatório está em processo de impressão")

class Contrato:
    def imprimir(self):
        print(f"O contrato está em processo de impressão")

Relatorio.imprimir()
Contrato.imprimir()