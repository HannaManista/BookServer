package Controller;

import Model.Book;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

    @FXML
    public TableView<Book> bookTableView;
    @FXML
    public TableColumn<Book, String> bookTitleColumn;
    @FXML
    public TableColumn<Book, Float> bookRateColumn;


}
