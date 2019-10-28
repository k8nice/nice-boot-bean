package com.nice.domain;

/**
 * @author ningh
 */
public class User {

    private Long id;
    private String userNme;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserNme() {
        return userNme;
    }

    public void setUserNme(String userNme) {
        this.userNme = userNme;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userNme='" + userNme + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
