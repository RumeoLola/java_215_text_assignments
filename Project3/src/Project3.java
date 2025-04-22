/**
 * Author: Tayo Omolola
 * Project: Project3 - Road Trip Cost Estimator
 * Date: 04/22/2025
 * Description: trip cost calculator
 */


import javax.swing.*;

public class Project3 extends JFrame {
    private JPanel contentPane;
    private JLabel distanceLabel;
    private JPanel PanelSideLabelText;
    private JLabel costLabel;
    private JLabel MileageLabel;
    private JLabel DaysLabel;
    private JLabel HotelLabel;
    private JLabel FoodLabel;
    private JLabel AttractionsLabel;
    private JLabel TotalLabel;
    private JLabel CalculateLabel;

    private JPanel DropDowns;
    private JPanel InputsTextField;
    public JTextField DistanceInput;
    public JTextField GasolineCostInput;
    public JTextField GasMileageInput;
    public JTextField NumberDaysInput;
    public JTextField HotelCostInput;
    public JTextField FoodCostInput;
    public JTextField AttractionsInput;
    public JButton CalculateButton;
    public JTextField TotalOutputTextField;
    public JComboBox<String> DistanceCostUnit;
    public JComboBox<String> GasCostUnit;
    public JComboBox<String> GasDistanceUnit;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        // Set up the content pane
        contentPane = new JPanel();
    }

    public Project3() {
        setContentPane(contentPane);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TotalOutputTextField.setEditable(false);
        DistanceCostUnit.setModel(new DefaultComboBoxModel<>(new String[] {"miles", "kilometers"}));
        GasCostUnit.setModel(new DefaultComboBoxModel<>(new String[] {"dollars/gal", "dollars/liter"}));
        GasDistanceUnit.setModel(new DefaultComboBoxModel<>(new String[] {"miles/gallon", "kms/liter"}));
        // calculate button action listener
        CalculateButton.addActionListener(e -> {
            double total = calculateTripCost();
            TotalOutputTextField.setText("$" + String.format("%.2f", total));
        });
    }

    private double calculateTripCost() {
        double total = 0;
        try {
            double distance = Double.parseDouble(DistanceInput.getText());
            double gasCost = Double.parseDouble(GasolineCostInput.getText());
            double mileage = Double.parseDouble(GasMileageInput.getText());
            int days = Integer.parseInt(NumberDaysInput.getText());
            double hotel = Double.parseDouble(HotelCostInput.getText());
            double food = Double.parseDouble(FoodCostInput.getText());
            double attractions = Double.parseDouble(AttractionsInput.getText());
            // Unit selections
            String distUnit = (String) DistanceCostUnit.getSelectedItem();
            String gasUnit = (String) GasDistanceUnit.getSelectedItem();
            String mpgUnit = (String) GasCostUnit.getSelectedItem();
            // Unit conversions
            if ("kilometers".equals(distUnit)) {
                distance /= TripCost.KILOMETERS_PER_MILE;
            }

            if ("kilometers".equals(distUnit))  {
                distance *= TripCost.KILOMETERS_PER_MILE;
            }

            if ("dollars/liter".equals(gasUnit)) {
                gasCost *= TripCost.LITERS_PER_GALLON;
            }

            if ("dollars/gal".equals(gasUnit))  {
                gasCost /= TripCost.LITERS_PER_GALLON;
            }

            if ("kms/liter".equals(mpgUnit)) {
                mileage *= TripCost.MILES_PER_KM_PER_LITER;
            }

            if ("kms/liter".equals(mpgUnit)) {
                mileage /= TripCost.MILES_PER_KM_PER_LITER;
            }

            TripCost trip = new TripCost(distance, gasCost, mileage, days, hotel, food, attractions);
            total = trip.getTotalCost();
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please use numbers only.");
        }
        return total;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Project3::new);
    }
}