package main

import (
	"fmt"
)

type Imprimivel interface {
	imprimir()
}

type Relatorio struct{}

func (r Relatorio) imprimir() {
	fmt.Println("O relatório está em processo de impressão")
}

type Contrato struct{}

func (c Contrato) imprimir() {
	fmt.Println("O contrato está em processo de impressão")
}

func main() {

	var documentos []Imprimivel
	documentos = append(documentos, Relatorio{}, Contrato{})

	for _, documento := range documentos {
		documento.imprimir()
	}
}