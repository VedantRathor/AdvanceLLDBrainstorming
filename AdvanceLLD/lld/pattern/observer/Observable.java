package pattern.observer;

public interface Observable {
    void setStock(Integer quantity);
    Integer getStock();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
