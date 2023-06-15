package dev.`val`.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso
import dev.`val`.contactapp.databinding.ContactlistBinding
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactRvAdapter( var contactlist: List<ContactData>):Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
     var phone =contactlist[position]
        var binding=holder.binding//getting the item at the current position
       binding.tvName.text=phone.name
        binding.tvEmail.text=phone.email
        binding.tvNumber.text=phone.number
        Picasso
            .get()
            .load(phone.avatar)
            .resize(200,200)
            .centerCrop()
//            .transform(CropCircleTransform())
            .transform(CropCircleTransformation())

            .into(binding.ivavatar)
    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}
class ContactViewHolder(var binding: ContactlistBinding):ViewHolder(binding.root){

}