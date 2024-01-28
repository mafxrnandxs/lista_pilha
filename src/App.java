public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("malu");
        Aluno a2 = new Aluno("mafe", "turma1", 24, 7.9);
        Aluno a3 = new Aluno("pedro");
        Aluno a4 = new Aluno("joao", "turma2", 19, 5.9);
        Aluno a5 = new Aluno("carlos");
        Aluno a6 = new Aluno("paula");
        Aluno a7 = new Aluno("oscar");
        Aluno a8 = new Aluno("Daisy");
        Aluno a9 = new Aluno("maria");
        
        Lista sala = new Lista();
        
        sala.adiciona(a1);
        sala.adiciona(0, a4);
        sala.adiciona(2, a3);
        
        System.out.println(sala.toString());
        
        System.out.println(sala.tamanho());
        
        sala.adiciona(a2);
        
        System.out.println(sala.tamanho());
        
        sala.adiciona(a5);
        sala.adiciona(a6);
        sala.adiciona(a9);
        sala.adiciona(a8);
        sala.adiciona(a7);
        
        
        System.out.println(sala.toString());
        System.out.println(sala.tamanho());
    }
}
