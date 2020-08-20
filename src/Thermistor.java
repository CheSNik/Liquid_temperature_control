public class Thermistor {

    /***
     * @param _resistance - store input from User in ohms
     * @param baseResistance - resistance of thermistor at baseTemperature in ohms
     * @param baseTemperature - base Temperature to determine base resistance in Kelvin degrees
     */
    double _resistance;
    int baseResistance = 1075;
    int baseTemperature = 85;
    int Beta =3969;
    /***
     *
     * @param resistance - provide input from User
     */
    public Thermistor(double resistance) {
        _resistance = resistance;
    }

    /***
     *
     * @return - computed temperature of liquid
     */
    public double computeTemperature(){
        double temperature = Beta*baseTemperature/(baseTemperature*(Math.log(_resistance/baseResistance))+Beta)-273.15;
        temperature = Math.round(temperature*100.0) / 100.0;
        return temperature;
    }
}
