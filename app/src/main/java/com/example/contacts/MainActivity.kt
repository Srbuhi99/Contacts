package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolBar)

        fab.setOnClickListener { view ->
            Snackbar.make(view,"Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
        }

        navController = Navigation.findNavController(this,R.id.nav_host_fragment)
        navController.navigate(R.id.contactGroupsFragment)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.action_settings-> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
