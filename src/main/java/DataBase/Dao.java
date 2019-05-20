package DataBase;

import Model.BookTableModel;

import java.awt.print.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost:3307/book_server";
    private static String user = "root";
    private static String pass = "";
    ResultSet rs = null;
    Statement st = null;

    public Connection DaoCon() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//                    Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url, user, pass);
        System.out.println(connection);
        return connection;

    }

    //
//    public List<BookTableModel> selectTitles() throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException {
//        PreparedStatement statement = DaoCon().prepareStatement("SELECT titles FROM books");
//        ResultSet result = statement.executeQuery();
//        return getTitleList(result);
//    }
//
//    public List<BookTableModel> getTitleList(ResultSet result) throws SQLException{
//        List<BookTableModel> books = new ArrayList<BookTableModel>();
//        while(result.next()){
//            BookTableModel btm = new BookTableModel();
//            btm.bookTitle = result.getString("title");
//            btm.bookRate = result.getFloat("rate");
//            books.add(btm);
//        }
//        return books;
//    }
//
    String title;
    String query = "select title from book";

    public void select() throws SQLException {
        try {
            st = connection.prepareStatement(query);
            rs = st.executeQuery(query);
            while (rs.next()) {
                title = rs.getString("title");
                System.out.println(title);
            }
        }catch(SQLException ex){
            System.out.println("blad");
        }

    }
}
