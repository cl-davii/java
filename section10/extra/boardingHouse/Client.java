package section10.extra.boardingHouse;

public class Client {

    private String name;
    private String mail;

    public Client(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Name -> " + name + " | Email -> " + mail;
    }
}
