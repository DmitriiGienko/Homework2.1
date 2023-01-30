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

    // конструктор для задачи №2 и 3

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else this.brand = brand;

        if (model == null) {
            this.model = "default";
        } else this.model = model;

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;

        if (color == null) {
            this.color = "Белый";
        } else this.color = color;

        if (year <= 0) {
            this.year = 2000;
        } else this.year = year;

        if (country == null) {
            this.country = "default";
        } else this.country = country;

    }


    @Override
    public String toString() {
        return "Автомобиль:  " + brand + "\n" +
                " * модель:  " + model + "\n" +
                " * объем двигателя:  " + engineVolume + "\n" +
                " * цвет:  " + color + "\n" +
                " * год выпуска:  " + year + "\n" +
                " * страна-производитель:  " + country + "\n" + "  -----------------------------";
    }
}
