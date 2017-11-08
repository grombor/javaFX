package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

	// Variables declarations
	float number=0f;
	char operator;
	
    @FXML
    private TextField Display;

    @FXML
    private Button Btn0;

    @FXML
    private Button Btn1;

    @FXML
    private Button Btn2;

    @FXML
    private Button Btn3;

    @FXML
    private Button Btn4;

    @FXML
    private Button Btn5;

    @FXML
    private Button Btn6;

    @FXML
    private Button Btn7;

    @FXML
    private Button Btn8;

    @FXML
    private Button Btn9;

    @FXML
    private Button BtnPoint;

    @FXML
    private Button BtnPM;

    @FXML
    private Button BtnDiv;

    @FXML
    private Button BtnMul;

    @FXML
    private Button BtnAdd;

    @FXML
    private Button BtnEquals;

    @FXML
    private Button BtnSub;

    @FXML
    private Button BtnC;

    @FXML
    void ButtonClick(ActionEvent event) {
    	if (event.getSource()==Btn0) {
    		clearText();
    		Display.setText(Display.getText()+"0");
    	}
    	if (event.getSource()==Btn1) {
    		clearText();
    		Display.setText(Display.getText()+"1");
    	}
    	if (event.getSource()==Btn2) {
    		clearText();
    		Display.setText(Display.getText()+"2");
    	}
    	if (event.getSource()==Btn3) {
    		clearText();
    		Display.setText(Display.getText()+"3");
    	}
    	if (event.getSource()==Btn4) {
    		clearText();
    		Display.setText(Display.getText()+"4");
    	}
    	if (event.getSource()==Btn5) {
    		clearText();
    		Display.setText(Display.getText()+"5");
    	}
    	if (event.getSource()==Btn6) {
    		clearText();
    		Display.setText(Display.getText()+"6");
    	}
    	if (event.getSource()==Btn7) {
    		clearText();
    		Display.setText(Display.getText()+"7");
    	}
    	if (event.getSource()==Btn8) {
    		clearText();
    		Display.setText(Display.getText()+"8");
    	}
    	if (event.getSource()==Btn9) {
    		clearText();
    		Display.setText(Display.getText()+"9");
    	}
    	if (event.getSource()==BtnEquals) {
    		clearText();
    		equals(number,Float.parseFloat(Display.getText()));
    	}
    	if (event.getSource()==BtnAdd) {
    		number += Float.parseFloat(Display.getText());
    		Display.setText(Display.getText()+"+");
    		operator = '+';
    	}
    	if (event.getSource()==BtnSub) {
    		Display.setText(Display.getText()+"-");
    		operator = '-';
    	}
    	if (event.getSource()==BtnDiv) {
    		Display.setText(Display.getText()+"/");
    		operator = '/';
    	}
    	if (event.getSource()==BtnMul) {
    		Display.setText(Display.getText()+"*");
    		operator = '*';
    	}
    	if (event.getSource()==BtnPM) {
    		Display.setText(Float.toString(Float.parseFloat(Display.getText())*(-1)));
    	}
    	if (event.getSource()==BtnC) {
    		Display.setText("0");
    	}
    	if (event.getSource()==BtnPoint) {
    		Display.setText(Display.getText()+".");
    	}
    }

    public float equals(float n,float m) {
    	number=0f;
    	switch (operator){
    	case '+': {
    		Display.setText(String.valueOf(n+m));
    		break;
    		}
    	case '-': {
    		Display.setText(String.valueOf(n-m));
    		break;
    		}
    	case '*': {
    		Display.setText(String.valueOf(n*m));
    		break;
    		}
    	case '/': {
    		Display.setText(String.valueOf(n/m));
    		break;
    		}
    	}
    	
    	return n;
    }
    
    public void clearText() {
    	String str = Display.getText();
    	if (str.charAt(0)=='0') {
    		if (Display.getLength()==1) {
    			Display.setText("");
    			}
    		else delLastChar(str);
    	}
    	else if (!Character.isDigit(str.charAt(0))) {
    		delFirstChar(str);
    	}
    	else if (!Character.isDigit(str.charAt(Display.getLength()-1))) {
    		delLastChar(str);
		}
    	
    }

	private void delFirstChar(String str) {
		String s;
			s=Display.getText(1, Display.getLength());
			Display.setText(s);
		}
	
	private void delLastChar(String str) {
		Display.getText(0, Display.getLength()-1);
		Display.setText("");
	}
	
	
	}
