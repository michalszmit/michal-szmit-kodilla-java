package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private final Statistics statistics;
    private int forumUsers;
    private int forumPosts;
    private int forumComments;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        forumUsers = statistics.usersNames().size();
        forumPosts = statistics.postsCount();
        forumComments = statistics.commentsCount();
        if (forumUsers == 0) {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        } else {
            avgPostsPerUser =  (double) forumPosts / forumUsers;
            avgCommentsPerUser =  (double) forumComments / forumUsers;
        }
        if (forumPosts == 0) {
            avgCommentsPerPost = 0;
        } else {
            avgCommentsPerPost = (double) forumComments / forumPosts;
        }
    }

    public void showStatistics() {
        System.out.println("Forum statistics: " +
                "\nNumber of active users: " + forumUsers +
                "\nTotal number of posts written: " + forumPosts +
                "\nTotal number of comments written: " + forumComments +
                "\nAverage number of posts per user: " + avgPostsPerUser +
                "\nAverage number of comments under single post: " + avgCommentsPerPost +
                "\nAverage number of comments written by a single user: " + avgCommentsPerUser + "\n");
    }
}
