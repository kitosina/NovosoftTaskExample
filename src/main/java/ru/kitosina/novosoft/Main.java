package ru.kitosina.novosoft;

import ru.kitosina.novosoft.Client.ThreadClient;
import ru.kitosina.novosoft.Input.InputClassParse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        InputClassParse inputClassParse = new InputClassParse();
        String path = inputClassParse.inputPath();
        Integer quantityClient = inputClassParse.inputQuantityClient();
        inputClassParse.addInputInfoClient();
        BufferedWriter writerFile = new BufferedWriter(new FileWriter(path));
        List<Integer> timeOutClient = inputClassParse.getTimeOutClient();
        List<String> messageClient = inputClassParse.getMessageClient();

        for (Integer idClient = 0; idClient < timeOutClient.size(); idClient++) {
            Integer timeOut = timeOutClient.get(idClient);
            String message = messageClient.get(idClient);
            new Thread(new ThreadClient(timeOut, idClient, message, writerFile)).start();
        }

    }
}
