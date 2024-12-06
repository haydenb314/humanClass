public class Human {
    //identification
    private static int nextId = 1;
    private int id;

    //basic information
    private String name;
    private int age;
    private String location;

    //physical attributes
    private String hairColor;
    private String hairType;
    private String eyeColor;

    //other attributes
    private String occupation;
    private String language;
    private String hobby;
    private String mood;
    private int HP;


    //default constructor
    public Human() {
        this.name = "";
        this.age = 0;
        this.id = nextId;
        nextId++;
    }
    //constructor with parameters
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public void happyBirthday() {
        this.age += 1;
        System.out.println("Happy Birthday, "+ this.name + "! You are now " + this.age + " years old.");
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nId: " + id + "\n";
    }

    //simple math methods
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        return (double) a / b;
    }

    //undoing radical
    public int simplfyRadical(String r) {
        int radicand = Integer.parseInt(r.substring(r.indexOf(" ") + 1, r.length()));
        return radicand;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
}
