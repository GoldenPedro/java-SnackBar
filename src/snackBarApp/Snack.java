package snackBarApp;

public class Snack {
    private static int maxId = 0;
    private int id; 
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;  


    public Snack(int id, String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        this.id = id; 
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getCost() {
        return cost;
    }

    public void addQuantity(int quantityAdded) {
        quantity += quantityAdded;
    }

    public void subtractQuantity(int quantitySubtracted) {
        quantity -= quantitySubtracted;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public double getTotalCost() {
        return cost * quantity;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "\n" +
        "name: " + name + "\n" +
        "quantity: " + quantity  + "\n" +
        "cost: " + cost + "\n" +
        "vendingMachineId: " + vendingMachineId;
        return rtnStr;
    }

}