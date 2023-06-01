package dev.`val`.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import dev.`val`.contactapp.databinding.ContactlistBinding

class ContactRvAdapter( var contactlist: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
     var phone =contactlist[position]
        holder.binding.tvName.text=phone.name
        holder.binding.tvEmail.text=phone.email
        holder.binding.tvNumber.text=phone.number
    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}
class ContactViewHolder(var binding: ContactlistBinding):ViewHolder(binding.root){}