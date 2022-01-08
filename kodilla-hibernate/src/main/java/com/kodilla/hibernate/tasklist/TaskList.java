package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLIST")
public final class TaskList {
    private int Id;
    private String listName;
    private String description;

    public TaskList(){

    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return Id;
    }

    private void setId(int id) {
        Id = id;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    @Column (name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
