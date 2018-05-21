package com.example.welcome.vollyexample;

/**
 * Created by Welcome on 5/21/2018.
 */

public class Model {
    public String title;
    public String body;

    public Model() {
    }

    public Model(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
