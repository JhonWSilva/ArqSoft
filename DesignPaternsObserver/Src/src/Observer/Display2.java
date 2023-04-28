package Observer;

public class Display1 {
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("Display1: Temperatura = " + temperature + " Pressão = " + pressure + " Umidade = " + humidity);
    }
}
