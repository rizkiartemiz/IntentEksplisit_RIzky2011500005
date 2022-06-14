package com.example.intenteksplisit_rizky2011500005
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNIM = findViewById<EditText>(R.id.etNIM)
        val etNAMA = findViewById<EditText>(R.id.etNAMA)
        val buttonproses = findViewById<Button>(R.id.buttonproses)

        buttonproses.setOnClickListener {
            if ("${etNIM.text}".isNotEmpty() && "${etNAMA.text}".isNotEmpty()) {
                val i = Intent(this@MainActivity, TampilDataActivity::class.java)
                i.putExtra("NIM", "${etNIM.text}")
                i.putExtra("Nama", "${etNAMA.text}")
                startActivity(i)
            } else
                Toast.makeText(this@MainActivity,"NIM atau nama belum diisi", Toast.LENGTH_SHORT).show()
        }
    }
}