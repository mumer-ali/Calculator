package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class ControllerClass {

    @FXML
    private TextField text_field;

    @FXML
    void pressed_0(ActionEvent event) {
        text_field.setText(text_field.getText()+"0");
    }

    @FXML
    void pressed_1(ActionEvent event) {
        text_field.setText(text_field.getText()+"1");
    }

    @FXML
    void pressed_2(ActionEvent event) {
        text_field.setText(text_field.getText()+"2");
    }

    @FXML
    void pressed_3(ActionEvent event) {
        text_field.setText(text_field.getText()+"3");
    }

    @FXML
    void pressed_4(ActionEvent event) {
        text_field.setText(text_field.getText()+"4");
    }

    @FXML
    void pressed_5(ActionEvent event) {
        text_field.setText(text_field.getText()+"5");
    }

    @FXML
    void pressed_6(ActionEvent event) {
        text_field.setText(text_field.getText()+"6");
    }

    @FXML
    void pressed_7(ActionEvent event) {
        text_field.setText(text_field.getText()+"7");
    }

    @FXML
    void pressed_8(ActionEvent event) {
        text_field.setText(text_field.getText()+"8");
    }

    @FXML
    void pressed_9(ActionEvent event) {
        text_field.setText(text_field.getText()+"9");
    }

    @FXML
    void pressed_c(ActionEvent event) {
        char[] ch_1 = new char[text_field.getText().length()];
        for (int i = 0; i < text_field.getText().length(); i++) {
            ch_1[i] = text_field.getText().charAt(i);
        }
        char ch_2[] = Arrays.copyOf(ch_1, ch_1.length - 1);
        String new_text = String.valueOf(ch_2);
        text_field.setText(new_text);
    }

    @FXML
    void pressed_ca(ActionEvent event) {
        text_field.setText("");
    }

    @FXML
    void pressed_clospar(ActionEvent event) {
        text_field.setText(text_field.getText()+")");
    }

    @FXML
    void pressed_div(ActionEvent event) {
        text_field.setText(text_field.getText()+"/");
    }

    @FXML
    void pressed_equal(ActionEvent event) {
        String text = text_field.getText();
        text_field.setText("");
        Calculation calculation = new Calculation();
        try
        {
            double d_answer = calculation.evaluateExpression(text);
            String s_answer = d_answer+"";
            if (s_answer=="NaN" || s_answer=="Infinity"){
                text_field.setText("Math Error");
            }
            else {
                text_field.setText(s_answer);
            }
        } catch (Exception e) {
            text_field.setText("Error");
        }
    }

    @FXML
    void pressed_openpar(ActionEvent event) {
        text_field.setText(text_field.getText()+"(");
    }

    @FXML
    void pressed_minus(ActionEvent event) {
        text_field.setText(text_field.getText()+"-");
    }

    @FXML
    void pressed_mul(ActionEvent event) {
        text_field.setText(text_field.getText()+"x");
    }

    @FXML
    void pressed_plus(ActionEvent event) {
        text_field.setText(text_field.getText()+"+");
    }

    @FXML
    void pressed_point(ActionEvent event) {
        text_field.setText(text_field.getText()+".");
    }

    @FXML
    public static void main(String[] args) {

    }

}