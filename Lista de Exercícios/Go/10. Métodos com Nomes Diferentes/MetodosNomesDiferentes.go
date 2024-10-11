package main

import (
	"fmt"
)

func somar(primeiroNumero, segundoNumero, terceiroNumero ...float) float {
	soma := primeiroNumero + segundoNumero
	if len(terceiroNumero) > 0 {
		soma += terceiroNumero[0]
	}
	return soma
}

func main() {

	fmt.Printf("Soma de 2 e 3: %.2f\n", somar(2, 3))
	fmt.Printf("Soma de 2, 3 e 4: %.2f\n", somar(2, 3, 4))
}