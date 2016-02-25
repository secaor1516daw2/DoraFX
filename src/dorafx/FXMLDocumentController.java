/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dorafx;

import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;

/**
 *
 * @author sergio
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Canvas canvas;
    
    @FXML
    private void init(ActionEvent event) {
        //btc.init();
    }
   
    @FXML
    private void push(ActionEvent event) {
        //btc.push();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        Double ancho = canvas.getWidth()/3;
        Double altura = canvas.getHeight()/3;
        String rojo = "FF0000";
        String verde = "7CFC00";
        int xMax = 3;
        int yMax = 3;
        gc.setFill(Paint.valueOf("000000"));
        gc.setStroke(Paint.valueOf("000000"));
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        for (int i=0; i<=xMax;i++){
            for (int j=0; j<=yMax;j++){
                if(i==1 && j==2){
                    gc.setFill(Paint.valueOf(verde));
                }else{
                gc.setFill(Paint.valueOf(rojo));
                 }
                gc.fillRect(i*ancho,j*altura, ancho, altura);
               
            }
        }

    }    
    
}
