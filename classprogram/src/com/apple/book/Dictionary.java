package com.apple.book;
/**
 * @program: classprogram
 * @Description:
 * @author: xujunhao
 * @date: 2019/10/30 9:00 pm
 */
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public class Dictionary extends Book {
    private int defintions;

    public Dictionary(){
    }




    public Dictionary(Book book,int defintions){
        super(book.getBookId(),book.getBookName(),book.getPages());
        this.defintions = defintions;
    }
    public Dictionary(String bookId,String bookName,int pages,int defintions){
        super(bookId,bookName,pages);
        this.defintions = defintions;
    }
    @Override
    public String getBookId() {
        return DefaultValue.DICTIONARY_SKU + super.getBookId();
    }
}
