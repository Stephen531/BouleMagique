package com.example.stephen.projet1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.number_picker.*
import org.jetbrains.anko.toast

class NumberPicker : AppCompatActivity() {
    companion object {
        var number : Int = 1

    }


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.number_picker)

        number_picker.minValue = 1
        number_picker.maxValue = 5
        number_picker.wrapSelectorWheel = false

        var button = findViewById<Button>(R.id.Valider)

        number_picker.setOnValueChangedListener { picker, oldVal, newVal ->

            //Display the newly selected number to text view
            text_view.text = "Vitesse de la balle : $newVal "

        }
        button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                var intent = Intent(this@NumberPicker, ActivityBall::class.java)
                number = number_picker.value
                startActivity(intent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when(item?.itemId){
            R.id.Accueil ->  {
                toast("Bienvenue sur la page acceuil")
                var intent = Intent(this, MainActivity::class.java)
                finishActivity(0)
                startActivity(intent)
                return true

            }
            else -> {print("Bonjour")
                true
            }

        }
    }
}