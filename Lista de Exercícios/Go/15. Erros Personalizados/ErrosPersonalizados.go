package main

import (
	"errors"
	"fmt"
)

type ContaBancaria struct {
	saldo floa
}

type SaldoInsuficienteError struct {
	alerta string
}

func (e *SaldoInsuficienteError) Error() string {
	return e.alerta
}

func (c *ContaBancaria) sacar(valor float) error {
	if valor <= 0 {
		return errors.New("o valor para saque deve ser positivo")
	}
	if valor > c.saldo {
		return &SaldoInsuficienteError{"Não foi possível realizar o saque devido ao saldo insuficiente"}
	}
	c.saldo -= valor
	return nil
}

func (c *ContaBancaria) depositar(valor float) {
	c.saldo += valor
}

func main() {

}
