
package com.example.aiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ChatWithLLaMAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatwithllama)
        title = "Chat with Meta LLaMA"
    }
}
