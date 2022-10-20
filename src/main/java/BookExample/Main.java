package BookExample;

import BookExample.BookShop;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Barnes and noble");
        bookShop.loadData();


        BookShop bookShop1 = bookShop.clone();   // implements load data method from bookshop to bookshop 1

                                              // this a deep copy it will just remove book 3 from just the first object
                                              // And add a book to bookshop 1
                                             // It has two different objects with different data

                                             /*Since the copy isn't dependent on any mutable object
                                               it won't get modified by accident
                                            like a shallow copy */
        bookShop1.setShopName("Novelty");

        bookShop.getBooks().remove(3);

        bookShop1.getBooks().add(new Book());

        System.out.println(bookShop);


        System.out.println(bookShop1);







        // Instead always making new objects and calling the method on it, we could just borrow the data from the original bookshop

    }
}
