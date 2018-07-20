/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Carro;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 04223376250
 */
public class principalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btnSoma;
    @FXML
    private TextField txtn1;
    @FXML
    private TextField txtn2;
    
    @FXML
    private TextField txtCor;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtAno;
    
    

    @FXML
    private TextField txtResult;
    @FXML
    private Button btnMult;
    @FXML
    private Button btnDiv;
    @FXML
    private Button btnSub;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    
       
    

    @FXML
    private void somar(ActionEvent event) {
        Double n1, n2, res;
        n1= Double.parseDouble(txtn1.getText());
        n2= Double.parseDouble(txtn2.getText());
        res = n1 + n2;
        txtResult.setText(res.toString());
                
    }

    @FXML
    private void multiplicar(ActionEvent event) {
        Double n1, n2, res;
        n1= Double.parseDouble(txtn1.getText());
        n2= Double.parseDouble(txtn2.getText());
        res = n1 * n2;
        txtResult.setText(res.toString());
    }

    @FXML
    private void dividir(ActionEvent event) {
        Double n1, n2, res;
        n1= Double.parseDouble(txtn1.getText());
        n2= Double.parseDouble(txtn2.getText());
        res = n1 / n2;
        txtResult.setText(res.toString());
    }

    @FXML
    private void subtrair(ActionEvent event) {
        Double n1, n2, res;
        n1= Double.parseDouble(txtn1.getText());
        n2= Double.parseDouble(txtn2.getText());
        res = n1 - n2;
        txtResult.setText(res.toString());
    }
    
    @FXML 
    private void gravar(ActionEvent event){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Carro carro = new Carro();
        carro.setAno(Integer.parseInt(txtAno.getText()));
        carro.setCor(txtCor.getText());
        carro.setModelo(txtModelo.getText());
        
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
        
        
    }
@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
