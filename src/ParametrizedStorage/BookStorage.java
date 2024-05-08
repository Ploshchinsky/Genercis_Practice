package ParametrizedStorage;

import java.util.ArrayList;
import java.util.List;

public class BookStorage
        implements Storage<Book> {
    private List<Book> bookList;

    public BookStorage() {
        bookList = new ArrayList<>();
    }

    @Override
    public boolean save(Book element) {
        return bookList.add(element);
    }

    @Override
    public Book getById(int id) {
        return bookList.get(id) == null ? null : bookList.get(id);
    }

    @Override
    public void updateById(int id, Book updatedElement) {
        if (bookList.get(id) == null) {
            System.out.println("Element with ID [" + id + "] not exist");
            return;
        }
        Book tempBook = bookList.get(id);
        if (tempBook.getName() != updatedElement.getName()) {
            bookList.get(id).setName(updatedElement.getName());
        } else if (tempBook.getAuthor() != updatedElement.getAuthor()) {
            bookList.get(id).setAuthor(updatedElement.getAuthor());
        } else if (tempBook.getYear() != updatedElement.getYear()) {
            bookList.get(id).setYear(updatedElement.getYear());
        }
        System.out.println("Book [" + bookList.get(id).getName() + "] has benn update!");
    }

    @Override
    public void deleteById(int id) {
        if (bookList.get(id) != null) {
            bookList.remove(id);
            System.out.println("Book [" + bookList.get(id).getName() + "] has been delete!");
            return;
        }
        System.out.println("Book with id [" + id + "] not exist!");
    }

    @Override
    public List<Book> getList() {
        return bookList;
    }
}
