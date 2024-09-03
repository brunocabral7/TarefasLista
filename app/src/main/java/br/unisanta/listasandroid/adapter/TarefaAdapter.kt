package br.unisanta.listasandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listasandroid.R
import br.unisanta.listasandroid.model.Tarefa

class TarefaAdapter(private val tarefas: List<Tarefa>) :
    RecyclerView.Adapter<TarefaAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txvNome: TextView = itemView.findViewById(R.id.txv_nome_tarefa)
        val txvDescricao: TextView = itemView.findViewById(R.id.txv_descricao_usuario)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_usuario, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val usuario = tarefas[position]
        holder.txvNome.text = usuario.nome
        holder.txvDescricao.text = usuario.descricao
    }

    override fun getItemCount(): Int {
        return tarefas.size
    }
}