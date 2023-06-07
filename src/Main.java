import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso java = new Curso();
        java.setTitulo("Java");
        java.setDescricao("Curso de Java utilizando paradigma de programação orientada a objetos");
        java.setCargaHoraria(24);

        Curso kotlin = new Curso();
        kotlin.setTitulo("Kotlin");
        kotlin.setDescricao("Curso de Kotlin voltado a desenvolvimento mobile");
        kotlin.setCargaHoraria(12);

        Mentoria mentoriaDesenvolvimentoAgil = new Mentoria();
        mentoriaDesenvolvimentoAgil.setTitulo("Ambiente de desenvolvimento ágil");
        mentoriaDesenvolvimentoAgil.setDescricao("Mostrando como funciona o desenvolvimento ágil dentro do ambiente organizacional");
        mentoriaDesenvolvimentoAgil.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Trilha Java + Kotlin");
        bootcamp.getConteudos().add(java);
        bootcamp.getConteudos().add(kotlin);
        bootcamp.getConteudos().add(mentoriaDesenvolvimentoAgil);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel Marques");
        devGabriel.incscreverBootcamp(bootcamp);

        Dev devMario = new Dev();
        devMario.setNome("Mario Guimaraes");
        devMario.incscreverBootcamp(bootcamp);

        System.out.println("Conteúdos incritos de Gabriel: " + devGabriel.getConteudosInscritos());
        devGabriel.progradir();
        System.out.println("Conteúdos concluídos de Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("Conteúdos incritos de Gabriel(ATUALIZADO): " + devGabriel.getConteudosInscritos());
        System.out.println("XP: " + devGabriel.calcularXP() + "\n");

        System.out.println("Conteúdos incritos de Mario: " + devMario.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Mario: " + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularXP() + "\n");
    }
}