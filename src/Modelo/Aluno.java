package Modelo;

public class  Aluno extends Pessoa {

    public Aluno(String matricula, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }
 
    public String matricula;
    
}
