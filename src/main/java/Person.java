import java.util.List;

public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;
    private double wzrost;
    private String listaHobby;

    public Person(String imie, String nazwisko, int wiek, double wzrost, String listaHobby) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.listaHobby = listaHobby;
    }
    public Person() {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.listaHobby = listaHobby;
    }
    public void setListaHobby(String listaHobby) {
        this.listaHobby = listaHobby;
    }
    public String getListaHobby() {
        return listaHobby;
    }
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getWzrost() {
        return wzrost;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }


}
