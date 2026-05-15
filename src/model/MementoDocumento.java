package model;

public class MementoDocumento {
    private String titulo;
    private String conteudo;
    private String autor;
    private double versao;

    public MementoDocumento(String titulo, String conteudo, String autor, double versao) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.versao = versao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public double getVersao() {
        return versao;
    }
}
