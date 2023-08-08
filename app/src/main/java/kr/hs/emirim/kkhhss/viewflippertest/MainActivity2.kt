package kr.hs.emirim.kkhhss.viewflippertest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btnStart = findViewById<Button>(R.id.btnStart)
        var btnStop = findViewById<Button>(R.id.btnStop)
        var flipper = findViewById<ViewFlipper>(R.id.flipper)
        flipper.flipInterval = 1000

        btnStart.setOnClickListener{
            flipper.startFlipping()
        }
        btnStop.setOnClickListener{
            flipper.stopFlipping()
        }
    }
}