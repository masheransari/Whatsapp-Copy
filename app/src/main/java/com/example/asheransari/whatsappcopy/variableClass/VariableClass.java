package com.example.asheransari.whatsappcopy.variableClass;

/**
 * Created by asher.ansari on 3/11/2017.
 */

public class VariableClass {
    private String name;
    private String detail;
    private int ImageID;

    public VariableClass(String name, String detail, int imageID) {
        this.name = name;
        this.detail = detail;
        ImageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public String getDetail() {
        return detail;
    }

    public int getImageID() {
        return ImageID;
    }
}
