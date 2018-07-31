package com.akshay.telephony

import android.app.PendingIntent
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        sms.setOnClickListener{
            var numbers= et1.text.toString().split(",")
            for (num in numbers) {
                var a = Intent(this@MainActivity, SentActivity::class.java)
                var sp = PendingIntent.getActivity(this@MainActivity, 123, a, 0)

                var b = Intent(this@MainActivity, DeliverActivity::class.java)
                var dp = PendingIntent.getActivity(this@MainActivity, 123, b, 0)


                var sm = SmsManager.getDefault()
                sm.sendTextMessage(num, null, et2.text.toString(), sp, dp)
            }
        }

        call.setOnClickListener{
            var i = Intent()
            i.action = Intent.ACTION_CALL
            i.data = Uri.parse("tel:"+et1.text.toString())
            startActivity(i)
        }

        email.setOnClickListener {
            var c = Intent(this@MainActivity,EmailActivity::class.java)
            startActivity(c)
        }
    }
}
