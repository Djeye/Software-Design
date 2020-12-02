package ru.sbt.instagram.readmodel;

public class Account implements InfoReader {
    private String userName;
    private String id;
    private String description;
    private int publications;
    private long subscribers;
    private long subscriptions;

    // there are several getField method for "public" fields
    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getPublications() {
        return publications;
    }

    public long getSubscribers() {
        return subscribers;
    }

    public long getSubscriptions() {
        return subscriptions;
    }

    @Override
    public void printAllFields() {
        System.out.println(getUserName());
        System.out.println(getId());
        System.out.println(getDescription());
        System.out.println(getPublications());
        System.out.println(getSubscribers());
        System.out.println(getSubscriptions());
    }
}
