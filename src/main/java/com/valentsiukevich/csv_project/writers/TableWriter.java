package com.valentsiukevich.csv_project.writers;

import com.valentsiukevich.csv_project.models.Row;
import com.valentsiukevich.csv_project.models.Table;
import com.valentsiukevich.csv_project.readers.interfaces.ITableReader;
import com.valentsiukevich.csv_project.utils.StringUtil;
import com.valentsiukevich.csv_project.writers.interfaces.ITableWriter;

import java.util.ArrayList;

/**
 * @author ilya_valentsiukevich
 * @version 1.0.0
 */
public class TableWriter implements ITableWriter {
    @Override
    public void write(ArrayList<Row> rows, String fileName) {
        String fileExtension = StringUtil.getFileExtension(fileName);
        switch (fileExtension) {
            case "csv": {
                CSVTableWriter csvTableWriter = new CSVTableWriter();
                csvTableWriter.write(rows, fileName);
                break;
            }
            case "txt": {
                TXTTableWriter txtTableWriter = new TXTTableWriter();
                txtTableWriter.write(rows, fileName);
                break;
            }
            default:{
                System.out.println("Invalid result file name!");
            }
        }
    }
}
