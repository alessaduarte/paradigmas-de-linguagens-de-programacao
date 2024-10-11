package main

import (
	"fmt"
)

type Motor struct {
	potencia int
}

type Carro struct {
	marca     string
	modelo    string
	ano       int
	velocidade int
	motor     Motor
}

func (c Carro) detalhesCarro() {
	fmt.Println("Detalhes do Carro:")
	fmt.Printf("Marca: %s\n", c.marca)
	fmt.Printf("Modelo: %s\n", c.modelo)
	fmt.Printf("Ano: %d\n", c.ano)
	fmt.Printf("Potência do Motor: %d\n", c.motor.potencia)
}

func (c *Carro) acelerar(aumentarVelocidade int) {
	c.velocidade += aumentarVelocidade
}

func (c *Carro) frear(diminuirVelocidade int) {
	c.velocidade -= diminuirVelocidade
}

func (c Carro) velocidadeAtual() {
	fmt.Printf("A velocidade atual é: %d\n", c.velocidade)
}

func main() {

	carro1 := Carro{"Hyundai", "Creta", 2024, 0, Motor{100}}
	carro2 := Carro{"Volkswagen", "Up", 2021, 0, Motor{80}}
	carro3 := Carro{"Hyundai", "HB20", 2023, 0, Motor{120}}

	cars := []Carro{carro1, carro2, carro3}
	for _, carro := range cars {
		carro.detalhesCarro()
		carro.velocidadeAtual()
	}
}
