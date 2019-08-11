package superbderrick.github.io.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImageView: ImageView
    lateinit var rollButton:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        diceImageView= findViewById(R.id.dice_image)

        rollButton.text = "Let's Roll"
        rollDice()

        rollButton.setOnClickListener {
            rollDice();
        }

        }

    private fun rollDice() {

        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImageView.setImageResource(drawableResource)

    }
}



