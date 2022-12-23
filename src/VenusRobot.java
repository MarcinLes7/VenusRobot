public class VenusRobot {
    String status;
    int speed;
    float temperature;

    public void checkTemperature() {
        if (temperature < -90) {
            speed = 5;
            status = "Powrót do domu";

        }
    }

    public void showAttributes() {
        System.out.println("Temperatura: " + temperature);
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
    }

    public void checkStatus() {
        System.out.println("Bieżacy status robota:" + status);
    }

}
