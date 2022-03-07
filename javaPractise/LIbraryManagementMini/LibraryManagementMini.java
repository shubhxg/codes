// implementing a library using java class library
// methods - addBook, issueBook, returnBook, showAvailableBooks
// properties - array to store available books
// array to store issued books

class Library {
    protected String[] book;
    protected int no_of_books;

    // constructor
    Library() {
        this.book = new String[100];
        this.no_of_books = 0;
    }

    // method to add book
    void addBook(String book) {
        this.book[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    // method to show available books
    void showAvailableBooks() {

        System.out.println("Available books are: ");
        for (String books : this.book) {
            if (books == null) {
                continue;
            }
            System.out.println("-> " + books);
        }
    }

    // method to issue books
    void issueBook(String book) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i].equals(book)) {
                System.out.println("Book has been issued!");
                this.book[i] = null;
                return;
            }
        }
        System.out.println("This book doesn't exist");
    }

    // method to return books
    void returnBook(String book) {
        addBook(book);
    }

}

class LibraryManagementSystemSmall {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Rich dad Poor dad");
        lib.addBook("C++");
        lib.addBook("DS-ALGO by Liang");
        
        System.out.println();
        lib.showAvailableBooks();
        lib.issueBook("C++");

        System.out.println();
        lib.showAvailableBooks();
        lib.addBook("python");
        lib.returnBook("C++");

        System.out.println();
        lib.showAvailableBooks();

    }
}
