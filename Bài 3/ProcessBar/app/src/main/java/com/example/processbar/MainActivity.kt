package com.example.processbar
import android.os.Bundle
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.github.ybq.android.spinkit.style.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar1: ProgressBar = findViewById(R.id.process_bar_1)
        val progressBar2: ProgressBar = findViewById(R.id.process_bar_2)
        val progressBar3: ProgressBar = findViewById(R.id.process_bar_3)
        val progressBar4: ProgressBar = findViewById(R.id.process_bar_4)
        val progressBar5: ProgressBar = findViewById(R.id.process_bar_5)
        val progressBar6: ProgressBar = findViewById(R.id.process_bar_6)
        val progressBar7: ProgressBar = findViewById(R.id.process_bar_7)
        val progressBar8: ProgressBar = findViewById(R.id.process_bar_8)
        val progressBar9: ProgressBar = findViewById(R.id.process_bar_9)
        val progressBar10: ProgressBar = findViewById(R.id.process_bar_10)
        val progressBar11: ProgressBar = findViewById(R.id.process_bar_11)
        val progressBar12: ProgressBar = findViewById(R.id.process_bar_12)

        val doubleBounce = DoubleBounce()
        progressBar1.indeterminateDrawable = doubleBounce
        val rotatingPlane = RotatingPlane()
        progressBar2.indeterminateDrawable = rotatingPlane
        val wave = Wave()
        progressBar3.indeterminateDrawable = wave
        val wanderingCubes = WanderingCubes()
        progressBar4.indeterminateDrawable = wanderingCubes
        val pulse = Pulse()
        progressBar5.indeterminateDrawable = pulse
        val chasingDots = ChasingDots()
        progressBar6.indeterminateDrawable = chasingDots
        val threeBounce = ThreeBounce()
        progressBar7.indeterminateDrawable = threeBounce
        val circle = Circle()
        progressBar8.indeterminateDrawable = circle
        val cubeGrid = CubeGrid()
        progressBar9.indeterminateDrawable = cubeGrid
        val fadingCircle = FadingCircle()
        progressBar10.indeterminateDrawable = fadingCircle
        val foldingCube = FoldingCube()
        progressBar11.indeterminateDrawable = foldingCube
        val rotatingCircle = RotatingCircle()
        progressBar12.indeterminateDrawable = rotatingCircle



    }


}


