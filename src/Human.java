public class Human {
    private String name;
    private int age;
    private int SSN;

    public void happyBirthday() {
        this.age += 1;
        System.out.println("Happy Birthday! You are now " + this.age);
    }

    //math
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


    //setters
    public void setName(String n) {
        this.name = n;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public void setSSN(int social) {
        this.SSN = social;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSSN() {
        return SSN;
    }
}
