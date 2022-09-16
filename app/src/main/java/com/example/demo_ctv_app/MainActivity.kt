package com.example.demo_ctv_app

import android.R.attr.button
import android.os.Bundle
import android.view.KeyEvent
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.FragmentActivity


/**
 * Loads [MainFragment].
 */
class MainActivity : FragmentActivity() {
    lateinit var up_btn : ImageButton
    lateinit var down_btn : ImageButton
    lateinit var right_btn : ImageButton
    lateinit var left_btn : ImageButton
    lateinit var backward_btn : ImageButton
    lateinit var plau_pause_btn : ImageButton
    lateinit var forward_btn : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        up_btn = findViewById(R.id.up_btn)
        down_btn = findViewById(R.id.down_btn)
        right_btn = findViewById(R.id.right_btn)
        left_btn = findViewById(R.id.left_btn)
        backward_btn = findViewById(R.id.backward_btn)
        plau_pause_btn = findViewById(R.id.play_pause_btn)
        forward_btn = findViewById(R.id.forward_btn)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

        val anim: Animation = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 50
        anim.startOffset = 20
        anim.repeatMode = Animation.REVERSE
        anim.repeatCount = 0

        when (keyCode) {
            KeyEvent.KEYCODE_DPAD_UP -> {
                Toast.makeText(this@MainActivity, "Up key pressed!", Toast.LENGTH_SHORT).show()
                up_btn.startAnimation(anim)
            }
            KeyEvent.KEYCODE_DPAD_DOWN -> {
                Toast.makeText(this@MainActivity, "Down key pressed!", Toast.LENGTH_SHORT).show()
                down_btn.startAnimation(anim)
            }
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                Toast.makeText(this@MainActivity, "Right key pressed!", Toast.LENGTH_SHORT).show()
                right_btn.startAnimation(anim)
            }
            KeyEvent.KEYCODE_DPAD_LEFT -> {
                Toast.makeText(this@MainActivity, "Left key pressed!", Toast.LENGTH_SHORT).show()
                left_btn.startAnimation(anim)
            }
            KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE ->{
                Toast.makeText(this@MainActivity, "Play/Pause key pressed!", Toast.LENGTH_SHORT).show()
                plau_pause_btn.startAnimation(anim)
            }
            KeyEvent.KEYCODE_MEDIA_STEP_FORWARD ->{
                Toast.makeText(this@MainActivity, "Forward key pressed!", Toast.LENGTH_SHORT).show()
                forward_btn.startAnimation(anim)
            }
            KeyEvent.KEYCODE_MEDIA_STEP_BACKWARD ->{
                Toast.makeText(this@MainActivity, "Rewind key pressed!", Toast.LENGTH_SHORT).show()
                backward_btn.startAnimation(anim)
            }
        }

        return false
    }
}