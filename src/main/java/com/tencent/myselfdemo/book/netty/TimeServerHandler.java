package com.tencent.myselfdemo.book.netty;

import java.net.Socket;

public class TimeServerHandler implements Runnable{

    private Socket socket;

    public TimeServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
