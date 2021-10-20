package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(11111, "Anna Kowalska", 'F', 2000, 12, 18, 125) );
        usersList.add(new ForumUser(22222, "Jan Kowalski", 'M', 1980, 1, 25, 22) );
        usersList.add(new ForumUser(33333, "Natalia Nowak", 'F', 2005, 6, 13, 0) );
        usersList.add(new ForumUser(44444, "Zbigniew Orzech", 'M', 1974, 11, 11, 0) );
        usersList.add(new ForumUser(55555, "Marian Jezioro", 'M', 1999, 5, 1, 55) );
        usersList.add(new ForumUser(66666, "Genowefa Stanisławska", 'F', 2001, 2, 12, 88) );
    }

    public List<ForumUser>getList(){
        return new ArrayList<>(usersList);
    }
}
