package com.poo.classes;
import java.time.LocalDate;
public class Livro {
 int id;
 String edicao;
 String titulo;
 int ano;
 private editora editora;
 private autor autor;

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
public editora getEditora() {
    return editora;
}
public void setEditora(editora editora) {
    this.editora = editora;
}
public autor getAutor() {
    return autor;
}
public void setAutor(autor autor) {
    this.autor = autor;
}
}
