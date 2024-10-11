package main

import (
	"fmt"
	"sync"
)

type Configuracao struct {
	configuracoes map[string]string
}

var (
	instancia *Configuracao
	once      sync.Once
)

func GetConfiguracao() *Configuracao {
	once.Do(func() {
		instancia = &Configuracao{
			configuracoes: make(map[string]string),
		}
	})
	return instancia
}

func main() {

}
