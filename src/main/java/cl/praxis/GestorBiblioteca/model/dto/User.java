package cl.praxis.GestorBiblioteca.model.dto;

public class User {

    private int id;
    private String name;
    private String password;
    private String email;
    private String Status;

    public User() {
    }

    public User(int id, String name, String password, String email, String status) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
