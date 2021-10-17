package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Section implements Element, Cloneable {
    private String title;
    private ArrayList<Element> elements = new ArrayList<Element>();
    public Section(String title){
        this.title=title;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void print() {
        System.out.println(this.title);
        Iterator var=this.elements.iterator();
        while (var.hasNext()){
            Element i= (Element)var.next();
            i.print();
        }
    }

    @Override
    public void add(Element e) {
        Element x=e;
        if(x instanceof Paragraph){
            elements.add((Paragraph)x);
        }else if(x instanceof Section){
            elements.add((Section)x);
        }else if(x instanceof Image){
            elements.add((Image)x);
        }

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int i) {
        return null;
    }
}
