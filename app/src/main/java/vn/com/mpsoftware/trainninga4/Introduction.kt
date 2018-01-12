package vn.com.mpsoftware.trainninga4

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import vn.com.mpsoftware.trainninga4.Fragment.FragmentOne
import vn.com.mpsoftware.trainninga4.Fragment.FragmentTwo

class Introduction : AppCompatActivity() {

    var isFragmentOneLoaded : Boolean = true
    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.introduction)
        showFragmentOne()
        val btnIntroduction = findViewById<Button>(R.id.btnChange)
        btnIntroduction.setOnClickListener(View.OnClickListener {
            if (isFragmentOneLoaded){
                showFragmentTwo()
            } else {
                showFragmentOne()
            }
        })
    }

    fun showFragmentOne(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentOne()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = true
    }

    fun showFragmentTwo(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentTwo()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentOneLoaded = false
    }
}
