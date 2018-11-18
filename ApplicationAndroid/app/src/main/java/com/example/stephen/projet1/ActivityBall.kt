package com.example.stephen.projet1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import org.jetbrains.anko.toast
import java.sql.Time

class ActivityBall : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.magic_ball)

        var intent = getIntent()

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