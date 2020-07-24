/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arcompany.maven.controllers;



import com.arcompany.maven.entities.Product;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

/**
 *
 * @author Adriel Rosario
 */
public class ClientController implements Initializable {
    
    final Product product1 = new Product("producto 1", 5.0);
    final Product product2 = new Product("producto 2", 10.0);
    final Product product3 = new Product("producto 3", 15.0);
    final Product product4 = new Product("producto 4", 20.0);
    final Product product5 = new Product("producto 5", 25.0);
    final Product product6 = new Product("producto 6", 30.0);
    
    @FXML private Spinner<Integer> spProduct1 = new Spinner<Integer>();
    @FXML private Spinner<Integer> spProduct2 = new Spinner<Integer>();
    @FXML private Spinner<Integer> spProduct3 = new Spinner<Integer>();
    @FXML private Spinner<Integer> spProduct4 = new Spinner<Integer>();
    @FXML private Spinner<Integer> spProduct5 = new Spinner<Integer>();
    @FXML private Spinner<Integer> spProduct6 = new Spinner<Integer>();
    
    
    @FXML private void ableSpProduct1(ActionEvent event){
        
        
        if(spProduct1.isDisabled()){
            spProduct1.setDisable(false);
            //spProduct1.setEditable(true);
        }
        else{
            spProduct1.setDisable(true);
        }
        
    }
    
    @FXML private void ableSpProduct2(ActionEvent event){
        
        
        if(spProduct2.isDisabled()){
            spProduct2.setDisable(false);
        }
        else{
            spProduct2.setDisable(true);
        }
        
    }
    
    @FXML private void ableSpProduct3(ActionEvent event){
        
        
        if(spProduct3.isDisabled()){
            spProduct3.setDisable(false);
        }
        else{
            spProduct3.setDisable(true);
        }
        
    }
    
    @FXML private void ableSpProduct4(ActionEvent event){
        
        
        if(spProduct4.isDisabled()){
            spProduct4.setDisable(false);
        }
        else{
            spProduct4.setDisable(true);
        }
        
    }
    
    @FXML private void ableSpProduct5(ActionEvent event){
        
        
        if(spProduct5.isDisabled()){
            spProduct5.setDisable(false);
        }
        else{
            spProduct5.setDisable(true);
        }
        
    }
    
    @FXML private void ableSpProduct6(ActionEvent event){
        
        
        if(spProduct6.isDisabled()){
            spProduct6.setDisable(false);
        }
        else{
            spProduct6.setDisable(true);
        }
        
    }
    
    @FXML private void createOrder(ActionEvent event){
        
        List<Product> productList = new ArrayList<Product>();
        List<Integer> quantityList = new ArrayList<Integer>();
        
        if (spProduct1.isDisable() == false) {
            productList.add(this.product1);
            quantityList.add(spProduct1.getValue());
        }
        
        if (spProduct2.isDisable() == false) {
            productList.add(this.product2);
            quantityList.add(spProduct2.getValue());
        }
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        spProduct1.setDisable(true);
        spProduct2.setDisable(true);
        spProduct3.setDisable(true);
        spProduct4.setDisable(true);
        spProduct5.setDisable(true);
        spProduct6.setDisable(true);
        
        SpinnerValueFactory<Integer> valueFactorySp1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        SpinnerValueFactory<Integer> valueFactorySp2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        SpinnerValueFactory<Integer> valueFactorySp3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        SpinnerValueFactory<Integer> valueFactorySp4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        SpinnerValueFactory<Integer> valueFactorySp5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        SpinnerValueFactory<Integer> valueFactorySp6 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        
        spProduct1.setValueFactory(valueFactorySp1);
        spProduct2.setValueFactory(valueFactorySp2);
        spProduct3.setValueFactory(valueFactorySp3);
        spProduct4.setValueFactory(valueFactorySp4);
        spProduct5.setValueFactory(valueFactorySp5);
        spProduct6.setValueFactory(valueFactorySp6);
        
    }
    
}
