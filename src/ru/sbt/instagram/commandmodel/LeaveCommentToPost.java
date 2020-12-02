package ru.sbt.instagram.commandmodel;

import java.util.Date;

public class LeaveCommentToPost implements Command {
    private final String id;
    private final String content;
    private final Date date;

    public LeaveCommentToPost(String id, String content, Date date) {
        this.id = id;
        this.content = content;
        this.date = date;
    }

    @Override
    public void execute() {
        //leave comment to post
    }
}
