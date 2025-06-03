package com.assign7;
import java.time.LocalDate;
import java.util.*;

enum Category {
    FICTION, NONFICTION, SCIENCE, HISTORY, TECHNOLOGY
}

class Book {
    private String isbn;
    private Category category;
    private double price;
    private LocalDate publishDate;
    private String authorName;
    private int quantity;

    public Book(String isbn, Category category, double price, LocalDate publishDate, String authorName, int quantity) {
        this.isbn = isbn;
        this.category = category;
        this.price = price;
        this.publishDate = publishDate;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s, Category: %s, Price: %.2f, Date: %s, Author: %s, Quantity: %d",
                isbn, category, price, publishDate, authorName, quantity);
    }
}

public class Library {

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty())
            throw new IllegalArgumentException("List is empty or null");
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Book> books = new HashSet<>();

        // Q1: Accept 5 books and store in HashSet
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));
            System.out.print("Enter ISBN: ");
            String isbn = sc.next();
            System.out.print("Enter Category (FICTION/NONFICTION/SCIENCE/HISTORY/TECHNOLOGY): ");
            Category category = Category.valueOf(sc.next().toUpperCase());
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Publish Date (yyyy-mm-dd): ");
            LocalDate date = LocalDate.parse(sc.next());
            System.out.print("Enter Author Name: ");
            String author = sc.next();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            books.add(new Book(isbn, category, price, date, author, qty));
        }

        System.out.println("\nQ1: Book Details in HashSet:");
        books.forEach(System.out::println);

        // Q2: Copy to LinkedHashSet to preserve insertion order
        LinkedHashSet<Book> linkedBooks = new LinkedHashSet<>(books);
        System.out.println("\nQ2: Book Details in LinkedHashSet (Insertion Order):");
        linkedBooks.forEach(System.out::println);

        // Q3: Sort by publish date
        List<Book> bookList = new ArrayList<>(books);
        bookList.sort(Comparator.comparing(Book::getPublishDate));
        System.out.println("\nQ3: Books Sorted by Publish Date:");
        bookList.forEach(System.out::println);

        // Q4: Create Lists and find max from any list
        List<Integer> intList = Arrays.asList(10, 20, 5, 40, 30);
        List<Double> doubleList = Arrays.asList(10.5, 12.3, 7.8);
        List<Long> longList = Arrays.asList(100L, 200L, 50L);

        System.out.println("\nQ4: Max from Lists:");
        System.out.println("Max Integer: " + findMax(intList));
        System.out.println("Max Double: " + findMax(doubleList));
        System.out.println("Max Long: " + findMax(longList));

        // Q5: TreeSet of Colors
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        System.out.println("\nQ5: Colors in TreeSet (Sorted):");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

