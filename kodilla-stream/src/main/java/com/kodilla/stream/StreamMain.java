package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.*;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        List<String> poems = new ArrayList<>();
        poems.add("Wierszyk");
        poems.add("Fraszka");
        poems.add("Tren");

        poems.sort(Comparator.comparingInt(String::length));
        System.out.println("Original poems:");
        System.out.println(poems);

        List<String> beautifiedPoems = new ArrayList<>();
        for (String toBeBeautified : poems) {
            String beautifulPoems = poemBeautifier.beautify(toBeBeautified, n -> n + "!");
            beautifiedPoems.add(beautifulPoems);
        }
        System.out.println("Poems beautified once");
        System.out.println(beautifiedPoems);

        List<String> beautifiedPoems2 = new ArrayList<>();
        for (String step2 : beautifiedPoems) {
            String beautifulPoems2 = poemBeautifier.beautify(step2, n -> n + new Random().nextInt(10));
            beautifiedPoems2.add(beautifulPoems2);
        }
        System.out.println("Poems beautified twice");
        System.out.println(beautifiedPoems2);

 //       List<String> beautifiedPoems3 = new ArrayList<>();
 //       for (String step3 : beautifiedPoems2) {
 //           String beautifulPoems3 = poemBeautifier.beautify().toLowerCase(step3, n -> n);
 //           beautifiedPoems3.add(beautifulPoems3);
 //       }
 //       System.out.println("Poems beautified thrice");
 //       System.out.println(beautifiedPoems3);
    }
}