/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

 package Module_8.EnhancedFutureValueApp;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MohammedEnhancedFutureValueApp extends Application {

    // Private variables for UI components
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextArea txtResult = new TextArea();
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label lblFutureValueDate = new Label("");
    private ComboBox<Integer> cmbYears = new ComboBox<>();

    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    @Override
    public void start(Stage primaryStage) {

        // Configure the GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); // Padding set as per requirement
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        // Add Labels and Fields to the GridPane
        gridPane.add(lblMonthlyPayment, 0, 0);
        gridPane.add(txtMonthlyPayment, 1, 0);
        gridPane.add(lblInterestRate, 0, 1);
        gridPane.add(txtInterestRate, 1, 1);
        gridPane.add(lblInterestRateFormat, 1, 2);
        gridPane.add(lblYears, 0, 3);
        gridPane.add(cmbYears, 1, 3);
        cmbYears.setPrefWidth(100);
        gridPane.add(txtResult, 0, 6);
        gridPane.add(lblFutureValueDate, 0, 5);
        GridPane.setColumnSpan(txtResult, 2);

        cmbYears.getItems().addAll(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        cmbYears.setValue(0); // Set default selection

        // Configure lblInterestRateFormat
        lblInterestRateFormat.setStyle("-fx-text-fill: red;"); // Setting the label text to Red
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        // Configure the buttons
        HBox actionBtnContainer = new HBox(10, btnClear, btnCalculate);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        gridPane.add(actionBtnContainer, 1, 4);

        // Configure the Stage and Scene
        primaryStage.setTitle("Mohammed Enhanced Future Value App"); // Setting title with the last name
        primaryStage.setScene(new Scene(gridPane, 400, 300));
        primaryStage.show();

        // Added calls to the action methods
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> calculateResults());

    }

    /**
     * Method to clear the values from the input fields
     */
    private void clearFormFields() {

        txtMonthlyPayment.setText("");
        txtInterestRate.setText("");
        txtResult.setText("");
        lblFutureValueDate.setText("");
        cmbYears.setValue(0);

    }

    /**
     * Method to calculate the future value and display in the text result field
     */
    private void calculateResults() {
        try {
            double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
            double interestRate = Double.parseDouble(txtInterestRate.getText());
            int years = cmbYears.getValue(); // Assuming cbYears holds integer values

            // Calculate future value
            double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, interestRate, years);

            // Set formatted date
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            lblFutureValueDate.setText("Calculation as of " + today.format(formatter));

            // Update results field
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            txtResult.setText("The future value is $" + numberFormat.format(futureValue));

        }
        // Handling invalid inputs
        catch (NumberFormatException e) {
            txtResult.setText("Please enter valid numbers");
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
