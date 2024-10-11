class Escola:
    def __init__(self, nomeEscola):
        self.nomeEscola = nomeEscola
        self.professores = []

    def cadastrarProfessor(self):
        if Professor not in self.professores:
            self.professores.append(Professor)

class Professor:
    def __init__(self, nomeProfessor):
        self.nomeProfessor = nomeProfessor
        self.escolas = []

    def cadastrarEscola(self):
        if Escola not in self.escolas:
            self.escolas.append(Escola)