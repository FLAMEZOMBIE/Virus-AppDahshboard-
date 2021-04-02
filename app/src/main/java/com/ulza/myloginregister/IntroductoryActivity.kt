package com.ulza.myloginregister

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.lottie.LottieAnimationView


class IntroductoryActivity : AppCompatActivity() {

    lateinit var logo:ImageView
    lateinit var appName:ImageView
    lateinit var splashImg:ImageView
    lateinit var lottieAnimationView: LottieAnimationView
    lateinit var task: LottieAnimationView
    lateinit var task2: LottieAnimationView
    lateinit var const: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)
        logo = findViewById(R.id.Logo);
        appName = findViewById(R.id.app_name);
        splashImg = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lottie);
        task = findViewById(R.id.TaskAnim)
        task2 = findViewById(R.id.TaskAnim2)
        const = findViewById(R.id.constlontie)

        splashImg.animate().translationY(-2500f).setDuration(2000).startDelay = 5000;
        appName.animate().translationY(-2500f).setDuration(2000).startDelay = 5000;
        lottieAnimationView.animate().translationY(-2000f).setDuration(2000).startDelay = 5000;
        logo.animate().translationY(-2000f).setDuration(2000).startDelay = 5000;

      /*object : CountDownTimer(4000, 1000) {
            override fun onTick(millisUntilFinished: Long) {

            }
          override fun onFinish() {
              startActivity(Intent(this@IntroductoryActivity, MainActivity::class.java)) }
      }.start()*/
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home ->Toast.makeText(this, "ulzaparamarta@gmail.com", Toast.LENGTH_SHORT).show()
            R.id.settting ->Toast.makeText(this, "This is Setting", Toast.LENGTH_SHORT).show()
            R.id.user ->Toast.makeText(this, "This is User Profile", Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }

}