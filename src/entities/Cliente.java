package entities;

import java.util.Date;

public class Cliente {

    // Attributi
    private final long clientCode;
    private String name;
    private String surname;
    private String email;
    private Date membershipDate;

    // Costruttore

    public Cliente(long clientCode, String name, String surname, String email) {

        Date date = new Date();

        this.clientCode = clientCode;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.membershipDate = date;
    }

    public Cliente(long clientCode, String name, String surname, String email, Date membershipDate) {
        this.clientCode = clientCode;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.membershipDate = membershipDate;
    }

    // Metodi

    // Getters


    public long getClientCode() {
        return clientCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Date getMembershipDate() {
        return membershipDate;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) System.out.println("Email non valida!");
        else this.email = email;
    }

    public void setMembershipDate(Date membershipDate) {
        this.membershipDate = membershipDate;
    }
}
