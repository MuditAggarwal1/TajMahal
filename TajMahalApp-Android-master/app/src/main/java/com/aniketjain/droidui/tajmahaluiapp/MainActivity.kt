package com.aniketjain.droidui.tajmahaluiapp

import android.graphics.BlurMaskFilter
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aniketjain.droidui.tajmahaluiapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding set up
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Hide status bar
        @Suppress("DEPRECATION")
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

        // set Login Text Light Effect
        setTextToBlur(binding.tvHeadingLight1, 10f)
        setTextToBlur(binding.tvHeadingLight2, 21f)

    }

    // Blur effect for Text
    private fun setTextToBlur(tv: TextView, radius: Float) {
        tv.setLayerType(View.LAYER_TYPE_SOFTWARE, null)
        val filter = BlurMaskFilter(radius, BlurMaskFilter.Blur.OUTER)
        binding.tvHeadingLight1.paint.maskFilter = filter
    }


}