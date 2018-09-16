/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weight_converter;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author INTELISENSE
 */
public class converterController implements Initializable {
    
    // instances variable
    
    //Define a ComboBox_From that contains items from which a weight can be converted from from.
    //You can only convert from KILOGRAMS
    @FXML
    private ComboBox<String> comboBox_From;
    ObservableList<String> list1 = FXCollections.observableArrayList("KILOGRAMS");
    
    //Define a ComboBox_To that contains items To which a weight can be converted from from.
    //You can only convert from POUNDS, OUNCES, GRAMS, AND STONES
    @FXML
    private ComboBox<String> comboBox_To;
    ObservableList<String> list2 = FXCollections.observableArrayList("POUNDS","OUNCES","GRAMS","STONES");
    
    // Takes the user value to be converted
    @FXML
    private TextField textField_Value;
    
    // return the result to the unit of choice
    @FXML
    private Label label_Result;
    //create instance variables
    
    final private double KILOGRAMS_TO_POUNDS = 2.2046;
    final private double KILOGRAMS_TO_OUNCES = 35.274;
    final private double KILOGRAMS_TO_GRAMS = 1000;
    final private double KILOGRAMS_TO_STONES = 0.1574;
    
    private double factor;
    private double measurement;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox_From.setItems(list1);
        comboBox_To.setItems(list2);
    }    
    
    
    public void convert_button(ActionEvent event){
        
        if(comboBox_To.getValue().equals("POUNDS")){
            factor = KILOGRAMS_TO_POUNDS;
            measurement = Double.parseDouble(textField_Value.getText());
            
            
            double result = measurement * factor;
            String result_to_string = Double.toString(result);
            
            label_Result.setText(result_to_string);
           
        }
        
        if(comboBox_To.getValue().equals("OUNCES")){
            factor = KILOGRAMS_TO_OUNCES;
            measurement = Double.parseDouble(textField_Value.getText());
            
            
            double result = measurement * factor;
            String result_to_string = Double.toString(result);
            
            label_Result.setText(result_to_string);
           
        }
        
        if(comboBox_To.getValue().equals("GRAMS")){
            factor = KILOGRAMS_TO_GRAMS;
            measurement = Double.parseDouble(textField_Value.getText());
            
            
            double result = measurement * factor;
            String result_to_string = Double.toString(result);
            
            label_Result.setText(result_to_string);
           
        }
        
        if(comboBox_To.getValue().equals("STONES")){
            factor = KILOGRAMS_TO_STONES;
            measurement = Double.parseDouble(textField_Value.getText());
            
            
            double result = measurement * factor;
            String result_to_string = Double.toString(result);
            
            label_Result.setText(result_to_string);
           
        }
    }
    
    
    public void refresh_button(ActionEvent event){
        
        textField_Value.clear();
        label_Result.setText("");
    }
    
    
    public void exit_button(ActionEvent event){
        
    }
    
    
}
