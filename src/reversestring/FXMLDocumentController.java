/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author khaing
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button reverseButton;
    @FXML
    private TextField originalTextField;
    @FXML
    private Label reversedLabel;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void reverseString(ActionEvent event) {
        String o =originalTextField.getText();
        StringBuffer buffer = new StringBuffer(o);
        String reversedStr = buffer.reverse().toString();
        reversedLabel.setText(reversedStr);
    }
    
}
