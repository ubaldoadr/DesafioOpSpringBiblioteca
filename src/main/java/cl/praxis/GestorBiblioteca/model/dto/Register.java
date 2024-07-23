package cl.praxis.GestorBiblioteca.model.dto;

import java.util.Date;

public class Register {

    private int id;
    private int user_id;
    private Date action_date;
    private String action;

    public Register() {
    }

    public Register(int id, int user_id, Date action_date, String action) {
        this.id = id;
        this.user_id = user_id;
        this.action_date = action_date;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getAction_date() {
        return action_date;
    }

    public void setAction_date(Date action_date) {
        this.action_date = action_date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
