import java.time.LocalDate;

public class Person {

    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public Person(String name, int yearOfBirth, String town, String jobTitle) {
        if (yearOfBirth > 150) {
            this.yearOfBirth = yearOfBirth;
        } else if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = LocalDate.now().getYear() - yearOfBirth;
        }
        if (name == null || name.isBlank() || name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.isBlank() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }



    public void acquaintance () {
        if (this.jobTitle == "Безработный") {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я сейчас нигде не работаю. Будем знакомы!");
        } else {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || town.isEmpty() || town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
}
