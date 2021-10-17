package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class SubChapter {
    private String name;
    private ArrayList<Image> images=new ArrayList<Image>();
    private ArrayList<Paragraph> paragraphs=new ArrayList<Paragraph>();
    private ArrayList<Table> tables=new ArrayList<Table>();
    public SubChapter(String name){
        this.name=name;
    }
    public void createNewParagraph(String text) {
        Paragraph para = new Paragraph(text);
        this.paragraphs.add(para);
    }
    public void createNewTable(String text) {
        Table table = new Table(text);
        this.tables.add(table);
    }

    public void createNewImage(String text) {
        Image image = new Image(text);
        this.images.add(image);
    }
    public void print() {
        System.out.println("Subchapter : " + this.name);
        Iterator var1 = this.paragraphs.iterator();

        while(var1.hasNext()) {
            Paragraph p = (Paragraph)var1.next();
            p.print();
        }

        var1 = this.images.iterator();

        while(var1.hasNext()) {
            Image i = (Image)var1.next();
            i.print();
        }

        var1 = this.tables.iterator();

        while(var1.hasNext()) {
            Table t = (Table)var1.next();
            t.print();
        }

    }
}
