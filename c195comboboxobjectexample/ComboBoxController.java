/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c195comboboxobjectexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author amy.antonucci
 */
public class ComboBoxController implements Initializable {

      @FXML
    private ComboBox<Fruit> cmbFruit;
      
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Fruit apple = new Fruit(1, "apple");
        Fruit banana = new Fruit(2, "banana");
        Fruit cherry = new Fruit(3, "cherry");
        
        cmbFruit.getItems().add(apple);
        cmbFruit.getItems().add(banana);
        cmbFruit.getItems().add(cherry);
        
    }    
    
        @FXML
    void onSelect(ActionEvent event) {

        Fruit selectedFruit = cmbFruit.getValue();
        
        Alert a = new Alert(AlertType.INFORMATION);
        a.setContentText("You chose " +selectedFruit.getFruitName()+  ". The id is " + selectedFruit.getFruitId());
        a.show();
    }
}
