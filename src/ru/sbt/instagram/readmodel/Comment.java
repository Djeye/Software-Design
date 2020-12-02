package ru.sbt.instagram.readmodel;

import java.util.Date;

public class Comment implements InfoReader {
    private String id;
    private String content;
    private String userFrom;
    private int likes;
    private Date date;

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public int getLikes() {
        return likes;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public void printAllFields() {
        System.out.println(getId());
        System.out.println(getContent());
        System.out.println(getUserFrom());
        System.out.println(getLikes());
        System.out.println(getDate());
    }
}
