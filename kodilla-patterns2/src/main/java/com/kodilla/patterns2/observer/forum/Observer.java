package com.kodilla.patterns2.observer.forum;

public interface Observer {
    default void update(ForumTopic forumTopic) {

    }
}