package haloustadz.com.kotlin1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.util.*

class TestAnko : AppCompatActivity(){

    var tvHasil :TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO Menggunakan Anko Layout
        linearLayout{
            orientation = LinearLayout.VERTICAL
            val etBirthYear = editText{
                hint = "Enter Your birth year"
            }
            val button = button {
                text = "Find My Age"
                onClick {
                    //mendapatkan tahun saat ini
                    val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)
                    val tahunLahir = etBirthYear.text.toString()
                    var userAge = 0
                    if(tahunLahir.toIntOrNull()!=null){
                        userAge = tahunSekarang - tahunLahir.toInt()
                    }
                    else{


                    }
                    //TODO : Hitung tahun sekarang - tahun lahir

                    //TODO Set umur ke tvAgeResult
                    tvHasil?.text = "Your Age is : $userAge years old"

                }
            }
            tvHasil = textView{
                verticalPadding = dip(20)
                text = "your age is : 0 years old"
            }
        }
    }
}