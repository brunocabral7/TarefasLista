package br.unisanta.listasandroid.dao

import br.unisanta.listasandroid.model.Tarefa

class TarefaDao {
    companion object{
        private val tarefas = mutableListOf<Tarefa>()
    }
    fun adicionarUsuario(tarefa:Tarefa){
        Companion.tarefas.add(tarefa)
    }
    fun obterUsuarios():List<Tarefa>{
        return Companion.tarefas
    }
}