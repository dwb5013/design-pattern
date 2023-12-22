package org.example.chapter2;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);
}
