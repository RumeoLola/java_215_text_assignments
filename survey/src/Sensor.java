interface Sensor {


    double getTemperature();
    double getHumidity();

    default boolean isCalibrationNeeded()   {
        return true;
    }

    static String displayActivationMessage()    {
        return "Hello! The sensor is activating ...";
    }
}
