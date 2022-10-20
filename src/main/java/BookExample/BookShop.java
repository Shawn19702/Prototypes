package BookExample;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable { // Have to implement the cloneable or prototype interface to use prototype on objects
    private String shopName;

private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData(){
        for(int i =1; i <= 10; i++){
            Book book = new Book();
            book.setBid(i);
            book.setBookName("Book" + i);
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookExample.BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException { // Throw an exception if object your trying to clone doesn't implement cloneable
BookShop shop = new BookShop();
for (Book x: this.getBooks()){
          shop.getBooks().add(x);
        }
        // loop throw the array list and add the x to arraylist

        // It throws an exception meaning we need to throw an exception in the main also

        return shop;


    }

    //This a method for a deep copy


}
