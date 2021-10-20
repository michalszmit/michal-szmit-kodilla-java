package com.kodilla.stream.forumuser;

import java.util.Map;
import java.util.stream.Collectors;

public class Modul7zadanie3 {

    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
//                .filter(forumUser -> forumUser.getDateOfBirth() < 2001-1-1)
                .filter(forumUser -> forumUser.getPublishedPosts() >= 1 )
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
