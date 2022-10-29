import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Objects;

public class Bouquet {
    private Flower[] bouquet;

    private String bouquetName;


    public Bouquet(String bouquetName) {                                                                                //конструктор

        bouquet = new Flower[0];

        if (bouquetName != null || !bouquetName.isEmpty() || !bouquetName.isBlank()) this.bouquetName = bouquetName;
        else this.bouquetName = "Букет";

    }


    public String getBouquetName() {                                                                                    //геттер имени букета
        return bouquetName;
    }

    public void setBouquetName(String bouquetName) {                                                                    //сеттер имени букета
        if (bouquetName != null || !bouquetName.isEmpty() || !bouquetName.isBlank()) {
            this.bouquetName = bouquetName;
        }
    }

    public void addFlowers(Flower flower, int quantity) {
        if (quantity > 0) {
            Flower[] bouquet = Arrays.copyOf(this.bouquet, this.bouquet.length + quantity);
            for (int i = 0; i < bouquet.length; i++) {
                if (bouquet[i] == null) {
                    bouquet[i] = flower;
                }
            }
            this.bouquet = bouquet;
        }
    }

    public double calcCost() {                                                                                          //метод, который считает стоимость букета
        double cost = 0;
        for (int i = 0; i < bouquet.length; i++) {
            cost = cost + bouquet[i].getCost();
        }
        return ((double)Math.round((cost + (cost * 0.1)) * 100))/100;
    }

    public int calcLifeSpan () {                                                                                        // метод, который считает срок стояния букета

        int minLifeSpan = Integer.MAX_VALUE;

        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i].getLifeSpan() < minLifeSpan) minLifeSpan = bouquet[i].getLifeSpan();
        }
        return minLifeSpan;
    }

    private String countComposition() {
        String[] comp = new String[bouquet.length];
        for (int i = 0; i < bouquet.length; i++) {
            int count = 0;
            for (int j = 0; j < bouquet.length; j++) {
                if (bouquet[i].getFlowerName().equals(bouquet[j].getFlowerName())) {
                    count++;
                }
            }
            comp[i] = bouquet[i].getFlowerName() + ", " + count + " шт.";
        }

        String text = "";
        for (int i = 0; i < comp.length; i++) {
            if (!text.contains(comp[i])) {
                text = text + comp[i] + "\n";
            }
        }
        return text;
    }


    @Override

    public String toString() {                                                                                          //переопределяем toString
        if (this.bouquet.length > 0) {
            return "Название: " + getBouquetName() + "\n" +
                    "Состав: \n" + countComposition() +
                    "Срок стояния: " + calcLifeSpan() + " д.\n" +
                    "Стоимость: " + calcCost();
        } else {
            return "Букет " + getBouquetName() + " пуст.";
        }
    }


}
