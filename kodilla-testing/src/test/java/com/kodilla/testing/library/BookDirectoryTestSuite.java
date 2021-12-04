package com.kodilla.testing.library;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                                             // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                                           // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                      // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);       // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);       // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                    // [8]
        resultListOfBooks.add(book1);                                                                               // [9]
        resultListOfBooks.add(book2);                                                                               // [10]
        resultListOfBooks.add(book3);                                                                               // [11]
        resultListOfBooks.add(book4);                                                                               // [12]
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);        // [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");                        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());                                                             // [15]
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                                             // [1]
        List<Book> resultListOf0Books = new ArrayList<>();                                                          // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                                      // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                                      // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                                               // [5]
                .thenReturn(resultListOf15Books);                                                                   // [6]
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))                                    // [7]
                .thenReturn(resultListOf0Books);                                                                    // [8]
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))                                   // [9]
                .thenReturn(resultListOf40Books);                                                                   // [10]

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");                    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");                   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");                  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                                            // [14]
        assertEquals(15, theListOfBooks15.size());                                                          // [15]
        assertEquals(0, theListOfBooks40.size());                                                           // [16]
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);                                          // [2]
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                                             // [3]

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");                          // [4]

        // Then
        assertEquals(0, theListOfBooks10.size());                                                           // [5]
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());            // [6]
    }

    @Nested
    class MyTests {

        @Test
        void testListBooksInHandsOfWithNoBooksRentedCondition() {
            //Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser johndoe = new LibraryUser("John", "Doe", "11111111111");

            List<Book> listOf0Books = new ArrayList<>();

            when(libraryDatabaseMock.listBooksInHandsOf(johndoe)).thenReturn(listOf0Books);

            //When
            List<Book> theListOf0Books = bookLibrary.listBooksInHandsOf(johndoe);

            //Then
            assertEquals(0, theListOf0Books.size());
        }

        @Test
        public void testListBooksInHandsOfWith1BookRentedCondition(){
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser johndoe = new LibraryUser("John","Doe","11111111111");

            List<Book> listOfBooks = new ArrayList<>();
            Book book1 = new Book ("20000 mil podmorskiej żeglugi", "Julius Verne", 1870);
            listOfBooks.add(book1);

            when(libraryDatabaseMock.listBooksInHandsOf(johndoe)).thenReturn(listOfBooks);

            // When
            List<Book> listOfBooksInHandsOf = bookLibrary.listBooksInHandsOf(johndoe);

            // Then
            assertEquals(1,listOfBooksInHandsOf.size());
        }

        @Test
        public void testListBooksInHandsOfWith5BookRentedCondition(){
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser johndoe = new LibraryUser("John","Doe","11111111111");

            List<Book> listOfBooks = new ArrayList<>();
            Book book1 = new Book ("20000 mil podmorskiej żeglugi", "Julius Verne", 1870);
            Book book2 = new Book ("Ania z zielonego wzgórza", "Lisa Moore", 1911);
            Book book3 = new Book ("Odyseja", "Homer", 200);
            Book book4 = new Book ("Dywizjon 303", "Arkady Fiedler", 1942);
            Book book5 = new Book ("Kubuś puchatek", "A.A. Milne", 1926);
            listOfBooks.add(book1);
            listOfBooks.add(book2);
            listOfBooks.add(book3);
            listOfBooks.add(book4);
            listOfBooks.add(book5);

            when(libraryDatabaseMock.listBooksInHandsOf(johndoe)).thenReturn(listOfBooks);

            // When
            List<Book> listOfBooksInHandsOf = bookLibrary.listBooksInHandsOf(johndoe);

            // Then
            assertEquals(5,listOfBooksInHandsOf.size());
        }

    }

}