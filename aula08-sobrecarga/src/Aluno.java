import java.util.Date;

public class Aluno {
    private String nome;
    private String matricula;
    private Date data_nascimento;

    public Aluno(String nome, String matricula, Date data_nascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.data_nascimento = data_nascimento;
    }

    public Aluno(){

    }

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, Date data_nascimento){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }

    public Aluno(Date data_nascimento, String matricula){
        this.data_nascimento = data_nascimento;
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setData(Date data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public Date getData(){
        return data_nascimento;
    }
}