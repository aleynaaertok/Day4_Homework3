package day4_homework3.entities;

public class Gamer {
    private int Id;
    private String userName;
    private String password;
    private String eMail;


    public Gamer(int id, String userName, String password, String eMail) {
        Id = id;
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

}

