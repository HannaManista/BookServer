package DataBase;

import Model.Book;
import Model.BookTableModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

public class DBManager {

    private static final Logger LOGGER = (Logger) Logger.getLogger(DBManager.class.getName());
    private static final String JDBC_DRIVER_HD = "jdbc:mysql://localhost:3307/book_server";
    private static final String USER = "root";
    private static final String PASS = "";
    public ObservableList bookList;

    private static Connection connection;

//        dropTable(); //zakomentuj, żeby nie kasować za każym razem tabel w bazie
//        closeConnectionSource();


//    private static void createConnection(){
//        try {
//            connection = DriverManager.getConnection(JDBC_DRIVER_HD,USER, PASS);
//            System.out.println("connected");
//        } catch (SQLException e) {
//            LOGGER.fine(e.getMessage());
//        }
//    }
    public static Connection connect() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Error: " + cnfe.getMessage());
        } catch (InstantiationException ie) {
            System.err.println("Error: " + ie.getMessage());
        } catch (IllegalAccessException iae) {
            System.err.println("Error: " + iae.getMessage());
        }

        connection = DriverManager.getConnection(JDBC_DRIVER_HD,USER, PASS);
        return connection;
    }

    public static Connection getConnection(){
        if(connection == null){
            try {
                connect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnectionSource(){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ObservableList buildData() {
        bookList = FXCollections.observableArrayList();
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT title, rate FROM book");
//            pst.setString(1, type);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                bookList.add(new BookTableModel());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e);
        }
        return bookList;
    }

}
