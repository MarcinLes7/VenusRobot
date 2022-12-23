import org.w3c.dom.ls.LSOutput;

public class VenusApplication {
    public static void main(String[] args) {
        VenusRobot klaudia = new VenusRobot();
            klaudia.temperature = 20;
            klaudia.speed = 3;
            klaudia.status = "eksploracja";
        System.out.println("Atrybuty klaudii: ");
            klaudia.showAttributes();

            System.out.println("-------------------------------");
        System.out.println("Zmiana temperatury Klaudii na -100");
            klaudia.temperature = -100;
            klaudia.checkTemperature();
            klaudia.showAttributes();

        System.out.println("-------------------------------");
        VenusRobot karolina = new VenusRobot();
        System.out.println("parametry karoliny: ");
            karolina.temperature = -150;
            karolina.speed = 2;
            karolina.status = "eksploracja";
            karolina.showAttributes();

        System.out.println("Sprawdzenie temperatury Karoliny:");
        karolina.checkTemperature();
        karolina.checkStatus();




    }
}
