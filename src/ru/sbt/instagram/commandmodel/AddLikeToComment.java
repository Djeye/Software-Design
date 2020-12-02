package ru.sbt.instagram.commandmodel;

public class AddLikeToComment implements Command{
    private final String id;
    private final String postId;

    public AddLikeToComment(String id, String postId) {
        this.id = id;
        this.postId = postId;
    }
    
    @Override
    public void execute() {
        //get likes from post
        //++
        //set likes to post
    }
}
