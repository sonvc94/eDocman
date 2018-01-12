package vn.com.mpsoftware.trainninga4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntroduction.setOnClickListener(View.OnClickListener {
            onBtnIntroClick()
        })
    }

    fun onBtnIntroClick(){
        Toast.makeText(this@MainActivity,"Halo", Toast.LENGTH_SHORT).show()
        var intent = Intent(this@MainActivity, Introduction::class.java)
        startActivity(intent)
    }
}
