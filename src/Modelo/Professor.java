package Modelo;

import Modelo.Funcionario;

public class Professor extends Funcionario {

    public Professor(String departamento, String codigo, double salario, String nome, String cpf, String endereco) {
        super(codigo, salario, nome, cpf, endereco);
        this.departamento = departamento;
    }
  
    public String departamento;
    
}
