package dev.`val`.contactapp

import android.content.Intent
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
       binding.tvlogin.setOnClickListener{
           openMainActivity2()
       }
    }

    override fun onResume() {
        super.onResume()
        displayContact()
    }

    fun displayContact(){
        var contact1=ContactData("https://images.unsplash.com/photo-1599664066534-6c3fe3e97d6b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Vallary Buraje","vallary@gmail.com","0723847470")
        var contact2=ContactData("https://images.unsplash.com/photo-1588694673509-be778c806a6d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Joyce Kim","joyce@gmail.com","0712345567")
        var contact3=ContactData("https://images.unsplash.com/photo-1525715843408-5c6ec44503b1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Jane Doe","janedoe@gmail.com","0789474793")
        var contact4=ContactData("https://images.unsplash.com/photo-1593351799227-75df2026356b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=395&q=80","Mercy Masika","mmasika@gmail.com","0723847401")
        var contact5=ContactData("https://images.unsplash.com/photo-1539702169544-c0bcff87fcd7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1315&q=80","Lavin Kageha","lavinkageha","0793847477")
        var contact6=ContactData("https://images.unsplash.com/photo-1632759214191-c0460af60b47?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Masian Parkire","masia@gmail.com","0773847417")
        var contact7=ContactData("https://images.unsplash.com/photo-1599664066708-64d37e6438f3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Jackline Adamba","jackyada@gmail.com","0753847409")
        var contact8=ContactData("https://images.unsplash.com/photo-1538330627166-33d1908c210d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Eunice Musenya","eunicem@gmail.com","0790847467")
        var contact9=ContactData("https://images.unsplash.com/photo-1523673671576-35ff54e94bae?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Rita Khayesi","rita@gmail.com","0713847437")
        var contact10=ContactData("https://images.unsplash.com/photo-1562615992-6289cfc36f2c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Mitingi Joy","mitingi@gmail.com","0753847930")
        var contact11=ContactData("https://images.unsplash.com/photo-1584720205607-82d281ec08f8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Mercy Dalvin","dalvin@gmail.com","0745384764")




    var contactlist= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11)
    binding.rvContact.layoutManager=LinearLayoutManager(this)
    var contact=ContactRvAdapter(contactlist)
    binding.rvContact.adapter =contact


    }
    fun  openMainActivity2(){
        val intent=Intent(this,MainActivity2::class.java)
//        val intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}