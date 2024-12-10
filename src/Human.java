import java.lang.reflect.Array;
import java.util.ArrayList;

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
    private ArrayList<String> languages;
    private ArrayList<String> hobbies;
    private String mood;
    private int HP;


    //default constructor
    public Human() {
        this.id = nextId;
        nextId++;

        this.name = "";
        this.age = 0;
        this.location = "";

        this.hairColor = "";
        this.hairType = "";
        this.eyeColor = "";

        this.occupation = "";
        this.languages = new ArrayList<String>();
        this.hobbies = new ArrayList<String>();
        this.mood = "";
        this.HP = 100;
    }
    //constructor with parameters
    public Human(String name, int age, String location, String hairColor, String hairType, String eyeColor, String occupation, ArrayList<String> languages, ArrayList<String> hobbies, String mood, int HP) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.age = age;
        this.location = location;
        this.hairColor = hairColor;
        this.hairType = hairType;
        this.eyeColor = eyeColor;
        this.occupation = occupation;
        this.languages = languages;
        this.hobbies = hobbies;
        this.mood = mood;
        this.HP = 0;
    }

    //toString method
    public String toString() {
        return "Id: " + id + "\nName: " + name + "\nAge: " + age + "\nLocation: " + location + "\nHair Color: " + hairColor + "\nHair Type: " + hairType + "\nEye Color: " + eyeColor +
                "\nOccupation: " + occupation + "\nLanguages: " + languages + "\nHobbies: " + hobbies + "\nMood: " + mood + "\nHP: " + HP + "\n";
    }

    //human activities
    public void happyBirthday() {
        age++;
        System.out.println("Happy birthday, " + name + "! You are now " + age + " years old.\n");
    }

    public void greeting(Human human) {
        System.out.println("Hi, " + human.getName() + "! My name is " + name + ", and I am " + age + " years old.\n");
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

    //pythagorean theorem
    public void pythagoreanTheorem(int a, int b) {
        double c =Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c + "\n");
    }

    //quadratic formula
    public void quadraticFormula(int a, int b, int c) {
        double radical = Math.pow(b, 2);
        radical -= 4 * a * c;
        if (radical < 0) {
            System.out.println("Radical is negative. There are no roots.\n");
        }

        radical = Math.sqrt(radical);

        double positiveZero = (-b + radical) / 2 * a;
        double negativeZero = (-b - radical) / 2 * a;

        if (positiveZero == negativeZero) {
            System.out.println("Root: " + positiveZero + "\n");
        } else {
            System.out.println("Roots: " + positiveZero + ", " + negativeZero + "\n");
        }
    }

    //summation
    public void summation(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            c += i;
        }
        System.out.println("The sum of number between " + a + " and " + b + " equals " + c + "\n");
    }

    //area of a circle
    public void areaOfCircle(int radius) {
        System.out.println("The area of your circle is " + (3.141 * Math.pow(radius, 2)) + "\n");
    }

    //undoing radical TODO finish undoing a radical
    public void simplfyRadical(String r) {
        int radicand = Integer.parseInt(r.substring(r.indexOf(" ") + 1, r.length()));
        System.out.println("The radicand is " + radicand + "\n");
    }

    //true statements TODO fix true statements
    public void trueStatement(String s) {
        boolean isTrue = Boolean.parseBoolean(s);
        System.out.println(isTrue + "\n");
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public void setHairType(String hairType) {
        this.hairType = hairType;
    }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }
    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }

    //getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getLocation() {
        return location;
    }
    public String getHairColor() {
        return hairColor;
    }
    public String getHairType() {
        return hairType;
    }
    public String getEyeColor() {
        return eyeColor;
    }
    public String getOccupation() {
        return occupation;
    }
    public ArrayList<String> getLanguages() {
        return languages;
    }
    public ArrayList<String> getHobbies() {
        return hobbies;
    }
    public String getMood() {
        return mood;
    }
    public int getHP() {
        return HP;
    }
}
