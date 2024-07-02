package com.poo.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ClassesApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);
	limpa();
    Exemplar exemplar = new Exemplar();
    Exemplar.id = 34567891-2;
    Exemplar.livro = "Memórias póstumas de Brás Cubas";
  
	Livro Livro = new Livro();
    Livro.id = 123456789-0;
    Livro.titulo = " Memórias póstumas de Brás Cubas";
    Livro.edicao =" primeira edição";
    Livro.ano = 1881;
    editora.editora = "Autêntica";
    autor.autor = "Machado de Assis";

    autor autor = new autor();
	autor.id = 234567890-1;
    autor.nome = "Machado de Assis";


    endereco endereco = new endereco();
    endereco.id = 456789123-2;
    endereco.uf = "Rio de Janeiro-33";
    endereco.cidade = "Rio de Janeiro";
    endereco.logradouro = "Avenida X";
    endereco.complemento = "Bloco 3";
    endereco.tipo ="Área";

    editora editora = new editora();
    editora.id = 567891234-3;
    editora.nome = "Autêntica";

    pessoa pessoa = new pessoa();
    pessoa.id = 678912345-4;
    pessoa.nome = "Eduarda";
    pessoa.rg = 2222228222;

    devolucao devolucao = new devolucao();
    devolucao.id = 789123456-5;
    devolucao.dataDevolvido = (int) (2024-07-09);

    emprestimo emprestimo = new emprestimo();
    emprestimo.id = 789123456-6;
    emprestimo.pessoa = (String) " Maria Eduarda";
    emprestimo.dataEmprestimo = (int) (2024-07-02);
    emprestimo.dataPrevisaoDevolucao =  (int) (2024-07-09);




   
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
