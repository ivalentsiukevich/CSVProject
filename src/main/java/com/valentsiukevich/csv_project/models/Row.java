package com.valentsiukevich.csv_project.models;

import java.util.ArrayList;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public class Row {
    private ArrayList<String> values;

    public Row(){
        this.values = new ArrayList<>();
    }

    public Row(ArrayList<String> values){
        this.values = values;
    }

    public ArrayList<String> getValues() {
        return values;
    }

    public void setValues(ArrayList<String> values) {
        this.values = values;
    }

    public String getValue(int index){
        return values.get(index);
    }

    public void addValue(String value){
        values.add(value);
    }

    public ArrayList<Integer> getIndexesAllMatchingElements(String checkingValue){
        ArrayList<Integer> indexes = new ArrayList<>();
        int index = 0;
        for (String value: values) {
            if (checkingValue.equals(value)){
                indexes.add(index);
            }
            index++;
        }
        return indexes;
    }
}
