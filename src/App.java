public class App {
    public static void main(String[] args) throws Exception {
        Lista sala = new Lista();

        Aluno a1 = new Aluno("carla");
        Aluno a2 = new Aluno("lucas", "3 semestre", 23, 7.5);

        sala.adiciona(a1);
        sala.adiciona(0, a2);
        sala.remove(0);

        System.out.println(sala.contem(a2));
    }
}
