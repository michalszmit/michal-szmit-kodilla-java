package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> booksSet = new HashSet<>();
        booksSet.add(new Book("Julius Verne", "20000 mil podmorskiej żeglugi", 1870, "11111"));
        booksSet.add(new Book("Henryk Sienkiewicz", "Krzyżacy", 1900, "22222"));
        booksSet.add(new Book("Adam Mickiewicz", "Pan Tadeusz", 1834, "33333"));
        booksSet.add(new Book("Homer", "Odyseja", -750, "44444"));
        booksSet.add(new Book("Juliusz Słowacki", "Beniowski", 1841, "55555"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMedian(booksSet);
        //Then
        System.out.println("Median of book publication in our library is year: " + median);
        assertEquals(1841, median);
    }
}