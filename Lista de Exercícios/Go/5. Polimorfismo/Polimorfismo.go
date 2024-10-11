package main

import (
	"fmt"
)

type Animal interface {
	SomEmitido() string
}

type Cachorro struct{}

func (c Cachorro) SomEmitido() string {
	return "AuAu"
}

type Gato struct{}

func (g Gato) SomEmitido() string {
	return "Miau"
}

func main() {

	animais := []Animal{Cachorro{}, Gato{}}

	for _, animal := range animais {
		fmt.Printf("Som: %s\n", animal.SomEmitido())
	}
}
