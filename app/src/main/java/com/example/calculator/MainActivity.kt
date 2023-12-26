package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val display = findViewById(R.id.tv_id) as TextView


        var a1 = findViewById(R.id.a1) as Button
        var a2 = findViewById(R.id.a2) as Button
        var a3 = findViewById(R.id.a3) as Button
        var a4 = findViewById(R.id.a4) as Button
        var a5 = findViewById(R.id.a5) as Button
        var a6 = findViewById(R.id.a6) as Button
        var a7 = findViewById(R.id.a7) as Button
        var a8 = findViewById(R.id.a8) as Button
        var a9 = findViewById(R.id.a9) as Button
        var a0 = findViewById(R.id.a0) as Button
        var s1 = findViewById(R.id.s1) as Button
        var s2 = findViewById(R.id.s2) as Button
        var s3 = findViewById(R.id.s3) as Button
        var s4 = findViewById(R.id.s4) as Button


        a1.setOnClickListener{
            display.setText("1")

            a2.setOnClickListener{
                display.setText("2")

                a3.setOnClickListener{
                    display.setText("3")

                    a4.setOnClickListener{
                        display.setText("4")

                        a5.setOnClickListener{
                            display.setText("5")

                            a6.setOnClickListener{
                                display.setText("6")

                                a7.setOnClickListener{
                                    display.setText("7")

                                    a8.setOnClickListener{
                                        display.setText("8")

                                        a9.setOnClickListener{
                                            display.setText("9")

                                            a0.setOnClickListener{
                                                display.setText("0")

                                                s1.setOnClickListener{
                                                    display.setText("+")


                                                    s2.setOnClickListener {
                                                        display.setText("-")

                                                        s3.setOnClickListener {
                                                            display.setText("*")

                                                            s4.setOnClickListener {
                                                                display.setText("/")


                                                            }
                                                        }
                                                    }
                                                    }
}
}   }
}
}
}
}
}
}
}
}
}
