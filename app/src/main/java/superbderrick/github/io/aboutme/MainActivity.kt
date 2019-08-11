package superbderrick.github.io.aboutme

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*
import superbderrick.github.io.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val personalInformation : PersonalInformation = PersonalInformation("Derrick")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personalInformation = personalInformation

        binding.doneButton.setOnClickListener {
            insetPersonalInformation(it)
        }

    }

    private fun insetPersonalInformation(view:View) {

        binding.apply {
            personalInformation?.nickname = "SuperbDerrick"
            personalInformation?.job = "Software Engineer"
            personalInformation?.age = "30"

            invalidateAll()


            nicknameText.visibility = View.VISIBLE
            job_text.visibility = View.VISIBLE
            age_text.visibility = View.VISIBLE
            doneButton.visibility = View.GONE

            hideKeyboard(view)
        }

    }

    private fun hideKeyboard(view:View) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }

}
