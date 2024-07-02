package com.poo.classes;
import java.time.LocalDate;
public class emprestimo {
int id;
String pessoa;
int dataEmprestimo;
int dataPrevisaoDevolucao;

public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getPessoa() {
    return pessoa;
}
public void setPessoa(String pessoa) {
    this.pessoa = pessoa;
}
public int getDataEmprestimo() {
    return dataEmprestimo;
}
public void setDataEmprestimo(int dataEmprestimo) {
    this.dataEmprestimo = dataEmprestimo;
}
public int getDataPrevisaoDevolucao() {
    return dataPrevisaoDevolucao;
}
public void setDataPrevisaoDevolucao(int dataPrevisaoDevolucao) {
    this.dataPrevisaoDevolucao = dataPrevisaoDevolucao;
}


}
