package com.company;

import java.util.ArrayList;

public class Chapter implements Element {
    private String nameChapter;
//    private static int index=0;
    private ArrayList<SubChapter>subChapters=new ArrayList<SubChapter>();
    public Chapter(String nameChapter){
        this.nameChapter=nameChapter;
//        index++;
    }
    public int createSubChapter(String name){
        SubChapter scap=new SubChapter(name);
        subChapters.add(scap);
        return  subChapters.indexOf(scap);
    }
    public SubChapter getSubChapter(int nr) {
        return (SubChapter)this.subChapters.get(nr);
    }

    @Override
    public void print() {

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
