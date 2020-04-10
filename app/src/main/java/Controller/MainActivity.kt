package Controller

import Models.DatosContactos
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    private  lateinit var ricyclerViewAdapter : RicyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniRecyclerView()
        addDateSet()
    }

    private fun addDateSet(){
        val data = DatosContactos.createDataSet()
        ricyclerViewAdapter.submitList(data)
    }

    private fun iniRecyclerView(){
        rv_contacts.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            ricyclerViewAdapter = RicyclerViewAdapter()
            adapter = ricyclerViewAdapter
        }
    }
}
