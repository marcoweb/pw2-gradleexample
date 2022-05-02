package gradlegs;

public class App {
    public static void main(String[] args) {
        Genero g = new Genero();
        g.setId(10);
        g.setNome("Aventura");

        PessoaFisica p = new PessoaFisica();
        p.setNome("José da Silva");
        p.setCpf("65498712354");

        System.out.println("Olá Gradle");
        System.out.println(g.getNome());
    }
}