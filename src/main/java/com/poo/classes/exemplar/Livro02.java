import java.time.LocalDate;

public class Livro02 {
private int id;
private String edicao;
private String titulo;
private int ano;
private String editora;
private String autor;

//construtor
public Livro02(int id, String edicao, int ano, String editora, String autor) {
    this.id = id;
    this.edicao = edicao;
    this.ano = ano;
    this.editora = editora;
    this.autor = autor;
}

//getters and setters
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getEdicao() {
    return edicao;
}
public void setEdicao(String edicao) {
    this.edicao = edicao;
}
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public int getAno() {
    return ano;
}
public void setAno(int ano) {
    this.ano = ano;
}
public String getEditora() {
    return editora;
}
public void setEditora(String editora) {
    this.editora = editora;
}
public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}

 
}
