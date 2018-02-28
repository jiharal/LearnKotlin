package com.s1gu.zzz.learkontlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class homeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun latSatu(view: View) {
        val showSatu = Intent(this, MainActivity::class.java)
        startActivity(showSatu)
    }

    fun latDua(view: View) {
        val showDua = Intent(this, materialDesignActivity::class.java)
        startActivity(showDua)
    }
}
