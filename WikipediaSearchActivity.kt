
package com.example.aiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class WikipediaSearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wikipediasearch)
        title = "Wikipedia search"
    }
}
