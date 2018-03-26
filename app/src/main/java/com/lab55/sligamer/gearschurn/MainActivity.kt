package com.lab55.sligamer.gearschurn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView

/**
 * Created by Justin Freres on 3/24/2018.
 * Lab 5-5 Gears Churn Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class MainActivity : AppCompatActivity() {

    // DECLARE VARIABLES
    lateinit var gear1Img: ImageView
    lateinit var gear2Img: ImageView

    lateinit var gear1: Gear
    lateinit var gear2: Gear

    var currentDegree: Float = 0.0f
    var degree: Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // GET THE GEAR IMAGE VIEWS
        gear1Img = findViewById(R.id.imageView_smGear)
        gear2Img = findViewById(R.id.imageView_lgGear)

        initializeGears()
    }

    private fun initializeGears() {

        // GEAR 1 WILL MOVE IN THE CLOCKWISE DIRECTION
        gear1 = Gear()
        gear1.setStartDegree(0)
        gear1.setEndDegree(360)

        // GEAR 2 WILL MOVE IN A COUNTER-CLOCKWISE DIRECTION
        gear2 = Gear()
        gear2.setStartDegree(0)
        gear2.setEndDegree(-360)

    }

    fun animateGears(view: View)
    {
        var DELAY = 1000

        var ra1 = RotateAnimation(gear1.getStartDegree().toFloat(), gear1.getEndDegree().toFloat(), Animation.RELATIVE_TO_SELF, 0.5F, Animation.RELATIVE_TO_SELF, 0.5F)
        ra1.duration = DELAY.toLong()
        ra1.fillAfter = true
        gear1Img.startAnimation(ra1)

        var ra2 = RotateAnimation(gear2.getStartDegree().toFloat(), gear2.getEndDegree().toFloat(), Animation.RELATIVE_TO_SELF, 0.5F, Animation.RELATIVE_TO_SELF, 0.5F)
        ra2.duration = DELAY.toLong()
        ra2.fillAfter = true
        gear2Img.startAnimation(ra2)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        val id = item!!.itemId
        if(id == R.string.action_settings){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
