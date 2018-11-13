package haloustadz.com.kotlin1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        //TODO :Sembunyikan tvAgeResult
        tvAgeResult.visibility = View.INVISIBLE

        //TODO :Beri Event Klik Ke Button
        btnFindMyAge.setOnClickListener{
            //Mendapatkan Tahun Saat ini
            val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)

            //TODO : Hitung (Tahun Sekarang - Tahun Lahir)
            val userAge = tahunSekarang - etBirthYear.text.toString().toInt()

            //TODO : set hasil ke textVIew
            tvAgeResult.text = "Your age is : $userAge years old"

            //TODO : tampilkan text RESULT
            tvAgeResult.visibility = View.VISIBLE
        }
    }
}
