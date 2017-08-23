package com.example.truongtvd.testfragment

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        registerReceiver(broadcast, IntentFilter("hihi"))
        supportFragmentManager.beginTransaction().add(R.id.fragment,BlankFragment()).commit()
        supportFragmentManager.addOnBackStackChangedListener {
            Log.e("h","addOnBackStackChangedListener")
            if (supportFragmentManager.backStackEntryCount > 0){
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }else{
                supportActionBar?.setDisplayHomeAsUpEnabled(false)

            }
        }
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            android.R.id.home ->{
                onBackPressed()
            }
        }

        return super.onOptionsItemSelected(item)
    }
    override fun onDestroy() {
        super.onDestroy()
//        unregisterReceiver(broadcast)
    }
}
