package pl.coderslab.oop.workshop2.user;


    // klasa User
public class User {

    //atrybuty klasy User
    private int id;
    private String username;
    private String password;
    private String email;

    // konstruktor User bez parametrów
    public User() {
    }

    //konstruktor z parametrami
    public User(int id, String username,String email, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    //konstruktor z parametrami
    public User(String username,String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // gettery pobierają z bazy danych istniejące juz w bazie wartości
    public int getId(){
        return id;
    }

    //settery nadają podaną przez użytkownika wartość do bazy danych
    public void setId(int id){
        this.id = id;
    }

    //===============================
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    //===============================
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //===============================
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    //===============================
    public String toString(){
        return "User { id = " + id + ", username = " +
                username + ", password = " + password + ", email = " + email + " }";
    }

}

