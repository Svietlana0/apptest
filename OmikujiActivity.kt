package jp.wings.nikkeibp.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OmikujiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    //文字を表示
        val str = "大吉"
        hello_view.text = str
        val rnd = Ranom()
        val number = rnd.nextInt(3)
        hello_view.text = "$str 乱数 ${number + 1}"
        if( number == 0) {
            str = "吉"
        } else if (number == 1){
            str = "吉"}


        }
    }
    }