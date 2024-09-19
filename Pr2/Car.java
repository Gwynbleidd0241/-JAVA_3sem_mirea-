//№1
//public class Car {

//    private String model;
//    private String color;
//    private String lisene;
//    private int year;

//    public Car(String model, String color, String lisene, int year) {
//        this.model = model;
//        this.color = color;
//        this.lisene = lisene;
//        this.year = year;
//    }
//    public Car(){
//        this.color = null;
//        this.lisene = null;
//        this.year = 2024;
//        this.model = null;
//    }
//    public Car(String model){
//        this.model = model;
//        this.color = null;
//        this.lisene = null;
//        this.year = 2024;
//    }
//}
//№2
public class Car {

    private String color;
    private String lisene;
    private int year;
    final private int YEAR=2024;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLisene() {
        return lisene;
    }

    public void setLisene(String lisene) {
        this.lisene = lisene;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String model, String color, String lisene, int year) {
        this.model = model;
        this.color = color;
        this.lisene = lisene;
        this.year = year;
    }
    public Car(){
        this.color = null;
        this.lisene = null;
        this.year = 2024;
        this.model = null;
    }
    public Car(String model){
        this.model = model;
        this.color = null;
        this.lisene = null;
        this.year = 2024;
    }

    @Override
    public String toString(){
        return("Model: " + model + ";" + " Color: " + color +";" + " Lisene: " + lisene +";" + " Year: " + year +";");

    }

    public String getAge(){
        int age = YEAR - year;
        return ("Car age: "+ age);
    }
}
