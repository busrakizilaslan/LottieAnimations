package com.busrayalcin.lottieanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    var isChecked = false
    var isSwitched = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var checkAnimation = findViewById<LottieAnimationView>(R.id.checkAnimation)
        var switchAnimation = findViewById<LottieAnimationView>(R.id.switchAnimation)

        checkAnimation.setOnClickListener {
            if (isChecked) {
                checkAnimation.speed = -1f
                checkAnimation.playAnimation()
                isChecked = false
            } else {
                checkAnimation.speed = 1f
                checkAnimation.playAnimation()
                isChecked = true
            }
        }

        checkAnimation.setOnClickListener {
            if (isSwitched) {
                switchAnimation.setMinAndMaxProgress(0.5f, 1.0f)
                switchAnimation.playAnimation()
                isSwitched = false
            } else {
                switchAnimation.setMinAndMaxProgress(0.0f, 1.0f)
                switchAnimation.playAnimation()
                isSwitched = true
            }
        }
    }
}