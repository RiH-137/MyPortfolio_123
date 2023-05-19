package com.example.captrih

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val text= "hello world

        val buttonSkills= findViewById<Button>(R.id.btnskills)
        val links= findViewById<Button>(R.id.btnlink)
        val gitt= findViewById<Button>(R.id.btngit)
        val education=findViewById<Button>(R.id.btneducation)
        val ach=findViewById<Button>(R.id.btnach)


        buttonSkills.setOnClickListener{
            Toast.makeText(this,"Opening Skills", Toast.LENGTH_SHORT).show()
            intent= Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }



        links.setOnClickListener{
            Toast.makeText(this,"Redirecting to LinkedIn", Toast.LENGTH_SHORT).show()
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rishi-rih/")))
        }



        links.setOnClickListener{
            Toast.makeText(this,"Redirecting to GitHub", Toast.LENGTH_SHORT).show()
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/RiH-137")))
        }



        education.setOnClickListener{
            Toast.makeText(this,"Opening Skills", Toast.LENGTH_SHORT).show()

            intent= Intent(this, eduActivity::class.java)
            startActivity(intent)
        }

        val work=findViewById<Button>(R.id.btnwork)

        education.setOnClickListener{
             Toast.makeText(this,"Opening Skills", Toast.LENGTH_SHORT).show()

            intent= Intent(this, workActivity::class.java)
            startActivity(intent)
        }



        education.setOnClickListener{
            Toast.makeText(this,"Opening Skills", Toast.LENGTH_SHORT).show()

            intent= Intent(this, achActivity::class.java)
            startActivity(intent)
        }









    }










}







