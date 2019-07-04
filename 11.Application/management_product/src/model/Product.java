package model;

public class Product {
    private  int id;
    private  String name;
    private String date_manufacture;
    private String date_end;
    private  String place;
    private int price;

    public Product() {

    }

    public Product(int id, String name,String date_manufacture,String date_end,String place, int price){
        this.id=id;
        this.name= name;
        this.date_end=date_end;
        this.date_manufacture=date_manufacture;
        this.place= place;
        this.price= price;
    }

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

    public String getDate_manufacture() {
        return date_manufacture;
    }

    public void setDate_manufacture(String date_manufacture) {
        this.date_manufacture = date_manufacture;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

