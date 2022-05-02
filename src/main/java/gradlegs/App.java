package gradlegs;

public class App {
    public static void main(String[] args) {
        Genero g = new Genero();
        g.setId(10);
        g.setNome("Aventura");

        System.out.println("Olá Gradle");
        System.out.println(g.getNome());
    }
}