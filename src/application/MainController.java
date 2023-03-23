package application;

import java.text.DecimalFormat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	TextField textField1;
	@FXML
	TextField textField2;
	@FXML
	TextField textField3;
	@FXML
	TextField textField4;
	@FXML
	TextField textField5;
	@FXML
	TextField textField6;
	@FXML
	Label label1;
	@FXML
	Label label2;
	@FXML
	Label label3;
	@FXML
	Label label4;
	@FXML
	Label label5;
	@FXML
	Label label6;
	@FXML
	Label label7;

	private static final DecimalFormat decfor = new DecimalFormat("0.00");

	public void firstYearCalculate(ActionEvent event) {
		String currentCTC = textField1.getText();
		double mycurrentCTC = Double.parseDouble(currentCTC);
		String previousCTC = textField2.getText();
		double mypreviousCTC = Double.parseDouble(previousCTC);
		double increment = (mycurrentCTC - mypreviousCTC);
		double incrementPercent = (increment / mypreviousCTC) * 100;
		String newIncrementPercent = decfor.format(incrementPercent);
		label1.setText(newIncrementPercent);

		String currentCTC1 = textField3.getText();
		double mycurrentCTC1 = Double.parseDouble(currentCTC1);
		String previousCTC1 = textField4.getText();
		double mypreviousCTC1 = Double.parseDouble(previousCTC1);
		double increment1 = (mycurrentCTC1 - mypreviousCTC1);
		double incrementPercent1 = (increment1 / mypreviousCTC1) * 100;
		String newIncrementPercent1 = decfor.format(incrementPercent1);
		label2.setText(newIncrementPercent1);
		double assumedPercentage = incrementPercent1 - incrementPercent;
		String newassumedPercentage = decfor.format(assumedPercentage);
		label3.setText(newassumedPercentage);

		String currentCTC2 = textField5.getText();
		double mycurrentCTC2 = Double.parseDouble(currentCTC2);
		String percentCTC2 = textField6.getText();
		double mypercentCTC2 = Double.parseDouble(percentCTC2);
		double increment2 = mycurrentCTC2 * (mypercentCTC2 / 100);
		double newSalary = mycurrentCTC2 + increment2;
		double perMonth = newSalary / 12;
		double inHandSal = perMonth - 10000;
		String newSalary1 = decfor.format(newSalary);
		String newperMonth = decfor.format(perMonth);
		String newinHandSal = decfor.format(inHandSal);
		label4.setText(newSalary1);
		label5.setText(newperMonth);
		label6.setText(newinHandSal);

	}

	public void resetFields() {
		textField1.setText("");
		textField2.setText("");
		textField3.setText("");
		textField4.setText("");
		textField5.setText("");
		textField6.setText("");
		label1.setText("");
		label2.setText("");
		label3.setText("");
		label4.setText("");
		label5.setText("");
		label6.setText("");
	}

}
