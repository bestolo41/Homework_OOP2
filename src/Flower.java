public class Flower {

    private final String flowerName;

    private final String flowerColor;
    private final String country;
    private double cost;
    private final int lifeSpan;

// конструктор, когда указаны все аргументы
    public Flower(String flowerName, String flowerColor, double cost, String country,  int lifeSpan) {
        this.flowerName = flowerName;

        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank())  this.flowerColor = flowerColor;
        else this.flowerColor = "Белый";

        if (country != null || !country.isEmpty() || !country.isBlank())  this.country = country;
        else this.country = "Россия";

        if (cost > 0) this.cost = cost;
        else this.cost = 1;

        if (lifeSpan > 0) this.lifeSpan = lifeSpan;
        else this.lifeSpan = 3;
    }

    // конструктор, когда не указан цвет

    public Flower(String flowerName, double cost, String country,  int lifeSpan) {
        this.flowerName = flowerName;

        this.flowerColor = "Белый";

        if (country != null || !country.isEmpty() || !country.isBlank())  this.country = country;
        else this.country = "Россия";

        if (cost > 0) this.cost = cost;
        else this.cost = 1;

        if (lifeSpan > 0) this.lifeSpan = lifeSpan;
        else this.lifeSpan = 3;
    }


    // конструктор, когда не указана страна

    public Flower(String flowerName, String flowerColor, double cost,  int lifeSpan) {
        this.flowerName = flowerName;

        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank())  this.flowerColor = flowerColor;
        else this.flowerColor = "Белый";

        this.country = "Россия";

        if (cost > 0) this.cost = cost;
        else this.cost = 1;

        if (lifeSpan > 0) this.lifeSpan = lifeSpan;
        else this.lifeSpan = 3;
    }

    //конструктор, когда не указана цена

    public Flower(String flowerName, String flowerColor, String country,  int lifeSpan) {
        this.flowerName = flowerName;

        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank())  this.flowerColor = flowerColor;
        else this.flowerColor = "Белый";

        if (country != null || !country.isEmpty() || !country.isBlank())  this.country = country;
        else this.country = "Россия";

        this.cost = 1;

        if (lifeSpan > 0) this.lifeSpan = lifeSpan;
        else this.lifeSpan = 3;
    }

    // конструктор, когда не указан срок

    public Flower(String flowerName, String flowerColor, double cost, String country) {
        this.flowerName = flowerName;

        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank())  this.flowerColor = flowerColor;
        else this.flowerColor = "Белый";

        if (country != null || !country.isEmpty() || !country.isBlank())  this.country = country;
        else this.country = "Россия";

        if (cost > 0) this.cost = cost;
        else this.cost = 1;

        this.lifeSpan = 3;
    }

    //конструктор, когда не указаны цвет и страна

    public Flower(String flowerName, double cost, int lifeSpan) {
        this.flowerName = flowerName;

        this.flowerColor = "Белый";

        this.country = "Россия";

        if (cost > 0) this.cost = cost;
        else this.cost = 1;

        if (lifeSpan > 0) this.lifeSpan = lifeSpan;
        else this.lifeSpan = 3;
    }

    // конструктор, когда не указаны цвет и стоимость

//    public Flower(String flowerName, String country,  int lifeSpan) {
//        this.flowerName = flowerName;
//
//        this.flowerColor = "Белый";
//
//        if (country != null || !country.isEmpty() || !country.isBlank())  this.country = country;
//        else this.country = "Россия";
//
//        this.cost = 1;
//
//        if (lifeSpan > 0) this.lifeSpan = lifeSpan;
//        else this.lifeSpan = 3;
//

    // конструктор, когда не указаны цвет и срок

    public Flower(String flowerName, double cost, String country) {
        this.flowerName = flowerName;

        this.flowerColor = "Белый";

        if (country != null || !country.isEmpty() || !country.isBlank())  this.country = country;
        else this.country = "Россия";

        if (cost > 0) this.cost = cost;
        else this.cost = 1;

        this.lifeSpan = 3;
    }

    // конструктор, когда не указаны страна и стоимость

    public Flower(String flowerName, String flowerColor, int lifeSpan) {
        this.flowerName = flowerName;

        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank())  this.flowerColor = flowerColor;
        else this.flowerColor = "Белый";

        this.country = "Россия";

        this.cost = 1;

        if (lifeSpan > 0) this.lifeSpan = lifeSpan;
        else this.lifeSpan = 3;
    }

    // конструктор, когда не указаны страна и срок

    public Flower(String flowerName, String flowerColor, double cost) {
        this.flowerName = flowerName;

        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank())  this.flowerColor = flowerColor;
        else this.flowerColor = "Белый";

        this.country = "Россия";

        if (cost > 0) this.cost = cost;
        else this.cost = 1;

        this.lifeSpan = 3;
    }

    // конструктор, когда не указаны стоимость и срок

    public Flower(String flowerName, String flowerColor, String country) {
        this.flowerName = flowerName;

        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank())  this.flowerColor = flowerColor;
        else this.flowerColor = "Белый";

        if (country != null || !country.isEmpty() || !country.isBlank())  this.country = country;
        else this.country = "Россия";

        this.cost = 1;

        this.lifeSpan = 3;
    }

    // конструктор, когда не указаны цвет, страна и стоимость

    public Flower(String flowerName, int lifeSpan) {
        this.flowerName = flowerName;

        this.flowerColor = "Белый";

        this.country = "Россия";

        this.cost = 1;

        if (lifeSpan > 0) this.lifeSpan = lifeSpan;
        else this.lifeSpan = 3;
    }

    // конструктор, когда не указаны цвет, страна и срок

    public Flower(String flowerName, double cost) {
        this.flowerName = flowerName;

        this.flowerColor = "Белый";

        this.country = "Россия";

        if (cost > 0) this.cost = cost;
        else this.cost = 1;

        this.lifeSpan = 3;
    }

    // конструктор, когда не указаны цвет стоимость и срок

//    public Flower(String flowerName, String country) {
//        this.flowerName = flowerName;
//
//        this.flowerColor = "Белый";
//
//        if (country != null || !country.isEmpty() || !country.isBlank())  this.country = country;
//        else this.country = "Россия";
//
//        this.cost = 1;
//
//        this.lifeSpan = 3;
//    }

    // конструктор, когда не указаны страна, стоимость и срок

    public Flower(String flowerName, String flowerColor) {
        this.flowerName = flowerName;

        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank())  this.flowerColor = flowerColor;
        else this.flowerColor = "Белый";

        this.country = "Россия";

        this.cost = 1;

        this.lifeSpan = 3;
    }

    // конструктор, когда не указано ничего, кроме названия
    public Flower(String flowerName) {
        this.flowerName = flowerName;

        this.flowerColor = "Белый";

        this.country = "Россия";

        this.cost = 1;

        this.lifeSpan = 3;
    }

    public void setCost(double cost) {
        if (cost > 0) this.cost = cost;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    @Override

    public String toString() {
        return "Название: " + getFlowerName() + "\n" +
                "Цвет: " + getFlowerColor() + "\n" +
                "Страна: " + getCountry() + "\n" +
                "Стоимость: " + getCost() + "\n" +
                "Срок стояния: " + getLifeSpan() + "\n";
    }


}
