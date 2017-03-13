package com.example.asheransari.whatsappcopy.variableClass;

/**
 * Created by asher.ansari on 3/12/2017.
 */

public class CallsVariableClass {
    private int ImagePath;
    private String name;
    private String detail;
    private int checkColor;

    public CallsVariableClass(int imagePath, String name, String detail, int checkColor) {
        this.ImagePath = imagePath;
        this.name = name;
        this.detail = detail;
        this.checkColor = checkColor;
    }

    public void setImagePath(int imagePath) {
        ImagePath = imagePath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setCheckColor(int checkColor) {
        this.checkColor = checkColor;
    }

    public int getImagePath() {
        return ImagePath;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public int getCheckColor() {
        return checkColor;
    }
}
