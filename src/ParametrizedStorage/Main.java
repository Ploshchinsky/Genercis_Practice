package ParametrizedStorage;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Martin Eden", "J.London", 1909);
        Book book2 = new Book("Thanatonauts", "Bernar Werber", 1994);
        Book book3 = new Book("Goethe", " Johann Wolfgang von Goethe", 1804);

        //Check create functional
        BookStorage bookStorage = new BookStorage();
        bookStorage.save(book1);
        bookStorage.save(book2);
        bookStorage.save(book3);
        System.out.println(bookStorage.getList() + "\n");

        //Check read functional
        System.out.println(bookStorage.getById(2));

        //Check delete functional
        bookStorage.deleteById(1);
        System.out.println(bookStorage.getList() + "\n");

        //Check update functional
        book3.setYear(1808);
        bookStorage.updateById(1, book3);
        System.out.println(bookStorage.getList() + "\n");
    }
}