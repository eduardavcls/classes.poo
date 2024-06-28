package com.poo.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);
	limpa();
    Exemplar exemplar = new Exemplar();
	Livro livro = new Livro();
	endereco endereco = new endereco();
    editora editora = new editora();
    autor autor = new autor();
    pessoa pessoa = new pessoa();
    devolucao devolucao = new devolucao();
    emprestimo emprestimo = new emprestimo();
   
	}
	static void limpa() {
        try {
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if(System.getProperty("os.name").contains("Linux") || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando não funciona no seu sistema operacional.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
