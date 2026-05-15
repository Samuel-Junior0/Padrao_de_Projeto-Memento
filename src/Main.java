import model.Documento;
import model.HistoricoDocumento;
import model.MementoDocumento;

public class Main {
    public static void main(String[] args) {
        Documento documento1 = new Documento(
                "Programação", "Bastante coisa sobre java", "Kojima Productions");
        HistoricoDocumento historico = new HistoricoDocumento();

        documento1.exibirEstado();
        historico.adicionarMemento(documento1.salvar());

        documento1.alterarConteudo("Muito mais coisa sobre java");
        historico.adicionarMemento(documento1.salvar());

        documento1.alterarConteudo("Conteúdo sobre javaScript :/");
        documento1.exibirEstado();

        MementoDocumento restaurador = historico.retornarUltimo();

        if (restaurador != null) {
            documento1.restaurar(restaurador);
        }

    }
}
