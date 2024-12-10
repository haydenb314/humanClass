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

    //pythagorean theorem
    public void pythagoreanTheorem(int a, int b) {
        double c =Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);
    }

    //quadratic formula
    public void quadraticFormula(int a, int b, int c) {
        double radical = Math.pow(b, 2);
        radical -= 4 * a * c;
        if (radical < 0) {
            System.out.println("Radical is negative. There are no roots.");
        }

        radical = Math.sqrt(radical);

        double positiveZero = (-b + radical) / 2 * a;
        double negativeZero = (-b - radical) / 2 * a;

        if (positiveZero == negativeZero) {
            System.out.println("Root: " + positiveZero);
        } else {
            System.out.println("Roots: " + positiveZero + ", " + negativeZero);
        }
    }

    //summation
    public void summation(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            c += i;
        }
        System.out.println("The sum of number between " + a + " and " + b + " equals " + c);
    }

    //area of a circle
    public void areaOfCircle(int radius) {
        System.out.println("The area of your circle is " + (3.141 * Math.pow(radius, 2)));
    }

    //undoing radical
    public int simplfyRadical(String r) {
        int radicand = Integer.parseInt(r.substring(r.indexOf(" ") + 1, r.length()));
        return radicand;
    }

    //greeting
    public void greeting(Human human) {
        System.out.println("Hi, " + human.getName() + "! My name is " + name + ", and I am " + age + " years old.");
    }

    public void trueStatement(String s) {
        boolean isTrue = Boolean.parseBoolean(s);
        System.out.println(isTrue);
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
