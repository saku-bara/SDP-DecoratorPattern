package com.java;

public abstract class PhotoEditorDecorator implements PhotoEditor {

    private PhotoEditor photoEditor;

    public PhotoEditorDecorator(PhotoEditor photoEditor){
        this.photoEditor = photoEditor;
    }

    @Override
    public String editPhoto() {
        return photoEditor.editPhoto();
    }

    @Override
    public Integer NumOfChanges() {
        return photoEditor.NumOfChanges();
    }
}
