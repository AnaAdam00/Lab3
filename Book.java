package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Book extends Section {
    private String title;
    private ArrayList<Author> authors = new ArrayList<Author>();
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    private ArrayList<Paragraph> paragraphs = new ArrayList<Paragraph>();
    private ArrayList<Section> sections = new ArrayList<Section>();

    public Book(String title){
        super(title);
        this.title=title;
    }
    public void print(){
        System.out.println("Book: " + this.title);
        Iterator var1;


        var1 = this.authors.iterator();

        while(var1.hasNext()) {
            Author a = (Author)var1.next();
            a.print();
        }

        var1 = this.sections.iterator();

        while(var1.hasNext()) {
            Section i = (Section)var1.next();
            i.print();
        }


    }



    public void addAuthor(Author author1){
        authors.add(author1);
    }
    public int createChapter(String cap){
        Chapter c=new Chapter(cap);
        chapters.add(c);
        return chapters.indexOf(c);
    }
    public Chapter getChapter(int indexChapter){
        return (Chapter)chapters.get(indexChapter);
    }

    public void addContent(Section cap1) {
        sections.add(cap1);
    }
    public void addContent(Paragraph cap1) {
        paragraphs.add(cap1);
    }
}
