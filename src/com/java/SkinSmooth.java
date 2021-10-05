package com.java;

public class SkinSmooth extends PhotoEditorDecorator {
    public SkinSmooth(PhotoEditor photoEditor){
        super(photoEditor);
    }

    String makeSmoothSkin(){
        return "Smooth effect was added. ";
    }

    @Override
    public String editPhoto() {
        return super.editPhoto() + makeSmoothSkin();
    }

    @Override
    public Integer NumOfChanges() {
        return super.NumOfChanges() + 1;
    }



}
