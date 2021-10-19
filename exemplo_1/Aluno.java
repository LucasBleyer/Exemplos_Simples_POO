package exemplo_1;

public class Aluno {
    private String nome;
    private float peso;
    private float altura;
    private String matricula;

//construtores    
    public Aluno() {
    }

    public Aluno(String nome, float peso, float altura, String matricula) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.matricula = matricula;
    }

//getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

// to String para mostrar o objeto
    @Override
    public String toString() {
        return "Aluno{" + "nome= " + nome + ", peso= " + peso + ", altura= " + altura + ", matricula= " + matricula + '}';
    }  
}