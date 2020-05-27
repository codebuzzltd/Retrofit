package com.example.checklink;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelClass {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("pathToFile")
    @Expose
    private String pathToFile;
    @SerializedName("categoryId")
    @Expose
    private String categoryId;

    public ModelClass() {
    }

    public ModelClass(String id, String pathToFile, String categoryId) {
        this.id = id;
        this.pathToFile = pathToFile;
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
