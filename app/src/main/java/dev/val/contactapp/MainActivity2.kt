package dev.`val`.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import dev.`val`.contactapp.databinding.ActivityMain2Binding
import dev.`val`.contactapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)



    }


        override fun onResume() {
            super.onResume()

            validateSignUp()
            clearErrorOnType()
        }

        fun validateSignUp() {
            val firstName = binding.etName.text.toString()
            val email = binding.etemail.text.toString()
            val phone = binding.etphone.text.toString()
            var error = false

            if (firstName.isBlank()) {
                binding.etName.error = "Name is required"
                error = true
            } else {
                binding.tilName.error = null
            }

            if (email.isBlank()) {
                binding.etemail.error = "Email is required"
                error = true
            } else {
                binding.tilemail.error = null
            }

            if (phone.isEmpty()) {
                binding.etphone.error = "Phone Number is required"
                error = true
            } else {
                binding.tilphone.error = null
            }

            if (!error) {
                Toast.makeText(this, "$firstName $email $phone", Toast.LENGTH_LONG).show()
            }
        }
        fun clearErrorOnType() {
            binding.tilName.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilName.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            })


//
            binding.tilphone.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilphone.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            })

            binding.tilemail.editText?.addTextChangedListener(object : TextWatcher {override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilemail.error = null
                }

                override fun afterTextChanged(s: Editable?) {
                }
            })
        }
    }

