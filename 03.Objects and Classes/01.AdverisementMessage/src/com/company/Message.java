package com.company;

public class Message {

    private String phrase;
    private String event;
    private String name;
    private String city;

    public Message(String phrase, String event, String name, String city) {
        this.phrase = phrase;
        this.event = event;
        this.name = name;
        this.city = city;
    }

    public String getPhrase() {
        return this.phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getEvent() {
        return this.event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void printMessage() {

        System.out.printf("%s %s %s - %s%n", this.phrase, this.event, this.name, this.city);

    }

}
