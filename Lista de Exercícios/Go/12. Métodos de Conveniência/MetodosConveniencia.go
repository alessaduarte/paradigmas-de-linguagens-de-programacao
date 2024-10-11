package main

import (
	"fmt"
)

type Produto struct {
	nomeProduto   string
	valorProduto  float64
}

func (p Produto) adicionar(outro Produto) Produto {
	return Produto{
		nomeProduto:  "O resultado da soma de valor dos produtos é:",
		valorProduto: p.valorProduto + outro.valorProduto,
	}
}

func (p Produto) String() string {
	return fmt.Sprintf("%s: R$%.2f", p.nomeProduto, p.valorProduto)
}

func main() {

}
