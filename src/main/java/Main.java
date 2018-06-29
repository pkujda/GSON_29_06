import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Pawel", "Kujda",34, 1.79,"gotowanie");
        Gson gson = new Gson();
        String json = gson.toJson(person1);
        System.out.println(json);

        String personJson = "{'imie': Abraham, 'nazwisko': Lincoln, 'wiek': 78, 'wzrost': 1.82, 'listaHobby': polityka}";
        Gson gson1 = new Gson();
        Person person2 = gson.fromJson(personJson,Person.class);
        System.out.println(person2.toString());

        Box<Person> box = new Box<Person>(new Person("Louis", "CK", 52, 1.65, "comedian"));
        Gson gson2 = new Gson();
        String json2 = gson.toJson(box);
        System.out.println(json2.toString());




    }
}
