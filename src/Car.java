public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    // конструктор для задачи №1 и 3
    public Car() {
        brand = "default";
        model = "default";
        engineVolume = 1.5;
        color = "Белый";
        year = 2000;
        country = "default";
    }

    // конструктор для задачи №2

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }


    @Override
    public String toString() {
        return  "Автомобиль:  " + brand + "\n" +
                " * модель:  " + model + "\n" +
                " * объем двигателя:  " + engineVolume + "\n" +
                " * цвет:  " + color + "\n" +
                " * год выпуска:  " + year + "\n" +
                " * страна-производитель:  " + country + "\n" + "  -----------------------------";
    }
}
