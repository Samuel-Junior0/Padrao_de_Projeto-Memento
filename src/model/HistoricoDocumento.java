package model;

import java.util.Stack;

public class HistoricoDocumento {
    private Stack<MementoDocumento> historico = new Stack<>();

    public void adicionarMemento(MementoDocumento memento) {
        historico.push(memento);
    }

    public MementoDocumento retornarUltimo() {
        if (!historico.empty()) {
            return historico.pop();
        }
        return null;
    }
}
