package Utils;
import DataBase.DBManager;
import Model.BookTableModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookConverter {
    DBManager db = new DBManager();
    public ObservableList bookList;
//    public List<Book> getBookList() throws SQLException {
//        try {
//            Statement stmnt = db.getConnection().createStatement();
//            ResultSet rs = stmnt.executeQuery("select title, rate from book ");
//            bookList = new ArrayList<Book>();
//            while (rs.next()) {
//                String bookTitle = rs.getString("title");
//                Float bookRate = rs.getFloat("rate");
//                Book book = new Book(bookTitle, bookRate);
//                bookList.add(book);
//            }
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//        return bookList ;
//    }
//public ObservableList buildData() {
//    bookList = FXCollections.observableArrayList();
//    try {
//        PreparedStatement pst = conn.prepareStatement("SELECT title, rate FROM book");
////            pst.setString(1, type);
//        ResultSet rs = pst.executeQuery();
//        while (rs.next()) {
//            bookList.add(new BookTableModel());
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//        System.err.println(e);
//    }
//    return bookList;
//}

}
