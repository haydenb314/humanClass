public class Main {
    public static void main(String[] args) {
        Human Google = new Human("Google", 500);
        System.out.println(Google);
        Human Bob = new Human();
        Bob.setName("Bob");
        System.out.println(Bob);
        Human Jeb = new Human();
        Jeb.setName("Jeb");
        System.out.println(Jeb);
        Jeb.happyBirthday();
        Google.happyBirthday();
    }
}