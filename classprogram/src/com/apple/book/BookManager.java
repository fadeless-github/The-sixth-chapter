package com.apple.book;
/**
 * @program: classprogram
 * @Description:
 * @author: xujunhao
 * @date: 2019/10/30 9:00 pm
 */
public class BookManager {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("INB001", "CookBook", 90, 9);
        int pages = dictionary.pages;


        Book book = new Book("INB02", "James", 98);
        Book bookDictionary = new Dictionary(book, 11);
        display(String.valueOf(pages));
        display(bookDictionary.getBookId());
    }
        public static void display(String content){
            System.out.println(content);
        }


}
