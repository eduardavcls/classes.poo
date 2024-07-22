public class Pessoa02 {
 private int id;
 private String nome;
 private int rg;
 private int cpf;
 private String endereco;

//construtor
public Pessoa02( String nome,  int cpf, String endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
}

//getters and setters
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getRg() {
    return rg;
}
public void setRg(int rg) {
    this.rg = rg;
}
public int getCpf() {
    return cpf;
}
public void setCpf(int cpf) {
    this.cpf = cpf;
}
public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}

}
