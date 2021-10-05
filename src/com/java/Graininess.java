package com.java;

public class Graininess extends PhotoEditorDecorator {
    public Graininess(PhotoEditor photoEditor){
        super(photoEditor);
    }

   String addGraininess(){
        return "Graininess is added. ";
   }

    @Override
    public String editPhoto() {
        return super.editPhoto() + addGraininess();
    }

    @Override
    public Integer NumOfChanges() {
        return super.NumOfChanges() + 1;
    }
}
