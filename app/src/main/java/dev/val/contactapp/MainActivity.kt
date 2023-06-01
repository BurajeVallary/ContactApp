package dev.`val`.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.`val`.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContact()
    }

    fun displayContact(){
        var contact1=ContactData("Vallary Buraje","val@gmail.com","","+254789457292")
        var contact2=ContactData("Lavin Kageha","kageha@gmail.com","","+254789458902")
        var contact3=ContactData("Mike Oketch","oketch@gmail.com","","+234765457292")
        var contact4=ContactData("Mercy Masian","mercy@gmail.com","","+234609457292")
        var contact5=ContactData("Parkire Wambui","parkire@gmail.com","","+234789457292")
        var contact6=ContactData("Jayden Dalvin","jayd@gmail.com","","+234789657292")
        var contact7=ContactData("Hope Jane","jane@gmail.com","","+234712457292")
        var contact8=ContactData("Mary Wambui","marym@gmail.com","","+234459457292")
        var contact9=ContactData("Mariam Mwadosho","mwadosho@gmail.com","","+234789457292")
        var contact10=ContactData("Zippy Rita","zippy@gmail.com","","+234734457292")
        var contact11=ContactData("Maria Gorreti","maria@gmail.com","","+234738657292")

        var contactlist= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11)
        binding.rvContact.layoutManager=LinearLayoutManager(this)
        var contact=ContactRvAdapter(contactlist)
        binding.rvContact.adapter =contact
    }
}