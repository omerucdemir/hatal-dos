
package com.example.aiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ImageGeneratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagegenerator)
        title = "Generate images with OpenAI"
    }
}
