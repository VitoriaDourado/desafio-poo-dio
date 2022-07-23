import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVitoria = new Dev();
        devVitoria.setNome("Vitória");
        devVitoria.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Vitória " + devVitoria.getConteudosInscritos());
        devVitoria.progredir();
        devVitoria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Vitória " + devVitoria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Vitória " + devVitoria.getConteudosConcluidos());
        System.out.println("XP: " + devVitoria.calcularTotalXp());


        System.out.println("-------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        }
    }

