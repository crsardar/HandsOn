package com.crsardar.gradle.todo.model;

import java.util.Objects;

public class ToDoItem implements Comparable<ToDoItem> {

    private Long id;
    private String name;
    private boolean isCompleted;

    @Override
    public int compareTo(ToDoItem otherObj) {

        return (hashCode() - otherObj.hashCode());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ToDoItem toDoItem = (ToDoItem) o;
        return isCompleted == toDoItem.isCompleted &&
                Objects.equals(id, toDoItem.id) &&
                Objects.equals(name, toDoItem.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, isCompleted);
    }
}
