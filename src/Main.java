import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.Date;
import transport.Car;

public class Main {
    public static void main(String[] args) throws ParseException {

//        Person maxim = new Person("Максим", 1988, "Минск", "Бренд-менеджер");
//        Person anya = new Person("Аня", 1993, "Москва", "Методист образовательных программ");
//        Person katya = new Person("Катя", 1992, "Калининград", "Продакт-менеджер");
//        Person artem = new Person("Артем", 1995, "Москва", "Директор по развитию бизнеса");
//        Person vladimir = new Person("Владимир", 21, "Казань", "Безработный");

//        Flower rose = new Flower("Роза обыкновенная", 35.59, "Голландия");
//        Flower chrysanthemum = new Flower ("Хризантема", 15.00, 5);
//        Flower pion = new Flower("Пион", 69.90, "Англия", 1);
//        Flower gypsophila = new Flower("Гипсофила", 19.50, "Турция", 10);
////
        Car granta = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия", "МКПП", "Лифтбэк", "В 601 та 716", 5, "Летняя");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", "АКПП", "Седан", "н412нн77", 5, "Зимняя");
        Car bmw = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия", "АКПП", "Купе", "а954уе102", 2, "Летняя");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018, "Южная Корея", "МКПП", "SUV", "т763св763", 5, "Зимняя");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", "АКПП", "Седан", "о829мм95", 5, "Летняя");

        Car.Key grantaKey = granta.new Key(false, false);
        Car.Key audiKey = audi.new Key(true, true);
        Car.Key bmwKey = bmw.new Key(true, false);
        Car.Key kiaKey = kia.new Key(false, true);

        granta.setKey(grantaKey);
        audi.setKey(audiKey);
        bmw.setKey(bmwKey);
        kia.setKey(kiaKey);

//        System.out.println(granta);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);

        Car.Insurance grantaInsurance = granta.new Insurance("1", -5000, "");



        granta.setInsurance(grantaInsurance);

        System.out.println(granta);



//        Bouquet bouquet = new Bouquet("Весна");
//        bouquet.addFlowers(rose, 3);
//        bouquet.addFlowers(rose, 3);
//        bouquet.addFlowers(rose, 3);
//        bouquet.addFlowers(chrysanthemum, 4);
//        bouquet.addFlowers(pion, 2);
//
//        System.out.println(bouquet);

    }



}