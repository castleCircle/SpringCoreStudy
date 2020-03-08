package me.wony.Validation;

import javax.validation.constraints.NotNull;

public class Event {

    Integer id;
    String title;

    @NotNull
    Integer limit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
