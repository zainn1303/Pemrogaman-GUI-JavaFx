/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pertemuan_3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author zainal_abidin_19201049_EKSC1_TI_ASIA
 */
public class Tugas_pertemuan_3 extends Application {
    @Override
    public void start(Stage window){
        // --- VBox --- //
        // VBox index = new VBox();
        // Scene scene_dasar = new Scene(index, 400, 400);
                
        // --- GridPane --- //
        GridPane index = new GridPane();
        index.setMinSize(400,200);
        index.setPadding(new Insets(10,10,10,10));
        index.setVgap(10);
        index.setHgap(10);
        index.setAlignment(Pos.CENTER);
        
        // Formulir Nama //
        Text text_nama = new Text("Nama");
        Text text_titik_dua_satu = new Text(":");
        TextField tf_nama = new TextField();
        
        // Formulir Telepon //
        Text text_telepon = new Text("Telepon");
        Text text_titik_dua_dua = new Text(":");
        TextField tf_telepon = new TextField();
        
        // Formulir Alamat //
        Text text_alamat = new Text("Alamat");
        Text text_titik_dua_tiga = new Text(":");
        TextArea tf_alamat = new TextArea();
        
        // Button //
        TilePane tpane = new TilePane();
        Button btKirim = new Button("Kirim");
        Button btHapus = new Button("Hapus");
        tpane.setOrientation(Orientation.HORIZONTAL);
        tpane.setAlignment(Pos.CENTER);
        tpane.getChildren().addAll(btKirim, btHapus);
        
        // --- Initial To Grip Pane --- //
       
        // Baris 1
        index.add(text_nama,0,0);
        index.add(text_titik_dua_satu,1,0);
        index.add(tf_nama,2,0);
        
        // Baris 2
        index.add(text_telepon,0,1);
        index.add(text_titik_dua_dua,1,1);
        index.add(tf_telepon,2,1);
        
        // Baris 3
        index.add(text_alamat,0,2);
        index.add(text_titik_dua_tiga,1,2);
        index.add(tf_alamat,2,2);
        
        // Baris 4
        index.add(tpane,2,3);
        
        // Window Title
        window.setTitle("Layout Form");
        
        // Call Window
        Scene scene_dasar = new Scene(index);
        window.setScene(scene_dasar);
        
        // Show Windows
        window.show();
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }
}
