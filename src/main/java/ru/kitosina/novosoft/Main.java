package ru.kitosina.novosoft;

import ru.kitosina.novosoft.Input.InputClassParse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputClassParse inputClassParse = new InputClassParse();
        String path = inputClassParse.inputPath();
        Integer quantityClient = inputClassParse.inputQuantityClient();
        inputClassParse.addInputInfoClient();
        List<Integer> timeOutClient = inputClassParse.getTimeOutClient();
        List<String> messageClient = inputClassParse.getMessageClient();
    }
}
