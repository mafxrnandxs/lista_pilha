public class Aluno {
    private String nome;
    private String turma;
    private int idade;
    private double nota;

    public Aluno(String nome){
        this.nome = nome;
    }

    public Aluno(String nome, String turma, int idade, double nota){
        this.nome = nome;
        this.turma = turma;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", turma: " + turma + ", idade: " + idade + ", nota: " + nota + "\n";
    }

    public boolean equals(Aluno outro) {
     
        return this.nome.equals( outro.getNome() );
    }

    
}
