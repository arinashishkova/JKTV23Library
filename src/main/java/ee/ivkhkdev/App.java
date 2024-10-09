package ee.ivkhkdev;

import ee.ivkhkdev.model.Book;
import ee.ivkhkdev.repository.BookRepository;
import ee.ivkhkdev.services.BookService;
import ee.ivkhkdev.services.helpers.BookDataInput;
import ee.ivkhkdev.storages.StorageBook;

import java.util.List;
import java.util.Scanner;

public class App {
    public static List<Book> books;

    private Scanner scanner = new Scanner(System.in);
    private BookRepository bookRepository = new StorageBook();
    public App() {
        this.books = bookRepository.loadBooks();
    }
    public void run() {
            boolean repeat = true;
            System.out.println("---------- JKTV23 Library ----------");
            do {
            System.out.println("Task list: ");
            System.out.println("0. Exit");
            System.out.println("1. Add book");
            System.out.println("2. Add user");
            System.out.println("3. Show book list");
            System.out.println("4. Show reader list");
            System.out.println("5. Issue a book");
            System.out.println("6. Return a book");
            System.out.println("Choose task number from the list: ");

            int task = Integer.parseInt(scanner.nextLine());
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    BookService bookService = new BookService(scanner);
                    bookService.addBook(new BookDataInput());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Choose task number from the list:");
            }


        }while(repeat);
        System.out.println("Goodbye!");
    }
}
