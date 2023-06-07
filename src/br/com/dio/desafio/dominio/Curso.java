package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "Título=" + getTitulo() +
                "Descrição=" + getDescricao() +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
