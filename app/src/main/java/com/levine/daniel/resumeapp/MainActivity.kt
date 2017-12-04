package com.levine.daniel.resumeapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var experience = findViewById<Button>(R.id.experienceButton)

        experience.setOnClickListener {
            var moveToExperience = Intent(getApplicationContext(), ExperienceActivity::class.java)
            startActivity(moveToExperience)

        }

        var callDan = findViewById<Button>(R.id.callButton)
        var phoneUri = Uri.parse("tel: 18583573700")
        callDan.setOnClickListener {
            var callIntent = Intent(Intent.ACTION_DIAL,phoneUri)
            startActivity(callIntent)
        }

        var emailDan = findViewById<Button>(R.id.emailButton)
        emailDan.setOnClickListener {
            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "dannymlevine@aol.com")

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice Resume")


            emailIntent.putExtra(Intent.EXTRA_TEXT, "I really enjoyed your resume...")
            startActivity(emailIntent)
        }


    }
}
