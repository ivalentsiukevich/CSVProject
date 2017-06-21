package com.valentsiukevich.csv_project.writers;

import com.valentsiukevich.csv_project.models.Row;
import com.valentsiukevich.csv_project.writers.interfaces.ITableWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public class TXTTableWriter implements ITableWriter {
    @Override
    public void write(ArrayList<Row> rows, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Row row : rows) {
                for (int i = 0; i < row.getValues().size(); i++) {
                    writer.write(row.getValue(i));
                    writer.write("\n");
                }
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
