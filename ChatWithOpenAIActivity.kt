
package com.example.aiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ChatWithOpenAIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatwithopenai)
        title = "Chat with OpenAI GPT"
    }
}
