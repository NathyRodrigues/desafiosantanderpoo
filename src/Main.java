import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Javascript");
        curso2.setDescricao("descrição curso Javascript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNathalia = new Dev();
        devNathalia.setNome("Nathália");
        devNathalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nathália" + devNathalia.getConteudosInscritos());
        devNathalia.progredir();
        devNathalia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nathália" + devNathalia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Nathália" + devNathalia.getConteudosConcluidos());
        System.out.println("XP:" + devNathalia.calcularTotalXp());
        System.out.println("-----------------------------");

        Dev devRafa = new Dev();
        devRafa.setNome("Rafael");
        devRafa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael" + devRafa.getConteudosInscritos());
        devRafa.progredir();
        devRafa.progredir();
        devRafa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael" + devRafa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafael" + devRafa.getConteudosConcluidos());
        System.out.println("XP:" + devRafa.calcularTotalXp());
        System.out.println("-----------------------------");

    }

    }
