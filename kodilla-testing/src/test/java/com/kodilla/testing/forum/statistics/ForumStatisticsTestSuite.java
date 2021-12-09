package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    Statistics ForumStatisticsMock;

    private List<String> numberOfUsers (int users) {
        List<String> userList = new ArrayList<>();
        for (int i = 1; i <= users; i++) {
            userList.add("User #" + i);
        }
        return userList;
    }

    private int numberOfPosts (int posts) {
        return posts;
    }

    private int numberOfComments (int comments) {
        return comments;
    }

    @Test
    public void testForumStatistics0PostsWritten(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(ForumStatisticsMock);
        List<String> users = numberOfUsers(27);
        int postsWritten = numberOfPosts(0);
        int commentsWritten = numberOfComments(165);

        when(ForumStatisticsMock.usersNames()).thenReturn(users);
        when(ForumStatisticsMock.postsCount()).thenReturn(postsWritten);
        when(ForumStatisticsMock.commentsCount()).thenReturn(commentsWritten);

        //When
        forumStatistics.calculateAdvStatistics(ForumStatisticsMock);

        //Then
        Assertions.assertEquals(0.0, forumStatistics.avgPostsPerUser, 0.1);
        Assertions.assertEquals(6.1, forumStatistics.avgCommentsPerUser, 0.1);
        Assertions.assertEquals(0.0, forumStatistics.avgCommentsPerPost, 0.1);
    }

    @Test
    public void testForumStatistics1000PostsWritten(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(ForumStatisticsMock);
        List<String> users = numberOfUsers(27);
        int postsWritten = numberOfPosts(1000);
        int commentsWritten = numberOfComments(210);

        when(ForumStatisticsMock.usersNames()).thenReturn(users);
        when(ForumStatisticsMock.postsCount()).thenReturn(postsWritten);
        when(ForumStatisticsMock.commentsCount()).thenReturn(commentsWritten);

        //When
        forumStatistics.calculateAdvStatistics(ForumStatisticsMock);

        //Then
        Assertions.assertEquals(37.1, forumStatistics.avgPostsPerUser, 0.1);
        Assertions.assertEquals(7.8, forumStatistics.avgCommentsPerUser, 0.1);
        Assertions.assertEquals(0.2, forumStatistics.avgCommentsPerPost, 0.1);
    }

    @Test
    public void testForumStatistics0CommentsWritten(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(ForumStatisticsMock);
        List<String> users = numberOfUsers(13);
        int postsWritten = numberOfPosts(185);
        int commentsWritten = numberOfComments(0);

        when(ForumStatisticsMock.usersNames()).thenReturn(users);
        when(ForumStatisticsMock.postsCount()).thenReturn(postsWritten);
        when(ForumStatisticsMock.commentsCount()).thenReturn(commentsWritten);

        //When
        forumStatistics.calculateAdvStatistics(ForumStatisticsMock);

        //Then
        Assertions.assertEquals(14.2, forumStatistics.avgPostsPerUser, 0.1);
        Assertions.assertEquals(0.0, forumStatistics.avgCommentsPerUser, 0.1);
        Assertions.assertEquals(0.0, forumStatistics.avgCommentsPerPost, 0.1);
    }

    @Test
    public void testForumStatisticsMoreCommentsThanPostsWritten(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(ForumStatisticsMock);
        List<String> users = numberOfUsers(11);
        int postsWritten = numberOfPosts(1000);
        int commentsWritten = numberOfComments(1250);

        when(ForumStatisticsMock.usersNames()).thenReturn(users);
        when(ForumStatisticsMock.postsCount()).thenReturn(postsWritten);
        when(ForumStatisticsMock.commentsCount()).thenReturn(commentsWritten);

        //When
        forumStatistics.calculateAdvStatistics(ForumStatisticsMock);

        //Then
        Assertions.assertEquals(90.9, forumStatistics.avgPostsPerUser, 0.1);
        Assertions.assertEquals(113.6, forumStatistics.avgCommentsPerUser, 0.1);
        Assertions.assertEquals(1.25, forumStatistics.avgCommentsPerPost, 0.1);
    }

    @Test
    public void testForumStatisticsMorePostsThanCommentsWritten(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(ForumStatisticsMock);
        List<String> users = numberOfUsers(12);
        int postsWritten = numberOfPosts(700);
        int commentsWritten = numberOfComments(333);

        when(ForumStatisticsMock.usersNames()).thenReturn(users);
        when(ForumStatisticsMock.postsCount()).thenReturn(postsWritten);
        when(ForumStatisticsMock.commentsCount()).thenReturn(commentsWritten);

        //When
        forumStatistics.calculateAdvStatistics(ForumStatisticsMock);

        //Then
        Assertions.assertEquals(58.3, forumStatistics.avgPostsPerUser, 0.1);
        Assertions.assertEquals(27.75, forumStatistics.avgCommentsPerUser, 0.1);
        Assertions.assertEquals(0.5, forumStatistics.avgCommentsPerPost, 0.1);
    }

    @Test
    public void testForumStatistics0Users(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(ForumStatisticsMock);
        List<String> users = numberOfUsers(0);
        int postsWritten = numberOfPosts(5);
        int commentsWritten = numberOfComments(7);

        when(ForumStatisticsMock.usersNames()).thenReturn(users);
        when(ForumStatisticsMock.postsCount()).thenReturn(postsWritten);
        when(ForumStatisticsMock.commentsCount()).thenReturn(commentsWritten);

        //When
        forumStatistics.calculateAdvStatistics(ForumStatisticsMock);

        //Then
        Assertions.assertEquals(0.0, forumStatistics.avgPostsPerUser, 0.1);
        Assertions.assertEquals(0.0, forumStatistics.avgCommentsPerUser, 0.1);
        Assertions.assertEquals(1.4, forumStatistics.avgCommentsPerPost, 0.1);
    }

    @Test
    public void testForumStatistics100Users(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(ForumStatisticsMock);
        List<String> users = numberOfUsers(100);
        int postsWritten = numberOfPosts(250);
        int commentsWritten = numberOfComments(500);

        when(ForumStatisticsMock.usersNames()).thenReturn(users);
        when(ForumStatisticsMock.postsCount()).thenReturn(postsWritten);
        when(ForumStatisticsMock.commentsCount()).thenReturn(commentsWritten);

        //When
        forumStatistics.calculateAdvStatistics(ForumStatisticsMock);

        //Then
        Assertions.assertEquals(2.5, forumStatistics.avgPostsPerUser, 0.1);
        Assertions.assertEquals(5.0, forumStatistics.avgCommentsPerUser, 0.1);
        Assertions.assertEquals(2.0, forumStatistics.avgCommentsPerPost, 0.1);
    }

}
