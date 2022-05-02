package gradlegs;

public class Genero {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0) {
            this.id = id;
        } else {
            System.out.println("id inválido");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}