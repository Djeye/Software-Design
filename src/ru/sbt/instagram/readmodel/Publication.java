package ru.sbt.instagram.readmodel;

import java.awt.*;
import java.util.Date;
import java.util.List;

public class Publication implements InfoReader {
    private String id;
    private String location;
    private List<Image> images; // can be few images at once post
    private String description;
    private int likes;
    private int directs;
    private int comments;
    private Date date;

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public List<Image> getImages() {
        return images;
    }

    public String getDescription() {
        return description;
    }

    public int getLikes() {
        return likes;
    }

    public int getDirects() {
        return directs;
    }

    public int getComments() {
        return comments;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public void printAllFields() {
        System.out.println(getId());
        System.out.println(getLocation());
        System.out.println(getImages());
        System.out.println(getDescription());
        System.out.println(getLikes());
        System.out.println(getDirects());
        System.out.println(getComments());
        System.out.println(getDate());
    }
}
