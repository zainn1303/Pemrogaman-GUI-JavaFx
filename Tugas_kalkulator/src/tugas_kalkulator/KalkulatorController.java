/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author zain_
 */
public class KalkulatorController implements Initializable {

    @FXML
    private TextArea text_result;
    @FXML
    private Button button_clear;
    @FXML
    private Button button_delete;
    @FXML
    private Button button_seven;
    @FXML
    private Button button_eight;
    @FXML
    private Button button_division;
    @FXML
    private Button button_nine;
    @FXML
    private Button button_four;
    @FXML
    private Button buttton_five;
    @FXML
    private Button button_six;
    @FXML
    private Button button_multiplication;
    @FXML
    private Button button_one;
    @FXML
    private Button button_two;
    @FXML
    private Button button_three;
    @FXML
    private Button button_minus;
    @FXML
    private Button button_zero;
    @FXML
    private Button button_result;
    @FXML
    private Button button_plus;
        
    private int angka1 = 0;
    private String operasi = "netral";
    private int angka2 = 0;
    private int hasil;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ButtonClick(ActionEvent event) {
        if(event.getSource()== button_zero){ //cek apakah tombol yang ditekan adalah 0
            if(!text_result.getText().isBlank()){ //cek, apakah display masih kosong
                text_result.setText(text_result.getText() + "0"); //jika tidak kosong, tambahkan 0
            }
        }
        if(event.getSource()== button_one){
            text_result.setText(text_result.getText() + "1");
        }else if (event.getSource() == button_two) {
            text_result.setText(text_result.getText() + "2");
        }else if (event.getSource() == button_three) {
            text_result.setText(text_result.getText() + "3");
        }else if (event.getSource() == button_four) {
            text_result.setText(text_result.getText() + "4");
        }else if (event.getSource() == buttton_five) {
            text_result.setText(text_result.getText() + "5");
        }else if (event.getSource() == button_six) {
            text_result.setText(text_result.getText() + "6");
        }else if (event.getSource() == button_seven) {
            text_result.setText(text_result.getText() + "7");
        }else if (event.getSource() == button_eight) {
            text_result.setText(text_result.getText() + "8");
        }else if (event.getSource() == button_nine) {
            text_result.setText(text_result.getText() + "9");
        }else if (event.getSource() == button_clear) {
            text_result.setText("");
        }else if (event.getSource() == button_delete) {
            if (text_result.getLength() > 0) {
                text_result.setText( text_result.getText().substring(0, text_result.getText().length()-1));
            }
        }else if (event.getSource() == button_plus) {
            angka1 = Integer.parseInt(text_result.getText());
            operasi = "plus";
            text_result.setText("");
        }else if (event.getSource() == button_minus) {
            angka1 = Integer.parseInt(text_result.getText());
            operasi = "minus";
            text_result.setText("");
        }else if (event.getSource() == button_multiplication) {
            angka1 = Integer.parseInt(text_result.getText());
            operasi = "kali";
            text_result.setText("");
        }else if(event.getSource() == button_division){
            angka1 = Integer.parseInt(text_result.getText());
            operasi = "bagi";
            text_result.setText("");
        }else if(event.getSource() == button_result){
            angka2 = Integer.parseInt(text_result.getText());
            if (operasi.equals("plus")) {
                hasil = angka1 + angka2;
            }
            if (operasi.equals("minus")) {
                hasil = angka1 - angka2;
            }
            if (operasi.equals("kali")) {
                hasil = angka1 * angka2;
            }
            if (operasi.equals("bagi")) {
                hasil = angka1 / angka2;
            }
            text_result.setText(String.valueOf(hasil));
            operasi = "netral";
        }
    }
}