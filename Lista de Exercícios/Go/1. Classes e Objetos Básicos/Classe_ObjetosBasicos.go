package main

import (
	"fmt"
)

type Carro struct {
	marca string
	modelo string
	ano int
}

func (c Carro) detalhesCarro() {
	fmt.Println("Detalhes do Carro:")
	fmt.Println("Marca: %s\n", c.marca)
	fmt.Println("Modelo: %s\n", c.modelo)
	fmt.Println("Ano: %d\n", c.ano)
}

func main() {
	carro1 := Carro{"Hyundai", "Creta", 2024}
	carro2 := Carro{"Volkswagen", "Up", 2021}
	carro3 := Carro{"Hyundai", "HB20", 2023}

	carros := []Carro{carro1, carro2, carro3}
	for _, carro := range carros {
		carro.detalhesCarro()
	}
}