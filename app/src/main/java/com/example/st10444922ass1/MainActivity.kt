package com.example.st10444922ass1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val compareButton = findViewById<Button>(R.id.compareButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        var ageEditText: EditText = findViewById<EditText>(R.id.ageEditText)
        var resultTextView=findViewById<EditText>(R.id.resultTextView)

        //add code to the button when  it is clicked
        compareButton.setOnClickListener {

            //align the text in the ageEditText to variable userInput
            val userInput=ageEditText.text.toString()

            //check if the user typed in an age
            if (userInput.isEmpty()) {
              val resultTextView = "Please enter a valid age- it must be a whole number without any decimals or text"}

                //store age in variable
                val userAge = userInput.toIntOrNull()

                //check if the age is not a valid integer
                if (userAge == null) {
                    val resultTextView= "Please enter a valid age- it must be a whole number without any decimals or text"
                } else {
                    //check if the age is the correct range
                    if (userAge < 20 || userAge > 100) {
                        val resultTextView= "Please enter an age between 20 and 100."
                        ageEditText.text.clear()
                    } else {
                        //use when to check for age
                        val result = when (userAge) {
                            34 -> "Rikhado Muziwendlovu Chifaro Makhado known as Riky Rick was a south African rapper, singer, songwriter, record producer and rentrepreur as hew was also the founder and owner of record label Cotton Club Records, died at the age of 34."
                            41 -> "Virgil Abloh was an American fashion designer and entrepreneur, died at the age of 34."
                            35 -> "Kiernan Jarryd also known as AKA was a South African rapper, record producer and businessman, died at the age of 35."
                            43 -> "Chadwick Boseman was an American actor died at the age of 43."
                            67 -> "George Washington was an American Founding Father, military officer, and politician who served as the first president of the United States from 1789 to 1797. Appointed by the Second Continental Congress as commander of the Continental Army in 1775, Washington led Patriot forces to victory in the American Revolutionary War and then served as president of the Constitutional Convention in 1787, which drafted and ratified the Constitution of the United States and established the U.S. federal government, died at the age of 67."
                            42 -> "Elvis Presley was an American singer and actor,died at the age of 42."
                            62 -> "Dexter King was an American civil and animal rights activist, attorney, and author, died at the age of 62."
                            33 -> "Ermias Joseph Asgehedom known as Nipsey Hussel was an American rapper, entrepreneur and activist, died at the age o 33."
                            76 -> "Albert Einstein was a famous theoretical physicist, died at the age of 76"
                            36 -> "Diana, Princess of Wales was a member of the British royal family. She was the first wife of Charles III (then Prince of Wales) and mother of Princes William and Harry, died at the age of 36."
                            else -> "Nobody known to me died at this age."
                        }
                        //show output to user
                        val resultTextView  = result

                    }
                }
            }
            //clear out the resultTextView annd the ageEditText on the Clear button click
            clearButton.setOnClickListener {
                ageEditText.text.clear()
                val resultTextView = ""


            }
        }


    }








