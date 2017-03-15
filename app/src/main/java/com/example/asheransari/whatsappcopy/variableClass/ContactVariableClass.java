package com.example.asheransari.whatsappcopy.variableClass;

/**
 * Created by asher.ansari on 3/12/2017.
 */

public class ContactVariableClass {
    private int ImagePath;
    private String name;
    private String slogan;
    private boolean isImage;

//    public void setImage(boolean image) {
//        isImage = image;
//    }

    public boolean isImage() {
        return isImage;
    }

    public ContactVariableClass(int imagePath, String name, String slogan, boolean check) {
        ImagePath = imagePath;
        this.name = name;
        this.slogan = slogan;
        this.isImage = check;
    }

    public ContactVariableClass(String name, String slogan,boolean check) {
        this.name = name;
        this.slogan = slogan;
        this.isImage = check;
    }

    public int getImagePath() {
        return ImagePath;
    }

    public String getName() {
        return name;
    }

    public String getSlogan() {
        return slogan;
    }
}
