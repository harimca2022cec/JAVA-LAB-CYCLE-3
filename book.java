import java.util.Scanner;

class Publisher {
    String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    String title;
    Publisher publisher;

    public Book(String title, Publisher publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}

class Literature extends Book {
    public Literature(String title, Publisher publisher) {
        super(title, publisher);
    }
}

class Fiction extends Book {
    public Fiction(String title, Publisher publisher) {
        super(title, publisher);
    }
}

 class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); 

        Book[] books = new Book[numBooks];

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisherName = scanner.nextLine();

            Publisher publisher = new Publisher(publisherName);

            System.out.print("Category (1 - Literature, 2 - Fiction): ");
            int category = scanner.nextInt();
            scanner.nextLine();

            if (category == 1) {
                books[i] = new Literature(title, publisher);
            } else if (category == 2) {
                books[i] = new Fiction(title, publisher);
            } else {
                System.out.println("Invalid category. Skipping book.");
            }
        }

        System.out.println("\nBook Details:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Publisher: " + books[i].getPublisher().getName());
            System.out.println("Category: " + (books[i] instanceof Literature ? "Literature" : "Fiction"));
        }
    }
}

