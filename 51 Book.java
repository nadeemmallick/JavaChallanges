class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static{
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    Book(String title, String author, String isbn) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book (String isbn){
        this("Unknown", "Unknown",isbn);
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void  borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
        this.isBorrowed = true;
            System.out.println("Enjoy your book "+ this.title);
    }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("hope you enjoy the book");
        }else{
            System.out.println("This book is already in lib");
        }

    }

    static void main(String[] args) {
        Book book1 = new Book("ART", "ullu","1" );
        Book book2 = new Book("Maths", "pllu","22" );
        Book book3 = new Book("Computer", "ulou","13" );
        Book book4 = new Book("Comic", "ulku","14" );
        Book book5 = new Book("","","123");

        System.out.println(Book.getTotalNoOfBooks());
        book1.borrowBook();
        book5.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();


    }



}
