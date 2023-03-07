import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootecamp(bootcamp);
        System.out.println("Conteudos Inscritos \n" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        System.out.println("Conteudos Concluidos \n" + devMatheus.getConteudosConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootecamp(bootcamp);
        System.out.println("Conteudos Inscritos \n" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Concluidos \n" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
