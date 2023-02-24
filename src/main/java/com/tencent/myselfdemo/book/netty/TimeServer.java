package com.tencent.myselfdemo.book.netty;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeServer {

    public static void main(String[] args) throws IOException {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (Exception e) {

            }
        }
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            log.info("ServerSocket port:{}",port);

            Socket socket = null;
            while (true) {
                socket = server.accept();
                new Thread(new TimeServerHandler(socket)).start();
            }

        } finally {
            if (server != null) {
                log.info("close..");
                server.close();
                server = null;
            }
        }

    }

}
