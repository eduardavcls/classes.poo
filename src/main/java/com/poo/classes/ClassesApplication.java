package com.poo.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.classes.exemplar.Autor02;
import com.poo.classes.exemplar.Devolucao02;
import com.poo.classes.exemplar.Editora02;
import com.poo.classes.exemplar.Emprestimo02;
import com.poo.classes.exemplar.Endereco02;
import com.poo.classes.exemplar.Exemplar02;
import com.poo.classes.exemplar.ExemplarEmprestimo02;
import com.poo.classes.exemplar.Livro02;
import com.poo.classes.exemplar.Pessoa02;
import com.poo.classes.individual.endereco;
@SpringBootApplication
public class ClassesApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ClassesApplication.class, args);
	limpa();

        Pessoa02 pessoa = new Pessoa02(  "Patrícia",  000000066 , "Avenida x");
        pessoa.setId(123456789);
        System.out.println(pessoa.getId());

        Editora02 editora = new Editora02( "Editora Globo Livros");
        editora.setId(234567890);
        System.out.println(editora.getId());

        Devolucao02 devolucao = new Devolucao02();
        devolucao.setId(345678901);
        System.out.println(devolucao.getId());

        Endereco02 endereco = new Endereco02( 123456789-0);
        endereco.setId(456789012);
        System.out.println(endereco.getId());

        Emprestimo02 emprestimo = new Emprestimo02();
        emprestimo.setId(567890123);
        System.out.println(emprestimo.getId());

        Autor02 autor = new Autor02( "Machado de Assis");
        autor.setId(678901234);
        System.out.println(autor.getId());

        Livro02 livro = new Livro02( 1234567890 , "primeira edição" , 1881 , " Editora Globo Livros" , "Machado de Assis");
        livro.setId(1234567890);
        System.out.println(livro.getId());

        ExemplarEmprestimo02 exemplarEmprestimo = new ExemplarEmprestimo02();
        exemplarEmprestimo.setId(678901234);
        System.out.println(exemplarEmprestimo.getId());

        Exemplar02 exemplar = new Exemplar02();
        exemplar.setId(789012345);
        System.out.println(exemplar.getId());

   
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
