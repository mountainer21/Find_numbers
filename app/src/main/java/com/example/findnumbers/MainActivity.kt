package com.example.findnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.TextView
import com.example.findnumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var count = 1

        binding.apply {

            fun game() {
                chronometer.base = SystemClock.elapsedRealtime()
                chronometer.start()
                count = 1
                textCount.text = count.toString()
//                var numRand = (1..40).toMutableList()
                var numRand = MutableList(40) {  x -> "${x+1}" }
                var viewRand = listOf(textView1, textView2, textView3, textView4, textView5, textView6,
                    textView7, textView8, textView9, textView10, textView11, textView12, textView13,
                    textView14, textView15, textView16, textView17, textView18, textView19, textView20,
                    textView21, textView22, textView23, textView24, textView25, textView26, textView27,
                    textView28, textView29, textView30, textView31, textView32, textView33, textView34,
                    textView35, textView36, textView37, textView38, textView39, textView40)
//                var viewRand2 = MutableList(40) {x -> "textView${x+1}"}
                var shList = numRand.shuffled()
                for (i in shList.indices)
                    viewRand[i].text = shList[i]
//                  viewRand2[i].text = shList[i]
            }

            fun textViewClick (textView: TextView) {
                if (count.toString() == textView.text) {
                    textView.text = ""
                    count++
                    textCount.text = count.toString()
                    if (count == 25)
                        chronometer.stop()
                }
            }

            game()

            btnStart.setOnClickListener {
                game()
            }

            textView1.setOnClickListener {
                textViewClick(textView1)
            }
            textView2.setOnClickListener {
                textViewClick(textView2)
            }
            textView3.setOnClickListener {
                textViewClick(textView3)
            }
            textView4.setOnClickListener {
                textViewClick(textView4)
            }
            textView5.setOnClickListener {
                textViewClick(textView5)
            }
            textView6.setOnClickListener {
                textViewClick(textView6)
            }
            textView7.setOnClickListener {
                textViewClick(textView7)
            }
            textView8.setOnClickListener {
                textViewClick(textView8)
            }
            textView9.setOnClickListener {
                textViewClick(textView9)
            }
            textView10.setOnClickListener {
                textViewClick(textView10)
            }
            textView11.setOnClickListener {
                textViewClick(textView11)
            }
            textView12.setOnClickListener {
                textViewClick(textView12)
            }
            textView13.setOnClickListener {
                textViewClick(textView13)
            }
            textView14.setOnClickListener {
                textViewClick(textView14)
            }
            textView15.setOnClickListener {
                textViewClick(textView15)
            }
            textView16.setOnClickListener {
                textViewClick(textView16)
            }
            textView17.setOnClickListener {
                textViewClick(textView17)
            }
            textView18.setOnClickListener {
                textViewClick(textView18)
            }
            textView19.setOnClickListener {
                textViewClick(textView19)
            }
            textView20.setOnClickListener {
                textViewClick(textView20)
            }
            textView21.setOnClickListener {
                textViewClick(textView21)
            }
            textView22.setOnClickListener {
                textViewClick(textView22)
            }
            textView23.setOnClickListener {
                textViewClick(textView23)
            }
            textView24.setOnClickListener {
                textViewClick(textView24)
            }
            textView25.setOnClickListener {
                textViewClick(textView25)
            }
            textView26.setOnClickListener {
                textViewClick(textView26)
            }
            textView27.setOnClickListener {
                textViewClick(textView27)
            }
            textView28.setOnClickListener {
                textViewClick(textView28)
            }
            textView29.setOnClickListener {
                textViewClick(textView29)
            }
            textView30.setOnClickListener {
                textViewClick(textView30)
            }
            textView31.setOnClickListener {
                textViewClick(textView31)
            }
            textView32.setOnClickListener {
                textViewClick(textView32)
            }
            textView33.setOnClickListener {
                textViewClick(textView33)
            }
            textView34.setOnClickListener {
                textViewClick(textView34)
            }
            textView35.setOnClickListener {
                textViewClick(textView35)
            }
            textView36.setOnClickListener {
                textViewClick(textView36)
            }
            textView37.setOnClickListener {
                textViewClick(textView37)
            }
            textView38.setOnClickListener {
                textViewClick(textView38)
            }
            textView39.setOnClickListener {
                textViewClick(textView39)
            }
            textView40.setOnClickListener {
                textViewClick(textView40)
            }
        }
    }
}