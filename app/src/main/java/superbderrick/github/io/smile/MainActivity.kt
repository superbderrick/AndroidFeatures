package superbderrick.github.io.smile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1
        happyButton.setOnClickListener({
            emotionalFaceView.happinessState = EmotionalFaceView.HAPPY


        })
// 2
        sadButton.setOnClickListener({
            emotionalFaceView.happinessState = EmotionalFaceView.SAD
        })
    }
}
