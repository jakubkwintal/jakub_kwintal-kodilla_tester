public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public static void main(String[] args) {
        User marta = new User("Marta", 16);
        User tomek = new User("Tomek", 46);
        User antek = new User("Antek", 8);
        User ania = new User("Ania", 35);
        User filip = new User("Filip", 20);
        User lena = new User("Lena", 63);
        User piotr = new User("Piotr", 2);

        User[] users = {marta, tomek, antek, ania, filip, lena, piotr};
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
            System.out.println(users[i].name);
        }
        int averageOfAge = result / users.length;

        System.out.println("Średnia wieku:" + " " + averageOfAge);
        for (int i = 0; i < users.length; i++) {
             if (users[i].getAge() < averageOfAge) {
                 System.out.println(users[i].getName());
             }
       //      else {
         //        System.out.println("Wszyscy są w jednym wieku.");
               }
    }
}