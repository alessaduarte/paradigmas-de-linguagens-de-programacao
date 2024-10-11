import java.util.ArrayList;

class Escola {
    private String nomeEscola;
    private ArrayList<Professor> professores;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.professores = new ArrayList<>();
    }

    public void cadastrarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
            professor.cadastrarEscola(this); 
        } else {
            System.out.println("Professor já cadastrado.");
        }
    }

    public String getNomeEscola() {
        return nomeEscola;
    }
}

class Professor {
    private String nomeProfessor;
    private ArrayList<Escola> escolas;

    public Professor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.escolas = new ArrayList<>();
    }

    public void cadastrarEscola(Escola escola) {
        if (!escolas.contains(escola)) {
            escolas.add(escola);
        } else {
            System.out.println("Escola já cadastrada.");
        }
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }
}