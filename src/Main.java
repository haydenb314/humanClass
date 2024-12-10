public class Main {
    public static void main(String[] args) {
        Human Google = new Human();
        Google.setName("Google");
        System.out.println(Google);
        Human Bob = new Human();
        Bob.setName("Bob");
        System.out.println(Bob);
        Human Jeb = new Human();
        Jeb.setName("Jeb");
        System.out.println(Jeb);
        Jeb.happyBirthday();
        Google.happyBirthday();
        Google.simplfyRadical("root 80");
        Google.greeting(Jeb);
        Google.quadraticFormula(1, 3, 2);
        Google.summation(1, 20);
        Google.areaOfCircle(2);
        Google.pythagoreanTheorem(3, 4);
        Google.trueStatement("5 > 4");
    }
}