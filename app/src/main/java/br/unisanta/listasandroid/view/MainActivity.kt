package br.unisanta.listasandroid.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.unisanta.listasandroid.R
import br.unisanta.listasandroid.dao.TarefaDao
import br.unisanta.listasandroid.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    val dao = TarefaDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtDescricao = findViewById<EditText>(R.id.edt_descricao)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val fabAvanca = findViewById<FloatingActionButton>(R.id.fab_avanca)

        btnCadastrar.setOnClickListener {
            val nome = edtNome.text.toString()
            val descricao = edtDescricao.text.toString()

            val tarefa = Tarefa(nome, descricao)
            dao.adicionarUsuario(tarefa)

            edtNome.text.clear()
            edtDescricao.text.clear()

            Toast.makeText(this, "Tarefa Cadastrada Com Sucesso!", Toast.LENGTH_LONG).show()
        }

        fabAvanca.setOnClickListener {
            val intent = Intent(this, ListaTarefasActivity::class.java)
            startActivity(intent)
        }
    }
}
