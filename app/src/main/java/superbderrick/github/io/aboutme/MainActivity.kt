package superbderrick.github.io.aboutme

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import superbderrick.github.io.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val personalInforamtion : PersonalInforamtion = PersonalInforamtion("Derrick")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personalInforamtion = personalInforamtion

        binding.doneButton.setOnClickListener {
            addNickName(it)
        }

    }

    private fun addNickName(view:View) {

        binding.apply {
            personalInforamtion?.nickname = nicknameEdit.text.toString()


            invalidateAll()

            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE

            nicknameText.visibility = View.VISIBLE

            hideKeyboard(view)
        }

    }

    private fun hideKeyboard(view:View) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)


    }

}
