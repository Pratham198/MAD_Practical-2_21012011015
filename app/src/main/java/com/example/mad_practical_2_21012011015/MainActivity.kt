package com.example.mad_practical_2_21012011015

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate() is called")

    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume() is called")
    }
    fun showMessage(message: String)
    {
        Log.i(TAG, message )
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
        val Constraint:ConstraintLayout? = findViewById(R.id.mainConstraint)
        if (Constraint != null )
        {
            Snackbar.make(Constraint,message,Snackbar.LENGTH_SHORT).show()
        }
    }

}