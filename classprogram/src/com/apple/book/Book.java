package com.apple.book;
/**
 * @program: classprogram
 * @Description:
 * @author: xujunhao
 * @date: 2019/10/30 9:00 pm
 */
public class Book {
    private String bookId;
    private String bookName;
    protected int pages;

    public Book(){

    }
    public Book(String bookId,String bookName,int pages){
        this.bookId = bookId;
        this.bookName = bookName;
        this.pages = pages;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


}
