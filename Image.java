package com.company;

public class Image implements Element {
    private String image;

    public Image(String image) {
        this.image = image;
    }

    public void print() {
        System.out.println("Image with name:" + this.image);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int i) {
        return null;
    }
}
