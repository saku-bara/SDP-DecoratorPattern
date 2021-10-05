package com.java;

public class BasicAutoEdit implements PhotoEditor {
    @Override
    public String editPhoto() {
        return "Basic corrections were made. ";
    }

    @Override
    public Integer NumOfChanges() {
        return 0;
    }
}
