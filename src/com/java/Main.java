package com.java;

public class Main {
    public static void main(String[] args) {

        PhotoEditor editor1 = new SkinSmooth(new BasicAutoEdit());
        System.out.println("Your photo is ready!");
        System.out.println(editor1.editPhoto());
        System.out.println("Number of non basic changes is : " + editor1.NumOfChanges()+ "\nthanks for using our service");
        System.out.println("--------------------------");

        PhotoEditor editor2 = new SlimFace(new SkinSmooth(new Graininess(new BasicAutoEdit())));
        System.out.println("Your photo is ready!");
        System.out.println(editor2.editPhoto());
        System.out.println("Number of non basic changes is : " + editor2.NumOfChanges()+ "\nthanks for using our service");

    }
}
