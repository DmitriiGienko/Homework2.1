public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("_____Задача 1_____");
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "Желтый";
        lada.year = 2015;
        lada.country = "Россия";
        System.out.println(lada);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8";
        audi.engineVolume = 3.0;
        audi.color = "Черный";
        audi.year = 2020;
        audi.country = "Германия";
        System.out.println(audi);

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "Черный";
        bmw.year = 2021;
        bmw.country = "Германия";
        System.out.println(bmw);

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage";
        kia.engineVolume = 2.4;
        kia.color = "Красный";
        kia.year = 2018;
        kia.country = "Южная Корея";
        System.out.println(kia);

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "Оранжевый";
        hyundai.year = 2016;
        hyundai.country = "Южная Корея";
        System.out.println(hyundai);

    }

    public static void task2() {
        System.out.println("_____Задача 2_____");

        Car lada = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8", 3.0, "Черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage", 2.4, "Красный", 2018, "Южная корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }

    public static void task3() {
        System.out.println("_____Задача 3_____");

// через 2 конструктор
        Car lada = new Car(null, "Granta", 1.7, "Желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8", 0, "Черный", 2020, null);
        Car bmw = new Car("BMW", "Z8", 3.0, null, 2021, "Германия");
        Car kia = new Car("Kia", null, 2.4, "Красный", 2018, "Южная корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 0, "Южная корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }


}