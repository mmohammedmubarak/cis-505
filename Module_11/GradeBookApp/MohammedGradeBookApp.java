/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
package Module_11.GradeBookApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * This class represents a Grade Book application
 */
public class MohammedGradeBookApp extends Application {

    //Configuring UI elements
    private TextField txtFirstName = new TextField();
    private TextField txtLastName = new TextField();
    private TextField txtCourse = new TextField();
    private TextArea txtResult = new TextArea();
    private Label lblFirstName = new Label("First Name:");
    private Label lblLastName = new Label("Last Name:");
    private Label lblCourse = new Label("Course:");
    private Label lblGrade = new Label("Grade:");
    private Label lblSaveResult = new Label("Save Result:");
    private Label lblGradeTable = new Label("Grades Table:");
    private ComboBox<String> cmbGrade = new ComboBox<>();
    private Button btnSave = new Button("Save Grade");
    private Button btnView = new Button("View Grades");
    private Button btnClear = new Button("Clear");
    private TableView<Student> tableView = new TableView<>();

    /**
     * Entry point of the JavaFX application. Sets up the UI, creates the table, and
     * displays the window.
     *
     * @param primaryStage The primary stage of the GUI.
     */
    @Override
    public void start(Stage primaryStage) {

        // Configuring the GridPane
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);
        gridPane.add(lblFirstName, 0, 0);
        gridPane.add(txtFirstName, 1, 0);
        gridPane.add(lblLastName, 0, 1);
        gridPane.add(txtLastName, 1, 1);
        gridPane.add(lblCourse, 0, 2);
        gridPane.add(txtCourse, 1, 2);
        gridPane.add(lblGrade, 0, 3);
        gridPane.add(cmbGrade, 1, 3);
        cmbGrade.setPrefWidth(100);
        gridPane.add(lblSaveResult, 0, 5);
        gridPane.add(txtResult, 1, 5);
        gridPane.add(lblGradeTable, 0, 6);

        // Values added to the grades drop down box
        cmbGrade.getItems().addAll("A", "B", "C", "D", "E", "F");

        // Configuring the buttons and grouping using HBox
        HBox actionBtnContainer = new HBox(10, btnClear, btnView, btnSave);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        gridPane.add(actionBtnContainer, 1, 4);

        // Configuring the grades display table
        TableColumn<Student, String> firstName = new TableColumn<>("First Name");
        firstName.setCellValueFactory(data -> data.getValue().getFirstName());
        TableColumn<Student, String> lastName = new TableColumn<>("Last Name");
        lastName.setCellValueFactory(data -> data.getValue().getLastName());
        TableColumn<Student, String> course = new TableColumn<>("Course");
        course.setCellValueFactory(data -> data.getValue().getCourse());
        TableColumn<Student, String> grade = new TableColumn<>("Grade");
        grade.setCellValueFactory(data -> data.getValue().getGrade());
        tableView.getColumns().addAll(firstName, lastName, course, grade);
        VBox layout = new VBox(10, tableView);
        gridPane.add(layout, 1, 6);

        // Configure the Stage and Scene
        primaryStage.setTitle("Mohammed Grade Book App"); // Setting title with the last name
        primaryStage.setScene(new Scene(gridPane, 600, 500));
        primaryStage.show();

        //Calling the event handlers methods
        btnClear.setOnAction(e -> clearForm());
        btnSave.setOnAction(e -> saveGrade());
        btnView.setOnAction(e -> viewGrades());

    }

    /**
     * Main method to launch the application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Method to clear the entries from the UI elements
     */
    private void clearForm() {
        txtFirstName.clear();
        txtLastName.clear();
        txtCourse.clear();
        cmbGrade.getSelectionModel().clearSelection();
        txtResult.clear();
    }

    /*
     * Method to save the entered grade in the UI to the grades.CSV file
     */
    private void saveGrade() {
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String course = txtCourse.getText();
        String grade = cmbGrade.getValue();

        //Check for empty fields
        if (firstName.isEmpty() || lastName.isEmpty() || course.isEmpty() || grade == null) {
            txtResult.setText("Please enter all fields before saving!");
            return;
        }

        //Create student object using input fields
        Student student = new Student(firstName, lastName, course, grade);
        File file = new File("grades.csv");

        //Write details in the CSV file
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            // Add header if the file is empty
            if (file.length() == 0) {
                writer.println("firstName,lastName,course,grade");
            }
            writer.println(firstName + "," + lastName + "," + course + "," + grade);
            txtResult.setText("Grade saved successfully!\n" + student.toString());
        } catch (IOException e) {
            txtResult.setText("Error saving grade.");
        }
        // Refresh the table by calling view grade method
        viewGrades();
    }

    /**
     * Method to display grades in the table by reading grades.csv file
     */
    private void viewGrades() {
        // Clear existing entries before loading new ones
        tableView.getItems().clear(); 

        //Read and load the table with grade detail
        try (BufferedReader reader = new BufferedReader(new FileReader("grades.csv"))) {
            String line;

            //Ignore header row
            boolean firstLine = true; 
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; 
                    continue;
                }

                // Read contents, split using comma and create student object and add to the table
                String[] values = line.split(",");
                
                //Check if all values are present for each row
                if (values.length == 4) { 
                    Student student = new Student(values[0], values[1], values[2], values[3]);
                    tableView.getItems().add(student);
                }
            }
        }
        //Handling exception while reading the file
         catch (IOException e) {
            txtResult.setText("Error reading grades file.");
        }
    }

}
