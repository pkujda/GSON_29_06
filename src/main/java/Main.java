import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Pawel", "Kujda",34, 1.79,"gotowanie");
        Gson gson = new Gson();
        String json = gson.toJson(person1);
        System.out.println(json);

        Person person2 = gson.fromJson(json,Person.class);
        System.out.println(person2);
    }

}
