import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/ 
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMelissa = new Dev();
        devMelissa.setNome("Melissa: ");
        devMelissa.inscreverBootcamp(bootcamp);
        System.out.println("\n Conteudos Inscritos Melissa: " + devMelissa.getConteudosInscritos());        
        devMelissa.progradir();
        devMelissa.progradir();
        System.out.println("-");
        System.out.println("\n Conteudos Inscritos Melissa: " + devMelissa.getConteudosInscritos());
        System.out.println("\n Conteudos Concluidos Melissa: " + devMelissa.getConteudosConcluidos());
        System.out.println("XP: " + devMelissa.calcularTotalXp());
       
        System.out.println("------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progradir();
        devJoao.progradir();
        devJoao.progradir();
        System.out.println("-");
        System.out.println("\n Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("\n Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }

}
