package kr.hs.emirim.kkhhss.viewflippertest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPrev = findViewById<Button>(R.id.btnPrev)
        var btnNext = findViewById<Button>(R.id.btnNext)
        var flipper = findViewById<ViewFlipper>(R.id.flipper)

        btnPrev.setOnClickListener{
            flipper.showPrevious()
        }
        btnNext.setOnClickListener{
            flipper.showNext()
        }
    }
}