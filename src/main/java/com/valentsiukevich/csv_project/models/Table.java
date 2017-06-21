package com.valentsiukevich.csv_project.models;

import java.util.ArrayList;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public class Table {
    private ArrayList<Row> rows;

    public Table(){
        this.rows = new ArrayList<>();
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }

    public void addRow(Row row){
        rows.add(row);
    }

    public ArrayList<Row> getRowsAllMatchingElements(String checkingValue){
        ArrayList<Row> result = new ArrayList<>();
        for (Row row: rows) {
            ArrayList<Integer> indexes = row.getIndexesAllMatchingElements(checkingValue);
            for (int index: indexes) {
                result.add(getColumn(index));
            }
        }
        return result;
    }

    public Row getColumn(int index){
        Row row = new Row();
        for (Row tableRow:rows) {
            row.addValue(tableRow.getValue(index));
        }
        return row;
    }
}
