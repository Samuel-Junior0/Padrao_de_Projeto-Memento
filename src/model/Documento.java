package model;


public class Documento {
    private String titulo;
    private String conteudo;
    private String autor;
    private double versao;

    public Documento(String titulo, String conteudo, String autor) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.versao = 1.0;
    }

    public void alterarConteudo(String novo) {
        System.out.println("Alterando conteúdo...");
        this.conteudo = novo;
        versao += 0.1;
    }

    public void exibirEstado() {
        System.out.printf("""
                Título: %s | Versão: %.2f | Autor: %s
                Conteúdo: %s
                """,titulo, versao, autor, conteudo);
    }

    public MementoDocumento salvar() {
        System.out.println("Salvando documento...");
        return new MementoDocumento(titulo, conteudo, autor, versao);
    }

    public void restaurar(MementoDocumento memento) {
        System.out.println("Restaurando documento...\n");
        this.titulo = memento.getTitulo();
        this.conteudo = memento.getConteudo();
        this.autor = memento.getAutor();
        this.versao = memento.getVersao();

        exibirEstado();
    }
}
