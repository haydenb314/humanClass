public class Main {
    public static void main(String[] args) {
        Human google = new Human();
        google.setName("Google");
        google.setAge(58);
        google.setSSN(5644637);
        System.out.println(google.getName());
        System.out.println(google.getAge());
        System.out.println(google.getSSN() + "\n");
        System.out.println(google.add(5, 6));
        google.happyBirthday();
        System.out.println(google.getAge());
    }
}