package ru.kitosina.novosoft.Client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ThreadClient implements Runnable {

    private Integer timeOut;
    private Integer idClient;
    private String messageClient;
    private BufferedWriter bw;

    public ThreadClient(Integer timeOut, Integer idClient, String messageClient, BufferedWriter bw) {
        this.timeOut = timeOut * 1000;
        this.idClient = idClient;
        this.messageClient = messageClient;
        this.bw = bw;
    }

    private synchronized void writeMessageInFile(String message) throws IOException {
        bw.write(message);
        bw.flush();
        bw.newLine();
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(timeOut);
                Date now = new Date();
                String time = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(now).concat("; ");
                String writeMessageClient = time.concat(String.valueOf(idClient)).concat(" ").concat(messageClient);
                this.writeMessageInFile(writeMessageClient);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
