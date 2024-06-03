package com.example.kursywalut;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

import java.net.URL;
import java.util.*;


public class CurrencyConverterController implements Initializable {

    @FXML
    private ComboBox<String> cmbBox1;

    @FXML
    private ComboBox<String> cmbBox2;

    @FXML
    private Button btnReverse;

    @FXML
    private TextField txtField1;

    @FXML
    private TextField txtField2;
    @FXML
    private Button btnSubmit;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        List<String> currencies = Arrays.asList("USD", "EUR", "GBP", "PLN");

        cmbBox1.getItems().addAll(currencies);
        cmbBox2.getItems().addAll(currencies);

        cmbBox1.setValue("PLN");
        cmbBox2.setValue("Wybierz\nwalutę");

        btnSubmit.setOnAction(actionEvent -> {
            String selectedCurrency1 = cmbBox1.getValue();
            String selectedCurrency2 = cmbBox2.getValue();

            if(selectedCurrency1 != null && selectedCurrency2 != null) {

                switch (selectedCurrency1){
                    case "PLN" -> {
                        if(selectedCurrency2.equals("EUR")) {
                            try {
                                double amount = Double.parseDouble(txtField1.getText());
                                double result = amount * 0.2329;
                                txtField2.setText(String.format("%.4f", result));
                            } catch(NumberFormatException e) {
                                txtField2.setText("Zła Wartość");
                            }
                        } else if(selectedCurrency2.equals("GBP")) {
                            try {
                                double amount = Double.parseDouble(txtField1.getText());
                                double result = amount * 0.1984;
                                txtField2.setText(String.format("%.4f", result));
                            } catch(NumberFormatException e) {
                                txtField2.setText("Zła Wartość");
                            }
                        } else if(selectedCurrency2.equals("USD")) {
                            try {
                                double amount = Double.parseDouble(txtField1.getText());
                                double result = amount * 0.2535;
                                txtField2.setText(String.format("%.4f", result));
                            } catch(NumberFormatException e) {
                                txtField2.setText("Zła Wartość");
                            }
                        } else {
                            txtField2.setText(txtField1.getText());
                        }
                    }
                    case "EUR" -> {
                        if ("PLN".equals(cmbBox2.getValue())) {
                    try {
                        double amount = Double.parseDouble(txtField1.getText());
                        double result = amount * 4.2594;
                        txtField2.setText(String.format("%.4f", result));
                    } catch (NumberFormatException e) {
                        txtField2.setText("Zła Wartość");
                    }
                } else if ("GBP".equals(cmbBox2.getValue())) {
                    try {
                        double amount = Double.parseDouble(txtField1.getText());
                        double result = amount * 0.8465;
                        txtField2.setText(String.format("%.4f", result));
                    } catch (NumberFormatException e) {
                        txtField2.setText("Zła Wartość");
                    }
                } else if ("USD".equals(cmbBox2.getValue())) {
                    try {
                        double amount = Double.parseDouble(txtField1.getText());
                        double result = amount * 1.0837;
                        txtField2.setText(String.format("%.4f", result));
                    } catch (NumberFormatException e) {
                        txtField2.setText("Zła Wartość");
                    }
                } else {
                            txtField2.setText(txtField1.getText());
                        }
                    }
                    case "USD" -> {
                    if ("PLN".equals(cmbBox2.getValue())) {
                        try {
                            double amount = Double.parseDouble(txtField1.getText());
                            double result = amount * 3.9017;
                            txtField2.setText(String.format("%.4f", result));
                        } catch (NumberFormatException e) {
                            txtField2.setText("Zła Wartość");
                        }
                    } else if ("GBP".equals(cmbBox2.getValue())) {
                        try {
                            double amount = Double.parseDouble(txtField1.getText());
                            double result = amount * 0.7707;
                            txtField2.setText(String.format("%.4f", result));
                        } catch (NumberFormatException e) {
                            txtField2.setText("Zła Wartość");
                        }
                    } else if ("EUR".equals(cmbBox2.getValue())) {
                        try {
                            double amount = Double.parseDouble(txtField1.getText());
                            double result = amount * 0.9097;
                            txtField2.setText(String.format("%.4f", result));
                        } catch (NumberFormatException e) {
                            txtField2.setText("Zła Wartość");
                        }
                    } else {
                        txtField2.setText(txtField1.getText());
                    }
                    }
                    case "GBP" -> {
                        if ("PLN".equals(cmbBox2.getValue())) {
                        try {
                            double amount = Double.parseDouble(txtField1.getText());
                            double result = amount * 4.9904;
                            txtField2.setText(String.format("%.4f", result));
                        } catch (NumberFormatException e) {
                            txtField2.setText("Zła Wartość");
                        }
                    } else if ("EUR".equals(cmbBox2.getValue())) {
                        try {
                            double amount = Double.parseDouble(txtField1.getText());
                            double result = amount * 1.16;
                            txtField2.setText(String.format("%.4f", result));
                        } catch (NumberFormatException e) {
                            txtField2.setText("Zła Wartość");
                        }
                    } else if ("USD".equals(cmbBox2.getValue())) {
                        try {
                            double amount = Double.parseDouble(txtField1.getText());
                            double result = amount * 1.26;
                            txtField2.setText(String.format("%.4f", result));
                        } catch (NumberFormatException e) {
                            txtField2.setText("Zła Wartość");
                        }
                    } else {
                        txtField2.setText(txtField1.getText());
                    }

                    }
                    }
                }
         else {
                txtField2.setText("Select currencies");
            }


        });

    }
}