package com.valentsiukevich.csv_project.utils;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public class Property {
    private String key;
    private String value;

    public Property() {
        this.key = "";
        this.value = "";
    }

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[key='" + key + '\'' +
                "; value='" + value + '\'' +
                ']';
    }
}