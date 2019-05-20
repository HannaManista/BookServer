package Main;

import DataBase.DBManager;
import DataBase.Dao;
import Utils.BookConverter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    DBManager db = new DBManager();

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/MainApp.fxml"));
        AnchorPane anchorPane = loader.load();
        Scene scene = new Scene(anchorPane);
        primaryStage.setTitle("Book Server");
        primaryStage.setScene(scene);
        primaryStage.show();

        db.connect();
        db.buildData();
    }
}
