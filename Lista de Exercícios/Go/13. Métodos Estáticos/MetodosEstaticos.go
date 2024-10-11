package main

import (
	"errors"
	"fmt"
)

func calculaFatorial(numero int) (int, error) {
	if numero < 0 {
		return 0, errors.New("o número deve ser positivo")
	}
	if numero == 0 || numero == 1 {
		return 1, nil
	}
	resultadoFatorial := 1
	for i := 1; i <= numero; i++ {
		resultadoFatorial *= i
	}
	return resultadoFatorial, nil
}

func main() {
	
}
