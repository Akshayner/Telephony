package com.akshay.telephony

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.AlertDialogLayout
import kotlinx.android.synthetic.main.activity_email.*

class EmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        b1.setOnClickListener {
            AlertDialogLayout(this, )
        }

        send.setOnClickListener {
            val i = Intent()
            i.putExtra(Intent.EXTRA_EMAIL,et1.text.toString())
            i.putExtra(Intent.EXTRA_SUBJECT,et2.text.toString())
            i.putExtra(Intent.EXTRA_TEXT,et3.text.toString())
            i.putExtra(Intent.EXTRA_STREAM,)
            i.type = "message/rfc822"
            startActivity(i)
        }
    }
}
