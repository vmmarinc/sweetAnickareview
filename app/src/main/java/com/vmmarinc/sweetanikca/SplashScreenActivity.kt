package com.vmmarinc.sweetanikca

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView



class SplashScreenActivity : AppCompatActivity() {

    private lateinit var splash: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        splash = findViewById<LottieAnimationView>(R.id.splashscreen)

    }

    override fun onStart() {
        super.onStart()
        splash.imageAssetsFolder = "image"
        splash.playAnimation()
        splash.addAnimatorListener(object: Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                startActivity(intent)

            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }
        })
    }
}