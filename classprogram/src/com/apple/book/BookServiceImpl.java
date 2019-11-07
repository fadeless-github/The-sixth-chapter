package com.apple.book;
/**
 * @program: classprogram
 * @Description:
 * @author: xujunhao
 * @date: 2019/10/30 9:00 pm
 */
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class BookServiceImpl implements BookService,Array {
    /**
     * @Description: to show read the book
     * @Param: []
     * @return: void
     * @Author: Mr.Cheng
     * @Date: 2019/10/28 1:15 下午
     */
    @Override
    public void readBook() {
        System.out.println("read the book!");
    }

    /**
     * @Description: to show borrow the book
     * @Param: []
     * @return: void
     * @Author: Mr.Cheng
     * @Date: 2019/10/28 1:15 下午
     */
    @Override
    public void borrowBook() {
        System.out.println("borrow the book!");
    }

    @Override
    public String getBaseTypeName() throws SQLException {
        return null;
    }

    @Override
    public int getBaseType() throws SQLException {
        return 0;
    }

    @Override
    public Object getArray() throws SQLException {
        return null;
    }

    @Override
    public Object getArray(Map<String, Class<?>> map) throws SQLException {
        return null;
    }

    @Override
    public Object getArray(long index, int count) throws SQLException {
        return null;
    }

    @Override
    public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
        return null;
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        return null;
    }

    @Override
    public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
        return null;
    }

    @Override
    public ResultSet getResultSet(long index, int count) throws SQLException {
        return null;
    }

    @Override
    public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
        return null;
    }

    @Override
    public void free() throws SQLException {

    }
}

