package Controller

import Models.Contacto
import Models.DatosContactos
import android.graphics.Color.rgb
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.R
import kotlinx.android.synthetic.main.contact_list.view.*

class RicyclerViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<Contacto> = ArrayList()

    //This Function create all Contats
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ContactViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.contact_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ContactViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }

    //This function get the number off elemtns in the list
    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(contactos: List<Contacto>){
        items = contactos
    }

    //Here we can set all values for each Contact
    class ContactViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView){
        //val user_image = itemView.user_image
        val user_name = itemView.user_name
        val user_number = itemView.user_number
        var container = itemView.container


        fun bind(contacto: Contacto){
            user_name.setText(contacto.getFulName())
            user_number.setText(contacto.getNumber())
            container.setBackgroundColor(rgb((0..255).shuffled().first(), (0..255).shuffled().first(), (0..255).shuffled().first()))

        }
    }
}