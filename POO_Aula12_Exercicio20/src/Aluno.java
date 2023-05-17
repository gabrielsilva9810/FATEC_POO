import java.time.LocalDate;

public class Aluno {
    private int id;
    private String ra;
    private String nome;
    private LocalDate nascimento;

    public Aluno(int id, String ra, String nome, LocalDate nascimento) {
        this.id = id;
        this.ra = ra;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getId() {
        return id;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
}
