package main

import (
	"fmt"
)

type Professor struct {
	nomeProfessor string
	escolas       []*Escola
}

func (p *Professor) cadastrarEscola(e *Escola) {
	for _, escola := range p.escolas {
		if escola.nomeEscola == e.nomeEscola {
			fmt.Println("Escola já cadastrada!")
			return
		}
	}
	p.escolas = append(p.escolas, e)
	fmt.Printf("Escola %s cadastrada para o professor %s.\n", e.nomeEscola, p.nomeProfessor)
}

type Escola struct {
	nomeEscola string
	professores []*Professor
}

func (e *Escola) cadastrarProfessor(p *Professor) {
	for _, professor := range e.professores {
		if professor.nomeProfessor == p.nomeProfessor {
			fmt.Println("Professor já cadastrado!")
			return
		}
	}
	e.professores = append(e.professores, p)
	fmt.Printf("Professor %s cadastrado na escola %s.\n", p.nomeProfessor, e.nomeEscola)
}

func main() {
	
}
