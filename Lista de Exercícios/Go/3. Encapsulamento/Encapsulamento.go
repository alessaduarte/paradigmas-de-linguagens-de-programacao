package main

import (
	"fmt"
)

type ContaBancaria struct {
	titular string
	saldo   float
}

func (c *ContaBancaria) depositar(valor float) {
	if valor > 0 {
		c.saldo += valor
	}
}

func (c *ContaBancaria) sacar(valor float) {
	if 0 < valor && valor <= c.saldo {
		c.saldo -= valor
	}
}

func (c ContaBancaria) exibirSaldo() {
	fmt.Printf("Saldo atual: %.2f\n", c.saldo)
}

func main() {
	
}