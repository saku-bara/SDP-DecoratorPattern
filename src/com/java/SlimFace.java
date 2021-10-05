package com.java;

public class SlimFace extends PhotoEditorDecorator {
    public SlimFace(PhotoEditor photoEditor){
        super(photoEditor);
    }

    String makeSlimFace(){
        return "All faces on photo were slimmed. ";
    }

    @Override
    public String editPhoto() {
        return super.editPhoto() + makeSlimFace();
    }

    @Override
    public Integer NumOfChanges() {
        return super.NumOfChanges() + 1;
    }
}
