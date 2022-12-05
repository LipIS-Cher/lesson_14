public class Main {

    public static void main(String[] args){
        Human humanMaks = new Human("Максим", "Минск", 1988);
        System.out.println("Привет! Меня зовут " + humanMaks.name + ". Я из города " + humanMaks.town + ". Я родился в " + humanMaks.yearOfBirth + " году. Будем знакомы!");

        Human humanAnna = new Human("Анна", " Москва", 1993);
        System.out.println("Привет! Меня зовут " + humanAnna.name + ". Я из города " + humanAnna.town + ". Я родился в " + humanAnna.yearOfBirth + " году. Будем знакомы!");

        Human humanKate = new Human("Катя", " Калининград", 1992);
        System.out.println("Привет! Меня зовут " + humanKate.name + ". Я из города " + humanKate.town + ". Я родился в " + humanKate.yearOfBirth + " году. Будем знакомы!");

        Human humanArtem = new Human("Артем", " Москва", 1995);
        System.out.println("Привет! Меня зовут " + humanArtem.name + ". Я из города " + humanArtem.town + ". Я родился в " + humanArtem.yearOfBirth + " году. Будем знакомы!");

        System.out.println(" ");

        Human humanMaksJob = new Human("бренд-менеджером");
        System.out.println("Привет! Меня зовут " + humanMaks.name + ". Я из города " + humanMaks.town + ". Я родился в " + humanMaks.yearOfBirth + " году. Я работаю на должности " + humanMaksJob.jobTitle + ". Будем знакомы!");

        Human humanAnnaJob = new Human("методистом образовательных программ");
        System.out.println("Привет! Меня зовут " + humanAnna.name + ". Я из города " + humanAnna.town + ". Я родился в " + humanAnna.yearOfBirth + " году. Я работаю на должности " + humanAnnaJob.jobTitle + ". Будем знакомы!");

        Human humanKateJob = new Human("продакт-менеджером");
        System.out.println("Привет! Меня зовут " + humanKate.name + ". Я из города " + humanKate.town + ". Я родился в " + humanKate.yearOfBirth + " году. Я работаю на должности " + humanKateJob.jobTitle + ". Будем знакомы!");

        Human humanArtemJob = new Human("директором по развитию бизнеса");
        System.out.println("Привет! Меня зовут " + humanArtem.name + ". Я из города " + humanArtem.town + ". Я родился в " + humanArtem.yearOfBirth + " году. Я работаю на должности " + humanArtemJob.jobTitle + ". Будем знакомы!");


        System.out.println(" ");

        Car carLada = new Car("Lada", "Granta", 1.7f, "желтый", 2015, "Россия");
        System.out.println("Автомобиль марки " + carLada.brand + ", модель " + carLada.model + ". Объем двигателя " + carLada.engineVolume + "л., цвет кузова " + carLada.color + ", страна сборки " + carLada.country + ".");

        Car carAudi = new Car("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия");
        System.out.println("Автомобиль марки " + carAudi.brand + ", модель " + carAudi.model + ". Объем двигателя " + carAudi.engineVolume + "л., цвет кузова " + carAudi.color + ", страна сборки " + carAudi.country + ".");

        Car carBMW = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        System.out.println("Автомобиль марки " + carBMW.brand + ", модель " + carBMW.model + ". Объем двигателя " + carBMW.engineVolume + "л., цвет кузова " + carBMW.color + ", страна сборки " + carBMW.country + ".");

        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея");
        System.out.println("Автомобиль марки " + carKia.brand + ", модель " + carKia.model + ". Объем двигателя " + carKia.engineVolume + "л., цвет кузова " + carKia.color + ", страна сборки " + carKia.country + ".");

        Car carHyun = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        System.out.println("Автомобиль марки " + carHyun.brand + ", модель " + carHyun.model + ". Объем двигателя " + carHyun.engineVolume + "л., цвет кузова " + carHyun.color + ", страна сборки " + carHyun.country + ".");
    }
}
