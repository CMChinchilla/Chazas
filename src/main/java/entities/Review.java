package entities;

import java.util.Calendar;

public class Review {
    private Calendar date;
    private String title;
    private String description;
    private float score;
    private Chaza chaza;
    private User autor;

    public Review(Calendar date, float score, Chaza chaza, User autor) {
        this.date = date;
        this.score = score;
        this.chaza = chaza;
        this.autor = autor;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Chaza getChaza() {
        return chaza;
    }

    public void setChaza(Chaza chaza) {
        this.chaza = chaza;
    }

    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }
}
