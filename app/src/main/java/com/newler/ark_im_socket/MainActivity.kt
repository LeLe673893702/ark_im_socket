package com.newler.ark_im_socket

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.newler.im_socket_client.Socket

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val remoteUrl = "ws://ark.dev.17173.com/socket/websocket"

        val url = Uri.parse(remoteUrl).buildUpon()

        val socket = Socket(remoteUrl)
        socket.connect()
        val channel = socket.chan("service: msg", null)
//        url.appendQueryParameter("auth_token", aut)

        val push = channel.join().receive("", {

        }).receive("", {

        })

        channel.on("", {

        }).on("", {

        })
    }
}
