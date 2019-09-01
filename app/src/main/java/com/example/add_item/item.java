package com.example.add_item;

public class item {
    private int id;
    private String name;
    private String description;
    private int owner_id;
    private String availabilty;
    private String location;

    public item(String s1, String s2, String s3, String s4, String s5) {
        this.name = s1;
        this.description = s2;
        this.location = s3;
        this.owner_id = Integer.parseInt(s4);
        this.availabilty = s5;
    }

    void setName(String name){
        this.name = name;
    }
    void setDescription(String description){
        this.description = description;
    }
    void setOwner_id(int id){
        this.owner_id = id;
    }
    String getName() {
        return this.name;
    }
    String getDescription(){
        return this.description;
    }

    public int getID() {
        return this.id;
    }

    public int getOwnerID() {
        return this.owner_id;
    }

    public String getLocation() {
        return this.location;
    }
}
