package com.example.listview;

public class Person {
    private int photoId;
    private String name;
    private String merk;
    private String type;

    public Person(int photoId, String name, String merk, String type) {
        this.photoId = photoId;
        this.name = name;
        this.merk = merk;
        this.type = type;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}