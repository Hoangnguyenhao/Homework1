package org.example.bai1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Tạo các phần tử giao diện người dùng
        TextField textField = new TextField();
        Button button = new Button("Hiển thị");
        Label label = new Label();

        // Xử lý sự kiện khi nhấn nút
        button.setOnAction(e -> {
            String text = textField.getText();  // Lấy văn bản từ TextField
            label.setText("Bạn đã nhập: " + text);  // Hiển thị văn bản trong Label
        });

        // Tạo một VBox để bố trí các phần tử
        VBox vbox = new VBox(10, textField, button, label);

        // Thiết lập Scene
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chương trình JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
