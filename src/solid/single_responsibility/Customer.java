package solid.single_responsibility;

import java.util.ArrayList;
//Bad practice
public class Customer {
    private int id;
    private String name;
    private boolean active;

    private ArrayList<Customer> customers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void addCustomer(){
        this.customers.add(new Customer());
    }

    public void deleteCustomer(int id){
        this.customers.remove(id);
    }
}
