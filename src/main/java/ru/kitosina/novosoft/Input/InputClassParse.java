package ru.kitosina.novosoft.Input;

import java.util.*;

public class InputClassParse {

    private Scanner sc = new Scanner(System.in);

    private String path;
    private Integer quantityClient;
    private List<Integer> timeOutClient = new ArrayList<>();
    private List<String> messageClient = new ArrayList<>();

    public String inputPath() {
        System.out.println("File path: ");
        path = sc.nextLine();
        return path;
    }

    public Integer inputQuantityClient() {
        System.out.println("Quantity Client: ");
        quantityClient = sc.nextInt();
        return quantityClient;
    }

    public void addInputInfoClient() {
        for (Integer i = 0; i< quantityClient; i++) {
            timeOutClient.add(sc.nextInt());
            messageClient.add(sc.next());
        }
    }

    public List<Integer> getTimeOutClient() {
        return timeOutClient;
    }

    public void setTimeOutClient(List<Integer> timeOutClient) {
        this.timeOutClient = timeOutClient;
    }

    public List<String> getMessageClient() {
        return messageClient;
    }

    public void setMessageClient(List<String> messageClient) {
        this.messageClient = messageClient;
    }

}
