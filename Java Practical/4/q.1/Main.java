/*Create a class Book and define a display method to display book information. Inherit Reference_Book and
Magazine classes from Book class and override display method of Book class in Reference_Book and
Magazine classes. Make necessary assumptions required. */

// Author - Ajaykumar Nadar

class Book {
    String title;
    String author;
    int price;

    void display() {
        System.out.println("Book details:");
        System.out.println("\tName: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tPrice: " + price + "\n");
    }
}

class Reference_Book extends Book {
    Reference_Book() {
        title = "Java Programming";
        author = "E Balaguruswamy";
        price = 299;
    }
}

class Magazine extends Book {
    Magazine() {
        title = "Suffering are Blessing";
        author = "Bianca Noronha";
        price = 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Reference_Book refBook = new Reference_Book();
        Magazine magBook = new Magazine();

        System.out.println("Reference Book:");
        refBook.display();

        System.out.println("Magazine:");
        magBook.display();
    }
}