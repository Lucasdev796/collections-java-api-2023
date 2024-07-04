package list.OperacoesBasicas.main.java;

import list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa(List<Tarefa> tarefaList) {
        this.tarefaList = new ArrayList<>();;
    }

        public void adicionarTarefa(String descricao) {
            tarefaList.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);

        public int obterNumeroTotalTarefas() {
            return tarefaList.size();
        }

        public void obterDescricoesTarefas() {
            System.out.println(tarefaList);
        }
    public static void main(String[] args) {
            ListaTarefa listaTarefa = new ListaTarefa(new ArrayList<>());

            System.out.println("O número total de tarefas na lista é: + listaTarefa.obterNumeroTotalTarefas());");

            listaTarefa.adicionarTarefa(descricao: "Tarefa 1")
            listaTarefa.adicionarTarefa(descricao: "Tarefa 2");
            listaTarefa.adicionarTarefa(descricao: "Tarefa 3");
            System.out.println("O número total de tarefas na lista é: + listaTarefa.obterNumeroTotalTarefas());");
        }

    }
