package main

import (
	"fmt"
)

type Empregado struct {
	nome   string
	cargo  string
	salario float64
}

func (e Empregado) informacoesEmpregado() {
	fmt.Println("Informações do Empregado:")
	fmt.Printf("Nome: %s\n", e.nome)
	fmt.Printf("Cargo: %s\n", e.cargo)
	fmt.Printf("Salário: R$%.2f\n", e.salario)
}

type Empresa struct {
	nomeEmpresa string
	empregados  []Empregado
}

func (emp *Empresa) cadastrarEmpregado(nome, cargo string, salario float64) {
	novoEmpregado := Empregado{nome: nome, cargo: cargo, salario: salario}
	emp.empregados = append(emp.empregados, novoEmpregado)
	fmt.Printf("Empregado %s cadastrado na empresa %s.\n", nome, emp.nomeEmpresa)
}

func main() {

}
