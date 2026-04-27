package uas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class BeratBadanIdealApp extends Application {
 private TextField tinggiBadan;
 private Label hasil;
 @Override
 public void start(Stage primaryStage) { 
 
 //Soal No. 1: deklarasikan root untuk menampung node secara vertikal
 Double ITinggi;
 
 Label lTinggi = new Label("Tinggi Badan (cm):");
 tinggiBadan = new TextField();
 tinggiBadan.setPromptText("Masukkan tinggi badan");
 Button bHitung = new Button("Hitung");
 bHitung.setOnAction(event -> hitungBeratBadanIdeal());

 
hasil = new Label();
 //Soal No. 2: Masukkan semua node kedalam root
  StackPane root = new StackPane();
 root.getChildren().add(bHitung);
 
 Scene scene = new Scene(root, 300, 200);
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 private void hitungBeratBadanIdeal() {
 double tinggi = Double.parseDouble(tinggiBadan.getText());
     Double beratBadanIdeal = null;
 
 //Soal No. 3: hitung berat badan ideal= (tinggi – 100) – 10%
 //misal berat ideal = (180 – 100)- 10% = 72
 beratBadanIdeal = (tinggi - 100) - 0.1;
 
 hasil.setText("Berat Badan Ideal Anda: " + beratBadanIdeal + " kg");
 }
 
 public static void main(String[] args) {
 launch(args);
 }
}
