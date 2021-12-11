package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Doe");
        User karen = new YGeneration("Karen Smith");
        User basia = new ZGeneration("Basia Kowalska");

        //When
        String johnMedium = john.sharePost();
        System.out.println("John's media of choice is: " + johnMedium);
        String karenMedium = karen.sharePost();
        System.out.println("Karen's media of choice is: " + karenMedium);
        String basiaMedium = basia.sharePost();
        System.out.println("Basia's media of choice is: " + basiaMedium +"\n");

        //Then
        assertEquals("[Facebook] This post was published on facebook", johnMedium);
        assertEquals("[Snapchat] This post was published on snapchat", karenMedium);
        assertEquals("[Twitter] This post was published on twitter", basiaMedium);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Doe");

        //When
        String johnMedium = john.sharePost();
        System.out.println("John's media of choice is: " + johnMedium);
        john.setSharingMedia(new SnapchatPublisher());
        johnMedium = john.sharePost();
        System.out.println("John will switch posting to: " + johnMedium + "\n");

        //Then
        assertEquals("[Snapchat] This post was published on snapchat", johnMedium);
    }
}
