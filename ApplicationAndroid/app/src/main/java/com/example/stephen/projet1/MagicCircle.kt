package com.example.stephen.projet1


import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.toast
import android.graphics.Paint
import android.view.View


data class MagicCircle(val maxX: Float, val maxY: Float, val vitesse: Int) : AppCompatActivity(), AnkoLogger {
    var cx: Float = 50F
    var cy: Float = 50F
    val rad: Float = 40F
    var delta = 7 * vitesse
    var dx = delta
    var dy = delta


    fun move(){
        when {
            cx<0F -> dx=delta
            cx>maxX -> dx=-delta
            cy<0F -> dy=delta
            cy>maxY -> dy=-delta
        }
        cx += dx
        cy += dy
    }



}