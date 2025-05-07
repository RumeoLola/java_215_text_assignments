package com.example.demo1project4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComparableController{
    @FXML
    private Label welcomeText;

    @FXML
    private static TextField startInterval1Field;

    @FXML
    private TextField startInterval2Field;

    @FXML
    private TextField endInterval1Field;

    @FXML
    private TextField endInterval2Field;

    @FXML
    private TextField timeToCheckField;

    @FXML
    private TextField resultField;

    @FXML
    private Button CompareIntervals;

    @FXML
    private Button checkTime;

    public static void main(String[] args) {
        System.out.println(startInterval1Field.getText());
    }

    public void handleCompare(ActionEvent event) {
        try {
            // Parse Time objects from text fields
            Time start1 = new Time(startInterval1Field.getText());
            Time end1 = new Time(endInterval1Field.getText());
            Time start2 = new Time(startInterval2Field.getText());
            Time end2 = new Time(endInterval2Field.getText());

            // Create Interval objects
            Interval<Time> interval1 = new Interval<>(start1, end1);
            Interval<Time> interval2 = new Interval<>(start2, end2);

            // Compare intervals and update result
            if (interval1.crossOver(interval2)) {
                resultField.setText("Interval 1 is a sub-interval of Interval 2");
            } else if (interval2.crossOver(interval1)) {
                resultField.setText("Interval 2 is a sub-interval of Interval 1");
            } else if (interval1.overlaps(interval2)) {
                resultField.setText("The intervals overlap");
            } else {
                resultField.setText("The intervals are disjoint");
            }

        } catch (InvalidTime e) {
            resultField.setText("Invalid time format: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            resultField.setText("Error: " + e.getMessage());
        }
    }

    @FXML
    public void handleTime2(ActionEvent event) {
        try {
            // Parse the time to check
            Time timeToCheck = new Time(timeToCheckField.getText());

            // Parse interval 1
            Time start1 = new Time(startInterval1Field.getText());
            Time end1 = new Time(endInterval1Field.getText());
            Interval<Time> interval1 = new Interval<>(start1, end1);

            // Parse interval 2
            Time start2 = new Time(startInterval2Field.getText());
            Time end2 = new Time(endInterval2Field.getText());
            Interval<Time> interval2 = new Interval<>(start2, end2);

            boolean in1 = interval1.within(timeToCheck);
            boolean in2 = interval2.within(timeToCheck);

            if (in1 && in2) {
                resultField.setText("Both intervals contain the time " + timeToCheck);
            } else if (in1) {
                resultField.setText("Only interval 1 contains the time " + timeToCheck);
            } else if (in2) {
                resultField.setText("Only interval 2 contains the time " + timeToCheck);
            } else {
                resultField.setText("Neither interval contains the time " + timeToCheck);
            }

        } catch (InvalidTime e) {
            resultField.setText("Invalid time: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            resultField.setText("Error: " + e.getMessage());
        }
    }
}