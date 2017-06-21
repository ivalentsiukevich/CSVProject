package com.valentsiukevich.csv_project.readers;

import com.valentsiukevich.csv_project.models.Row;
import com.valentsiukevich.csv_project.models.Table;
import com.valentsiukevich.csv_project.readers.interfaces.ITableReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public class CSVTableReader implements ITableReader{
    @Override
    public Table read(String fileName) {
        Table table = new Table();
        Row row = null;
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((line=bufferedReader.readLine())!=null){
                String[] elements = line.split(",");
                row = new Row();
                for (String element: elements) {
                    row.addValue(element);
                }
                table.addRow(row);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return table;
    }
}
