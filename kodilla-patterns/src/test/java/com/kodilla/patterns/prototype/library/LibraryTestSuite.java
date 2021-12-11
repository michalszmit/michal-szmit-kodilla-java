package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("20000 mil podmorskiej zeglugi", "Julius Verne", LocalDate.of(1870, 5, 5));
        Book book2 = new Book("Tajemnicza wyspa", "Julius Verne", LocalDate.of(1875, 1, 1));
        Book book3 = new Book("W 80 dni dookoła swiata", "Julius Verne", LocalDate.of(1872, 2, 2));

        Library library = new Library("Original library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //Creating shallow copy
        Library library2 = null;
        try {
            library2 = library.shallowCopy();
            library2.setName("Shallow Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Creating deep copy
        Library library3 = null;
        try {
            library3 = library.deepCopy();
            library3.setName("Deep Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then

        System.out.println(library);
        System.out.println(library2);
        System.out.println(library3);

        assertEquals(2, library.getBooks().size());
        assertEquals(2, library2.getBooks().size());
        assertEquals(3, library3.getBooks().size());
        assertEquals(library.getBooks() , library2.getBooks());
        assertNotEquals(library.getBooks(), library3.getBooks());
    }
}
