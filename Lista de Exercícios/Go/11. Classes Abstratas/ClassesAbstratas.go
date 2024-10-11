package main

import (
	"fmt"
)

type Funcionario interface {
	calcularSalario() float64
}

type FuncionarioHorista struct {
	valorHora       float64
	horasTrabalhadas float64
}

func (f FuncionarioHorista) calcularSalario() float64 {
	return f.valorHora * f.horasTrabalhadas
}

type FuncionarioAssalariado struct {
	salario float64
}

func (f FuncionarioAssalariado) calcularSalario() float64 {
	return f.salario
}

func main() {

}
