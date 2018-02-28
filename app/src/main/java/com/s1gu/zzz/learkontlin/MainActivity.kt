package com.s1gu.zzz.learkontlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    Button 1 (Toast)
    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello, I'm toast!",Toast.LENGTH_SHORT)
        myToast.show()
    }

//    Button 2 (Count)
    fun countMe (view: View) {
//        Get the text view
        val showCountTextView = findViewById(R.id.textView) as TextView
//        Get the value of the text view.
        val countString = showCountTextView.text.toString()
//    convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++
        showCountTextView.text = count.toString();
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countSting = textView.text.toString()

        val count = Integer.parseInt(countSting)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}
