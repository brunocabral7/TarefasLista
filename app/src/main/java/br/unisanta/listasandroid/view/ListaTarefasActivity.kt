package br.unisanta.listasandroid.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listasandroid.R
import br.unisanta.listasandroid.adapter.TarefaAdapter
import br.unisanta.listasandroid.dao.TarefaDao

class ListaTarefasActivity : AppCompatActivity() {
    val dao = TarefaDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_tarefas)
        val rvTarefas = findViewById<RecyclerView>(R.id.rv_tarefas)
        val usuarios = dao.obterUsuarios()
        rvTarefas.layoutManager = LinearLayoutManager(this)
        rvTarefas.adapter = TarefaAdapter(usuarios)
    }
}